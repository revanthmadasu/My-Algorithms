#include<stdio.h>
#include<conio.h>
void main()
{
 int i,j,A[10][10],cost,n;
 printf("\nEnter the size of matrix");
 scanf("%d",&n);
 printf("\nEnter the elements of matrix");
 for(i=0;i<n;i++)
  for(j=0;j<n;j++)
   scanf("%d",&A[i][j]);
 cost=0;
 for(i=0;i<n;i++)
  for(j=0;j<n;j++)
   cost+=(i+1)*(j+1)*A[i][j];
 printf("\nThe cost is %d",cost);
 getch();
}