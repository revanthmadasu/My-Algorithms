# -*- coding: utf-8 -*-
"""
Created on Sat Mar 30 20:12:25 2019

@author: madas
"""

class Group:
    def __init__(self,num):
        self.members=[]
        self.num=num
        self.members.append(num)
        self.minimum=num
        self.maximum=num
        print(self.members)
        
    def mergeGroup(self,anotherGroupMembers,minimum,maximum):
        for i in anotherGroupMembers:
            self.members.append(i)
        self.maximum=maximum
        self.minimum=minimum
    def myPrint(self):
        print(self.minimum," ",self.maximum)
     
n=int(input())
inp=input().split(" ")
A=[]
map={}
for i in inp:
    A.append(int(i))
for i in A:
    map[i]=Group(i)
q=int(input())
for i in range(q):
    query=input().split(" ")
    if int(query[0])==1:
        tempGroup1=map[A[int(query[1])-1]]
        group1Members=tempGroup1.members
        max1=tempGroup1.maximum
        min1=tempGroup1.minimum
        
        tempGroup2=map[A[int(query[2])-1]]
        group2Members=tempGroup2.members
        max2=tempGroup2.maximum
        min2=tempGroup2.minimum
        
        if max1>max2:maxi=max1
        else:maxi=max2
        if min1<min2:mini=min1
        else:mini=min2
        
        tempGroup1.mergeGroup(group2Members,mini,maxi)
        
        for i in group2Members:
            map[i]=tempGroup1
    else:
        x=int(query[1])-1
        group=map[A[x]]
        print(group.maximum-group.minimum)
        