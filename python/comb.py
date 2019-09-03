# -*- coding: utf-8 -*-
"""
Created on Fri Jan 12 09:33:35 2018

@author: madas
"""
from itertools import combinations
comb=combinations([1,3,6,8,10,11],3)
"""for i in list(comb):
    print(i)"""
a=list(comb)
b=[]
for i in range(len(a)):
    b.append(sum(a[i]))
print("Printing the sum")
for i in b:
    print(i)
c=[]
for i in range(len(b)):
    cn=0
    for j in range(len(b)):
        if(b[i]==b[j] and i!=j):
            cn=cn+1
            print("b[i] is ",b[i]," b[j] is ",b[j]," cn is ",cn)
    if(cn==0):
        c.append(b[i])
print("Printing the unique sums")
for i in c:
    print(i)
print(sum(c))






