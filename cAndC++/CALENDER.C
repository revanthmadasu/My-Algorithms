#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main(void)
{
 long int d=0;
 int leapcount(int d1,int m1,int y1);
 int m,y,x=28,c;
 printf("\nEnter date and month and year:");
 scanf("%ld/%d/%d",&d,&m,&y);
 c=leapcount(d,m,y);
 d+=((y-1)*365);
 d=labs(d);
 switch(m)
 {
  case 1:d+=0+c;break;
  case 2:d+=31+c;break;
  case 3:d+=31+x+c;break;
  case 4:d+=31+x+31+c;break;
  case 5:d+=31+x+31+30+c;break;
  case 6:d+=31+x+31+30+31+c;break;
  case 7:d+=31+x+31+30+31+30+c;break;
  case 8:d+=31+x+31+30+31+30+31+c;break;
  case 9:d+=215+x+c;break;
  case 10:d+=215+x+30+c;break;
  case 11:d+=245+x+31+c;break;
  case 12:d+=245+x+31+30+c;break;
  default:printf("\nSomething went wrong");
 }
 d=labs(d);
 printf("\nTotal days occured are %ld",d);
 while(d>7)
  d%=7;
 switch(d)
 {
  case 4:printf("\nthursday");break;
  case 5:printf("\nfriday");break;
  case 6:printf("\nsaturday");break;
  case 0:printf("\nsunday");break;
  case 1:printf("\nmonday");break;
  case 2:printf("\ntuesday");break;
  case 3:printf("\nwednesday");break;
  default: printf("\nsomething went wrong while generating days");break;
 }
 getch();
 return 0;
}

int leapcount(int d1,int m1, int y1)
{
 int a,b;
 a=y1;
 while(a%4!=0)
  a--;
  b=a/4;
 if(y1%4==0&&m1<=2)
  --b;
  printf("%d leap years have been occured",b);
 return b;
}