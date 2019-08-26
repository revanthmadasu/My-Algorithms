#include<stdio.h>
void insertsort(int A[],int n);
void main()
{
 register int i;
 int A[20],n;
 printf("\nEnter the size:");
 scanf("%d",&n);
 printf("\nEnter the elements:");
 for(i=0;i<n;i++)
  scanf("%d",&A[i]);
 insertsort(A,n);
 printf("\nThe sorted order is:");
 for(i=0;i<n;i++)
  printf(" %d",A[i]);
}

void insertsort(int A[],int n)
{
 register int i,j;
 int temp;
 for(i=1;i<n;i++)
 {
  j=i;
  while(j>0&&A[j]<A[j-1])
  {
   temp=A[j];
   A[j]=A[j-1];
   A[j-1]=temp;
   j--;
  }
 }
}



