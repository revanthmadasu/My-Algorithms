#include<stdio.h>
void main()
{
 int A[10][10];
 int i=0,j=0,m,n,c=0;
 printf("\nEnter number of rows and columns:");
 scanf("%d%d",&m,&n);
 printf("\nEnter values:");
 for(i=0;i<m;i++)
  for(j=0;j<n;j++)
   scanf("%d",A[i][j]);
 if(m!=n)
  printf("\nThe matrix is not symmetric.");
 else
  for(i=0;i<m;i++)
   for(j=0;j<n;j++)
    if(A[i][j]==0-A[j][i])
     c++;
 if(c==m*n)
  printf("\nThe matrix is skew symmetric.");
 else
  printf("\nThe matrix is not skew symmetric.");
}


