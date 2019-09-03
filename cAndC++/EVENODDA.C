//count number of evens and no of odds in given n different numbers
#include<stdio.h>
main()
{
 int num[100],i=0,i1=0,n,even=0,odd=0;
 printf("\nEnter the no. of data to be entered:");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
  printf("\nEnter the number");
  scanf("%d",&num[i]);
 }
 for(i1=0;i1<n;i1++)
 {
  if(num[i1]%2==0)
   ++even;
  else
   ++odd;
 }
 printf("\nThere are %d even and %d odd numbers",even,odd);
 return 0;
}