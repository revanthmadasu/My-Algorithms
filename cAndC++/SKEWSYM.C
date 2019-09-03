//test whether matrix is symmetric or not using functions
#include<stdio.h>
main()
{
 int a[10][10];
 int i=0,j=0,c=0;
 printf("\nEnter values:");
 for(i=0;i<3;i++)
  for(j=0;j<3;j++)
   scanf("%d",&a[i][j]);
 for(i=0;i<3;i++)
  for(j=0;j<3;j++)
   if(a[i][j]==-a[j][i])
    c++;
 if(c==9)
  printf("\nThe matrix is skew symmetric.");
 else
  printf("\nThe matrix is not skew symmetric.");
 return 0;
}