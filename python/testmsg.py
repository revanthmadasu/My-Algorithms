# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 12:54:51 2018

@author: madas
"""

personal_details={"full name":"My full name isRevanth Kumar Madasu","email":"My email is revanthmadasu913@gmail.com","blood Group":"My blood group is O Positive"}
default="Currently in a meeting i'll be free at 6 in evening"
msg=input()
flag=0
keys=msg.split(" ")
for x,y in personal_details.items():
    for key in keys:
        if(x.find(key)!=-1):
            print("key=",key," ",y)
            flag=1
if(flag==0):
    print(default)

