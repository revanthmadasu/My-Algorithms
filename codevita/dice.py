# -*- coding: utf-8 -*-
"""
Created on Fri Aug  3 20:08:20 2018

@author: madas
"""

sum1=0
data=[[4, 6, 3, 8, 1, 1], [6, 3, 2, 6, 4, 9], [3, 2, 8, 9, 4, 5], [4, 3, 1, 2, 7, 8], [6, 5, 9, 7, 1, 7], [5, 7, 4, 4, 4, 7], [9, 7, 6, 7, 2, 9], [4, 9, 3, 2, 5, 9], [7, 3, 2, 5, 8, 8], [3, 3, 1, 7, 4, 9], [5, 7, 3, 9, 9, 4], [9, 6, 5, 4, 9, 5], [1, 7, 8, 1, 1, 1], [9, 6, 3, 6, 8, 4], [3, 5, 2, 6, 5, 5], [4, 2, 5, 2, 2, 5], [3, 2, 2, 1, 5, 1], [1, 2, 7, 5, 9, 5], [5, 6, 2, 6, 6, 9], [3, 8, 3, 4, 8, 1], [7, 5, 7, 1, 9, 9], [7, 1, 2, 8, 3, 8], [7, 6, 3, 1, 3, 6], [2, 2, 5, 7, 2, 8], [7, 3, 5, 3, 4, 8], [9, 3, 5, 5, 8, 4], [8, 1, 3, 2, 1, 3], [3, 2, 5, 9, 4, 7], [8, 5, 8, 5, 2, 8], [7, 7, 4, 6, 5, 7], [9, 4, 4, 3, 6, 9], [2, 5, 2, 2, 1, 4], [3, 7, 7, 9, 7, 5], [7, 2, 7, 6, 6, 1], [1, 7, 3, 9, 9, 7], [7, 1, 1, 1, 4, 8], [6, 9, 6, 6, 4, 6], [9, 8, 9, 2, 5, 8], [8, 8, 8, 9, 6, 8], [8, 1, 9, 2, 4, 6], [5, 8, 2, 2, 4, 9], [8, 9, 8, 3, 7, 1], [7, 1, 5, 1, 6, 8], [8, 9, 9, 4, 8, 1], [9, 3, 4, 4, 2, 6], [2, 6, 8, 9, 6, 2], [5, 9, 3, 1, 9, 4], [9, 2, 7, 4, 7, 3], [1, 7, 8, 2, 7, 8], [8, 4, 4, 4, 6, 2], [3, 4, 8, 6, 8, 4], [6, 6, 9, 3, 9, 6], [1, 1, 4, 6, 6, 2], [6, 4, 4, 5, 7, 4], [4, 2, 1, 2, 3, 1], [8, 9, 5, 3, 4, 6], [3, 3, 5, 8, 2, 5], [9, 7, 3, 8, 7, 3], [9, 3, 6, 5, 7, 1], [7, 7, 2, 9, 1, 9], [6, 8, 7, 4, 5, 4], [5, 8, 5, 4, 2, 4], [7, 3, 4, 5, 9, 4], [4, 4, 9, 1, 8, 3], [5, 3, 9, 1, 3, 1], [1, 9, 6, 1, 1, 1], [1, 3, 1, 2, 9, 7], [5, 7, 2, 9, 7, 6], [2, 5, 1, 8, 9, 5], [5, 1, 8, 4, 1, 4], [4, 5, 1, 2, 5, 3], [1, 6, 3, 4, 3, 6], [5, 8, 4, 5, 7, 5], [7, 5, 5, 7, 2, 4], [6, 7, 1, 6, 8, 7], [3, 3, 6, 3, 1, 6], [7, 6, 8, 9, 6, 9], [2, 4, 5, 7, 1, 4], [1, 8, 4, 8, 2, 5], [7, 5, 6, 9, 9, 8], [8, 8, 1, 8, 9, 5], [5, 2, 8, 4, 5, 1], [9, 8, 1, 6, 8, 9], [1, 8, 9, 3, 6, 3], [3, 4, 5, 6, 2, 8], [8, 5, 9, 5, 3, 2], [7, 6, 5, 9, 6, 5], [7, 2, 7, 8, 7, 8], [5, 7, 6, 6, 9, 2], [5, 7, 2, 6, 2, 5], [4, 1, 6, 9, 4, 9], [1, 3, 4, 7, 4, 5], [5, 8, 9, 7, 4, 1], [1, 3, 8, 4, 8, 9], [2, 8, 7, 4, 8, 3], [7, 3, 5, 2, 2, 8], [1, 6, 5, 4, 1, 1], [1, 2, 6, 9, 6, 9], [8, 5, 2, 7, 3, 8], [2, 1, 2, 4, 1, 2]]
cap=int(input())
totalcapacity=cap*30
overflow=0
buckets=[]
empty=0
for i in range(49):
    buckets.append(0)
for i in range(len(data)):
    sum1=0
    for j in range(6):
        sum1=sum1+data[i][j]
    if(buckets[sum1]>=cap):
        overflow=overflow+sum1
    if(buckets[sum1]+sum1>cap):
        overflow=overflow+sum1-(cap-buckets[sum1])
        buckets[sum1]=cap
    if(buckets[sum1]+sum1<=cap):
        buckets[sum1]=bucket[sum1]+sum1
totalcapacity=0
for i in range(49):
    totalcapacity=totalcapacity+buckets[i]
for i in buckets:
    if(cap-i>0):
        empty=empty+cap-i
print(totalcapacity)
print(overflow)

print(sum1)