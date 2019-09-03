# -*- coding: utf-8 -*-
"""
Created on Fri Mar 22 23:56:51 2019

@author: madas
"""

factorials={0:1,1:1,2:2}
def factorial(n,greatestFactorialYet,sum1):
    yesOrNo='NO'
    if n==1 or n==0:return 2,"YES"
    elif(factorials.get(n)==None):
        for i in range(greatestFactorialYet+1,n+1):
            factorials[i]=factorials[greatestFactorialYet]*i
            greatestFactorialYet=i
            if factorials[i]%sum1==0:
                yesOrNo='YES'
                break
            
    return greatestFactorialYet,yesOrNo

t=int(input())
greatestFactorialYet=2
for ti in range(t):
    n=int(input())
    sum1=(n*(n+1))//2
    result=factorial(n,greatestFactorialYet,sum1)
    greatestFactorialYet=result[0]
    yesOrNo=result[1]    
    print(yesOrNo)