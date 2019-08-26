#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
 int a[20],n,i,j,k=0;
 printf("\nEnter no. of elements");
 scanf("%d",&n);
 printf("\nEnter elements");
 for(i=n-1;i>=0;i--)
  scanf("%d",&a[i]);
 for(i=0;i<n;i++)
 {
  j=a[i]*(pow(2,i));
  k+=j;
 }
 printf("\nThe decimal of given binary number is %d",k);
 getch();
}