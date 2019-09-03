# -*- coding: utf-8 -*-
"""
Created on Wed Aug  1 21:29:28 2018

@author: madas
"""
import itertools
i=0
s=0
n=100
x=2
c=0
while(s+pow(i,x)<n):
    i=i+1
    s=s+pow(i,x)

print(i)
N=[]
for j in range(1,n+1):
    if pow(j,x)<=n:
        N.append(pow(j,x))

for j in range(0,i+1):
    for p in itertools.combinations(N,j):
        if sum(p)==n:
            print(p)
            c=c+1
print(c)




    
