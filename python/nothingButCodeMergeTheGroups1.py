# -*- coding: utf-8 -*-
"""
Created on Sun Mar 31 20:12:21 2019

@author: madas
"""

n=int(input())
inp=input().split(" ")
A=[]
teamNos=[]
mins={}
maxs={}

result={}
t=0
for i in inp:
    local=int(i)
    A.append(local)
    mins[t]=local
    maxs[t]=local
    
    teamNos.append(t)
    t=t+1
    
q=int(input())
for i in range(q):
    query=input().split(" ")
    if int(query[0])==1:
        x=int(query[1])-1
        y=int(query[2])-1
        teamNox=teamNos[x]
        teamNoy=teamNos[y]
        t=0
        while t<n:
            if teamNos[t]==teamNoy:
                teamNos[t]=teamNox
            t=t+1
        if mins[teamNox]>mins[teamNoy]:
            mins[teamNox]=mins[teamNoy]
        if maxs[teamNox]<maxs[teamNoy]:
            maxs[teamNox]=maxs[teamNoy]
    else:
        x=int(query[1])-1
        mini=A[x]
        maxi=A[x]
        currentTeam=teamNos[x]
        t=0
        while t<n:
            if teamNos[t]==currentTeam:
                if mini>A[t]:
                    mini=A[t]
                if maxi<A[t]:
                    maxi=A[t]
            t=t+1
        diff=maxi-mini
        print(maxs[currentTeam]-mins[currentTeam])