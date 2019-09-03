'use strict'

const functions = require('firebase-functions');
const admin=require('firebase-admin');
admin.initializeApp(functions.config().firebase);

exports.sendNotification=functions.database.ref('/Notifications/{user_id}/{notification_id}').onWrite((change,context)=>{

    const user_id=context.params.user_id;
    const notification_id = context.params.notification_id;

    console.log('We have a notification to send to :',user_id);

    if (!change.after.val()) {
        return console.log('A notification has been deleted from database: ', notification_id);
    }

    const fromUser=admin.database().ref(`/Notifications/${user_id}/${notification_id}`).once('value');
    return fromUser.then(fromUserResult=>{
        const from_user_id=fromUserResult.val().from;
        console.log('You have new notification from : ',from_user_id);
        
        const userQuery=admin.database().ref(`Users/${from_user_id}/name`).once('value');
        const deviceToken = admin.database().ref(`/Users/${user_id}/device_token`).once('value');

        return Promise.all([userQuery,deviceToken]).then(result=>{
            const userName=result[0].val();
            const token_id=result[1].val();

            const payload={
                notification: {
                    title:"Friend Request",
                    body:`${userName} has sent you friend request`,
                    icon:"default",
                    click_action:"com.revanth.apps.achat_TARGET_NOTIFICATION"
                },
                data: {
                    from_user_id : from_user_id
                }
            };

            return admin.messaging().sendToDevice(token_id,payload).then(response=>
            {
                return console.log('This was the notification feature');
            });
        }); 
    });
});

exports.sendmessageNotification=functions.database.ref('/messages/{current_user_id}/{another_user_id}/{message_id}').onWrite((change,context)=>{
    const current_user_id=context.params.current_user_id;
    const another_user_id=context.params.another_user_id;
    if(!change.after.val())
    {

    }
    const fromUser=admin.database().ref(`/messages/${current_user_id}/${another_user_id}/${message_id}`).once('value');
    if(fromUser==current_user_id)
    {
        return
    }
    else
    {
        return fromUser.then(fromUserResult=>{
            const from_user_id=fromUserResult.val().from;
            console.log('You have new notification from : ',from_user_id);
            
            const userQuery=admin.database().ref(`Users/${from_user_id}/name`).once('value');
            const deviceToken = admin.database().ref(`/Users/${user_id}/device_token`).once('value');
    
            return Promise.all([userQuery,deviceToken]).then(result=>{
                const userName=result[0].val();
                const token_id=result[1].val();
    
                const payload={
                    notification: {
                        title:"Friend Request",
                        body:`${userName} has sent you friend request`,
                        icon:"default",
                        click_action:"com.revanth.apps.achat_TARGET_NOTIFICATION"
                    },
                    data: {
                        from_user_id : from_user_id
                    }
                };
    
                return admin.messaging().sendToDevice(token_id,payload).then(response=>
                {
                    return console.log('This was the notification feature');
                });
            }); 
        });
    }
});