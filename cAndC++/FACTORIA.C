//FACTORIAL PROGRAM
#include<stdio.h>
#include<conio.h>
void main()
{
 int n,p=1,n1;
 printf("Eter a number\n");
 scanf("%d",&n);
 n1=n;
 while(n1>=1)
 {
  p*=n1;
  n1--;
 }
 printf("Factorial of %d is %d",n,p);
 getch();
}