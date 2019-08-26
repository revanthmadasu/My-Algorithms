#include<stdio.h>
#include<conio.h>
void main()
{
 int n,N=1,i;
 printf("\nEnter n");
 scanf("%d",&n);
 for(i=n;i>0;i--)
  N*=i;
 i=0;
 while(N%10==0)
 {
  N/=10;
  ++i;
 }
 printf("\n%d",i);
 getch();
}