# -*- coding: utf-8 -*-
"""
Created on Sun Apr  7 16:40:11 2019

@author: madas
"""

n=int(input())
inp=input().split(' ')
A=[]
res=[]
for i in inp:
    A.append(int(i))
avg=sum(A)/n
for i in range(0,n):
    for j in range(i,n):
        lis=[]
        for k in range(i,j+1):
            lis.append(A[k])
        lisLen=len(lis)
        remainingLen=n-lisLen
        avg1=sum(lis)/lisLen
        if remainingLen!=0:
            avg2=(n*avg-lisLen*avg1)/remainingLen
        else:
            avg2=0
        #print('Sub array average: ',i,j,'avg1 =',avg1,' avg2=',avg2)
        if avg1>avg2:
            res.append([i,j])
print(len(res))
for i in res:
    print(i[0]+1,i[1]+1)