# -*- coding: utf-8 -*-
"""
Created on Sun Mar 31 17:49:39 2019

@author: madas
"""

t=int(input())
for ti in range(t):
    skip=False
    n=int(input())
    inp=input().split(" ")
    p=[]
    for i in inp:
        p.append(int(i))
    prev=0
    for i in p:
        if prev>i or i>26:
            print(-1)
            skip=True
        prev=i
    if skip:
        continue
    string=''
    pos=97
    prev=0
    for i in p:
        if i-prev==0:
            string=string+'a'
        elif i-prev==1:
            string=string+chr(pos)
            pos=pos+1
            prev=prev+1
        else:
            print(-1)
            skip=True
    if skip:
        continue
    print(string)