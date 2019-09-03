# -*- coding: utf-8 -*-
"""
Created on Sat Jul  7 00:52:05 2018

@author: madas
"""

line1=input()
line1=line1.split(',')
M=int(line1[0])
N=int(line1[1])
para=[[]]
for i in range(M):
    para[i].append(input())
    para.append([])
m=[[]]
i=0
m.pop()
for words in para:
    t=words[0].split(',')
    for t1 in t:
        m[i].append(int(t1))
    m.append([])
    i=i+1
    

        
        
    
