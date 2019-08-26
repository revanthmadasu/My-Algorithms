# -*- coding: utf-8 -*-
"""
Created on Fri Mar 29 22:29:51 2019

@author: madas
"""
def sortKey(lis):
    return lis[0]
n=int(input())
inp=input().split(" ")
x,y,z=int(inp[0]),int(inp[1]),int(inp[2])
metalTypeLimit=[x,y,z]

metals=[]
shop=[]
for i in range(n):
    shop.append(False)
    inp=input().split(" ")
    a,b,c=int(inp[0]),int(inp[1]),int(inp[2])
    
    metals.append([a,0,i])
    metals.append([b,1,i])
    metals.append([c,2,i])
metals.sort(key=sortKey,reverse=True)
#print(metals)
#print("Done")
money=0
for metal in metals:
    cost=metal[0]
    metalIndex=metal[1]
    shopIndex=metal[2]
    if metalTypeLimit[metalIndex]==0:
        continue
    if shop[shopIndex]:
        continue
    print(metal)
    money=money+cost
    shop[shopIndex]=True
    metalTypeLimit[metalIndex]=metalTypeLimit[metalIndex]-1
print(money)
    
    