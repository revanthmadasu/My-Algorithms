//multiplication of matrices from internet
#include<stdio.h>
int main()
{
 int m,n,p,q,c,d,k,sum=0;
 int first[10][10],second[10][10],multiply[10][10];
 printf("\nEnter the no. of rows and columns of first matrix:");
 scanf("%d%d",&m,&n);
 printf("\nEnter the elements of first matrx.");
 for(c=0;c<m;c++)
  for(d=0;d<n;d++)
   scanf("%d",&first[c][d]);
 printf("\nEnterthe no. of rows and columns of second matrix:");
 scanf("%d%d",&p,&q);
 if(n!=p)
  printf("\nThe matrices canot be multiplied with each other.");
 else
 {
  printf("\nEnter the numbers of second matrix.");
  for(c=0;c<p;c++)
   for(c=0;c<q;c++)
    scanf("%d",&second[c][d]);
  for(c=0;c<m;c++)
  {
   for(d=0;d<q;d++)
   {
    for(k=0;k<p;k++)
    {
     sum=sum+(first[c][k]+second[k][d]);
    }
    multiply[c][d]=sum;
    sum=0;
   }
  }
  printf("\nThe product of matrices is:");
  for(c=0;c<m;c++)
  {
   printf("\n");
   for(d=0;d<q;d++)
    printf("%d",multiply[c][d]);
  }
 }
 return 0;
}

