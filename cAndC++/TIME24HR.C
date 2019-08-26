#include<stdio.h>
#include<string.h>
struct Time
{
 int hrs;
 int mins;
 char m[3];
}time;
void main()
{
 char pm[]="pm";
 printf("\nEnter hours minutes and meridian");
 scanf("%d%d%s",&time.hrs,&time.mins,time.m);
 if(strcmp(time.m,pm)==0)
  time.hrs+=12;
 printf("\nThe time in 24 hour format is %d:%d",time.hrs,time.mins);
}