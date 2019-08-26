//multiplication of matrices using arrays
#include<stdio.h>
void main()
{
 void readmatrix(int x[3][3],int a,int b);
 void multmatrix(int x[3][3], int y[3][3],int z[3][3],int a,int b);
 void resultmatrix(int x[3][3], int a, int b);
 int A[3][3],B[3][3],C[3][3];
 readmatrix(A,3,3);
 readmatrix(B,3,3);
 multmatrix(A,B,C,3,3);
 resultmatrix(C,3,3);
}

void readmatrix(int x[3][3],int a,int b)
{
 int i=0,j=0;
 for(i=0;i<a;i++)
  for(j=0;j<b;j++)
  {
   printf("\nEnter value:");
   scanf("%d",&x[i][j]);
  }
 return;
}

void multmatrix(int x[3][3],int y[3][3],int z[3][3],int a,int b)
{
 int i=0,j=0,c=0;
 for(i=0;i<a;i++)
  for(j=0;j<b;j++)
  {
   z[i][j]=0;
   c=0;
   while(c<b)
   {
    z[i][j]+=x[i][j]*y[i][j];
    c++;
   }
  }

 return;
}

void resultmatrix(int x[3][3],int a,int b)
{
 int i=0,j=0;
 for(i=0;i<a;i++)
 {
  printf("\n");
  for(j=0;j<b;j++)
   printf("%d ",x[i][j]);
 }
 return;
}

