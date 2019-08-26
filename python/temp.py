# -*- coding: utf-8 -*-
"""
Created on Sat Jan  5 22:23:29 2019

@author: madas
"""
def isVolatilePair(exlist,nmem,k):
    if len(exlist)==0:
        return False
    flag=False
    for mem in exlist:
        if mem<=nmem*k and nmem<=mem*k:
            flag=True
            break
    return flag

t=int(input())
for ti in range(0,t):
    inp=input().split(' ')
    l=int(inp[0])
    r=int(inp[1])
    k=int(inp[2])
    exlist=[]
    for i in range(l,r+1):
        if !isVolatilePair(exlist,i,k):
            exlist.append(i)
    print(len(exlist))