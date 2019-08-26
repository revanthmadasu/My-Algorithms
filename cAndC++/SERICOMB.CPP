/*
date:20/10/2015, 10:50P.M.
title: series of combinations from r=0 to r=n
*/
#include<stdio.h>
int main(void)
{
 int C,n,r,a,p=1,c=1,i;
 printf("\nEnter d:");
 scanf("%d",&d);
 for(n=0;n<=d;n++)
 {
  for(r=0;r<=n;r++)
  {
   for(i=1;i<=r;i++)
   {
    p*=n;
    n--;
   }
   for(a=1;a<=r;a++)
   {
    c*=r;
   }
   C=p/c;
   printf(" %d ",C);
  }
 }
 return 0;
}
