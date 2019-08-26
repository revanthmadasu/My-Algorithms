#include<stdio.h>
int main(void)
{
 void readmatrix(int x[3][3]);
 void multimatrix(int x[3][3],int y[3][3],int z[3][3]);
 void resultmatrix(int x[3][3]);
 int A[3][3],B[3][3],C[3][3];
 readmatrix(A);
 readmatrix(B);
 multimatrix(A,B,C);
 resultmatrix(C);
 return 0;
}

void readmatrix(int x[3][3])
{
 int i=0,j=0;
 printf("\nEnter values:");
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
  {
   scanf("%d",x[i][j]);
  }
 }
}

void multimatrix(int x[3][3],int y[3][3],int z[3][3])
{
 int i=0,j=0,c=0;
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
  {

   for(c=0;c<3;c++)
   {
    z[i][j]+=x[i][c]*y[c][j];

   }
  }
 }

}

void resultmatrix(int x[3][3])
{
 int i=0,j=0;
 for(i=0;i<3;i++)
 {
  printf("\n");
  for(j=0;j<3;j++)
   printf(" %d ",x[i][j]);
 }
}


