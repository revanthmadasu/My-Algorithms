#include<stdio.h>
#include<string.h>
#include<conio.h>
void main()
{
 int hh,mm,ss;
 char m[2];
 scanf("%d:%d:%d%s",&hh,&mm,&ss,m);
 if(strcmp(m,"PM")==0&&hh!=12)
  hh+=12;
 if(strcmp(m,"AM")==0&&hh==12)
  hh=0;
 printf("\n%02d:%02d:%02d",hh,mm,ss);
 getch();
}



