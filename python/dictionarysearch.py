# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 13:57:03 2018

@author: madas
"""

import sqlite3

conn = sqlite3.connect('Dictionary.db')

print("Opened database successfully")
key_word=input()
cursor = conn.execute("SELECT definition from entries where word='"+key_word+"'")
for row in cursor:
    print(row[0])