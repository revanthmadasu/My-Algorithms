# -*- coding: utf-8 -*-
"""
Created on Fri Jul  6 23:40:32 2018

@author: madas
"""
def nCr(n,r):
    f = math.factorial
    return f(n) / f(r) / f(n-r)
        
import math

n=int(input())
string=input()
lines=string.split(',');
lines1=set(lines)
sizes=[]
for line in lines1:
    sizes.append(lines.count(line))
c=1
a=0
b=0
m=[[]]
for i in sizes:
    b=0
    for j in range(0,i):
        m[a].append(c)
        c=c+1
        b=b+1
    m.append([])
    a=a+1
length=len(m)-1
if length<3:
    print("0")
else:
    i=0
    j=1
    k=2
    sum=0
    for i in range(0,length-2):
        for j in range(i+1,length-1):
            for k in range(j+1,length):
                sum=sum+(nCr(len(m[i]),1)*nCr(len(m[j]),1)*nCr(len(m[k]),1))
    print(int(sum))           



    