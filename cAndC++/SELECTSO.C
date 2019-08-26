#include<stdio.h>
void selectsort(int A[],int n);
void main()
{
 register int i;
 int A[20],n;
 printf("\nEnter the size:");
 scanf("%d",&n);
 printf("\nEnter the elements:");
 for(i=0;i<n;i++)
  scanf("%d",&A[i]);
 selectsort(A,n);
 printf("\nThe sorted order is:");
 for(i=0;i<n;i++)
  printf(" %d",A[i]);
}

void selectsort(int A[],int n)
{
 register int i,j;
 int temp,min;
 for(i=0;i<n-1;i++)
 {
  min=i;
  for(j=i+1;j<n;j++)
   if(A[j]<A[min])
    min=j;
  if(min!=i)
  {
   temp=A[i];
   A[i]=A[min];
   A[min]=temp;
  }
 }
}



