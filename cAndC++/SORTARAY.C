#include<stdio.h>
int main()
{
 int A[20],i,j,temp,n;
 printf("\nEnter the size of array:");
 scanf("%d",&n);
 printf("\nEnter the elements of the array:");
 for(i=0;i<n;i++)
  scanf("%d",&A[i]);
 for(i=0;i<n;i++)
  for(j=0;j<n;j++)
   if(i!=j&&j!=n&&A[i]<A[j])
   {
    temp=A[i];
    A[i]=A[j];
    A[j]=temp;
   }
 printf("\nThe elements after sorting is:");
 for(i=0;i<n;i++)
  printf("%d ",A[i]);
 return 0;
}

