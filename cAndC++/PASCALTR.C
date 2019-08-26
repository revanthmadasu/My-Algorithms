/*
date:20/10/2015, 12:13A.M.
title: pascal triangle
*/
#include<stdio.h>
int main(void)
{
 int d,i,n,r,p=1,c=1,comb;
 printf("\nEnter digit: ");
 scanf("%d",&d);
 for(n=0;n<=d;n++)
 {
  for(r=0;r<=n;r++) //decision r=0 or r=1
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
   comb=p/c;
   printf(" %d ",comb);
  }
  printf("\n %d ",comb);
 }
 return 0;
}