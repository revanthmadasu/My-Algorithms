# -*- coding: utf-8 -*-
"""
Created on Sun Feb 17 17:57:42 2019

@author: madas
"""
keys=["email","contact","free","appointment","feel","health","phone"]
messages=["my email id is revanthmadasu913@gmail.com","Appointment details are ","i am not feeling well","my number is 938174316"]

keyIndices=[1,2,2,3,3,4,5,6,7]
messageIndices=[1,1,4,2,3,2,3,3,4]

matchedKeyIndices=[]

receivedMessage=input().split(' ')

n=len(keys)
for word in receivedMessage:
    for i in range(0,n):
        if keys[i]==word:
            matchedKeyIndices.append(i+1)
if len(matchedKeyIndices)==0:
    replyMessage="Sorry I am at work. Talk to you at 5pm"
    print(replyMessage)
else:
    replyMessages=[]
    n=len(keyIndices)
    for matchedKeyIndex in matchedKeyIndices:
        for i in range(0,n):
            if keyIndices[i]==matchedKeyIndex:
                messageIndex=messageIndices[i]
                replyMessages.append(messages[messageIndex-1])                
    for message in replyMessages:
        print(message)
    