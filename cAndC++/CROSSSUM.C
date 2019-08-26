#include<stdio.h>
#include<conio.h>
void main()
{
 int n,S,i;
 printf("Enter a number\n");
 scanf("%d",&n);
 while(n/10!=0)
 {
  S=0;
  while(n!=0)
  {
   S+=n%10;
   n/=10;
  }
  n=S
 }
 printf("n is %d\tS is %d",n,S);
 getch();
}