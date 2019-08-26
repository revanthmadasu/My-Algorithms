#include<stdio.h>
int i,j;
void mult(float lu[3][3],float yx[3],float by[3]);
void main()
{
 int A[3][3],B[3];
 float L[3][3],U[3][3];
 float X[3],Y[3];
 printf("\nEnter the coefficiants of x,y,z:");
 for(i=0;i<3;i++)
  for(j=0;j<3;j++)
   scanf("%d",&A[i][j]);
 printf("\nEnter the constants:");
 for(i=0;i<3;i++)
  scanf("%d",&B[i]);
 for(i=0;i<3;i++)
  for(j=0;j<3;j++)
  {
   L[i][j]=0;
   U[i][j]=0;
  }
 for(i=0;i<3;i++)
  U[i][i]=1;
 L[0][0]=A[0][0];
 U[0][1]=A[0][1]/L[0][0];
 U[0][2]=A[0][2]/L[0][0];
 L[1][0]=A[1][0];
 L[1][1]=A[1][1]-(L[1][0]*U[0][1]);
 U[1][2]=(A[1][2]-(L[1][0]*U[0][2]))/L[1][1];
 L[2][0]=A[2][0];
 L[2][1]=A[2][1]-(L[2][0]*U[0][1]);
 L[2][2]=A[2][2]-(L[2][1]*U[1][2])-(L[2][0]*U[0][2]);
 printf("\nL =");
 for(i=0;i<3;i++)
 {
  printf("\n");
  for(j=0;j<3;j++)
   printf("\t%f",L[i][j]);
 }
 printf("\nU  =");
 for(i=0;i<3;i++)
 {
  printf("\n");
  for(j=0;j<3;j++)
   printf("\t%f",U[i][j]);
 }
 mult(L,Y,B);
 printf("\nY  is :");
 for(i=0;i<3;i++)
  printf("\n%f",Y[i]);
 mult(U,X,Y);
 for(i=0;i<3;i++)
  printf("\nx[%d]\t=\t%f",i,X[i]);
}

void mult(float lu[3][3],float yx[3],float by[3])
{
 printf("//////////////////mult/////////////////");
 if(lu[0][1]==0&&lu[0][2]==0&&lu[1][2]==0)
  {
   yx[0]=by[0]/lu[0][0];
   yx[1]=(by[1]-(lu[1][0]*yx[0]))/lu[1][1];
   yx[2]=(by[2]-(lu[2][0]*yx[0])-(lu[2][1]*yx[1]))/lu[2][2];
   printf("\n");
   for(int i=0;i<3;i++)
      printf("Y[%d] is %f",i,yx[i]);
    }
 if(lu[1][0]==0&&lu[2][0]==0&&lu[2][1]==0)
    {
     yx[2]=by[2];
     yx[1]=by[2]-(lu[1][2]*yx[2]);
     yx[0]=by[0]-(lu[0][1]*yx[1])-(lu[0][2]*yx[2]);
    }
   }
 return;
}

