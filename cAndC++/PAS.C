/*
date:19/10/2015
title: pascal triangle using combination
*/
#include<stdio.h>
int main(void)
{
 int d,i,n,r,p=1,c=1,combination;
 printf("\nEnter d");
 scanf(" %d ",&d);
 for(n=0;n<=d;n++)
 {
  for(r=0;r<=n;r++)
  {
   for(i=1;i<=r;i++)
   {
    p=p*n;
    n--;
   }
   for(r;r>=1;r--)
   {
    c=c*r;
   }
   combination=p/c;
   printf("\nThe combination is %d",combination);
  }
 }
  return 0;
}