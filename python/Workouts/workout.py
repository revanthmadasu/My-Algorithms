# -*- coding: utf-8 -*-
"""
Created on Sun Oct 14 01:06:40 2018

@author: madas
"""

import sqlite3

conn=sqlite3.connect('workouts.db')
weekdays={'monday':[],'tuesday':[],'wednesday':[],'thursday':[],'friday':[],'saturday':[]}

cursor=conn.execute('select * from monday;')
for each in cursor:
    weekdays['monday'].append(each[0])
cursor=conn.execute('select * from tuesday;')
for each in cursor:
    weekdays['tuesday'].append(each[0])
cursor=conn.execute('select * from wednesday;')
for each in cursor:
    weekdays['wednesday'].append(each[0])
cursor=conn.execute('select * from thursday;')
for each in cursor:
    weekdays['thursday'].append(each[0])
cursor=conn.execute('select * from friday;')
for each in cursor:
    weekdays['friday'].append(each[0])
cursor=conn.execute('select * from saturday;')
for each in cursor:
    weekdays['saturday'].append(each[0])
while True:
    currentdayname=input('Enter day')
    if currentdayname=='close':
        break
    while True:
        exercise=input("Enter Exercise")
        if exercise=='done':
            break
        workingarea=input("Enter Working area")
        intensity=input("Enter Intensity")
        flag=0
        existingdays=''
        for day in weekdays:
            if exercise in weekdays[day]:
                flag=1
                existingdays=existingdays+day+' '
        if flag==1:
            print("Already exists in ",existingdays)
            flag=int(input("Enter 1 if you still want to add"))
        if flag==1:
            query='insert into '+currentdayname+' values("'+exercise+'","'+workingarea+'","'+intensity+'");'
            print(query)
            conn.execute(query)
            cursor=conn.execute('select count() from '+currentdayname)
            for count in cursor:
                print("No of workouts: ",count[0])
        cursor=conn.execute('select * from '+currentdayname+';')
        weekdays[currentdayname]=[]
        for each in cursor:
            weekdays['monday'].append(each[0])
conn.commit()
conn.close()
            
    
