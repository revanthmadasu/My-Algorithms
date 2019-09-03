#include<stdio.h>
#include<conio.h>
void main()
{
 int i,j,k,n;
 printf("\nEnter the order:");
 scanf("%d",&n);
 clrscr();
 for(i=0;i<n;i++)
 {
  for(j=0;j<abs(((n-1)/2)-i);j++)
   printf(" ");
  printf("*");
  if(i!=0&&i!=(n-1))
  {
   for(k=0;k<(n-2)-2*abs(3-i);k++)
    printf(" ");
   printf("*");
  }
  printf("\n");
 }
 getch();
}