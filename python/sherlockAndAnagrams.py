# -*- coding: utf-8 -*-
"""
Created on Thu Jan 30 14:24:21 2020

@author: INCT-RevanthKumar
problem: https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
concepts: Strings
"""

import math
import os
import random
import re
import sys

# Complete the sherlockAndAnagrams function below.
def sherlockAndAnagrams(s):
    l=len(s)
    total = 0
    for sub_len in range(1,l+1):
        sub_strings = dict()
        for i in range(0,l-sub_len+1):
            sub_string=''.join(sorted(s[i:i+sub_len]))
            if sub_strings.get(sub_string):
                sub_strings[sub_string] += 1
            else:
                sub_strings[sub_string] = 1
        #print(sub_strings)
        for sub_string in sub_strings.keys():
            tmp = sub_strings[sub_string]
            if tmp > 1:
                total += (tmp*(tmp-1))/2
    
    return int(total)
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = sherlockAndAnagrams(s)

        fptr.write(str(result) + '\n')

    fptr.close()