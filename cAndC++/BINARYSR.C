#include<stdio.h>
int t;
int binarysrch(int A[],int n,int key);
void main()
{
 int A[20],n,key,i,location;
 printf("\nEnter the size:");
 scanf("%d",&n);
 printf("\nEnter the elements:");
 for(i=0;i<n;i++)
  scanf("%d",&A[i]);
 printf("\nEnter the key to be searched:");
 scanf("%d",&key);
 location=binarysrch(A,n,key);
 if(t==1)
  printf("\nThe %d is found at location %d",key,location+1);
 else
  printf("\nKey not found");
}

int binarysrch(int A[],int n,int key)
{
 int low=0,high=n,mid;
 mid=(low+high)/2;
 while(low<high)
 {
  if(key==A[mid])
   break;
  if(key<A[mid])
   high=mid-1;
  if(key>A[mid])
   low=mid+1;
  mid=(low+high)/2;
 }
 if(key==A[mid])
  t=1;
 return mid;
}







