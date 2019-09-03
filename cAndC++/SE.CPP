#include<stdio.h>
void selectsort(int a[],int n);
int i,j;
void main()
{
 int n,A[20];
 printf("\nEnter the size of array:");
 scanf("%d",&n);
 printf("\nEnter the elemets of array:");
 for(i=0;i<n;i++)
  scanf("%d",&A[i]);
 selectsort(A,n);
 printf("\nThe sorted elements are:");
 for(i=0;i<n;i++)
  printf(" %d",A[i]);
}

void selectsort(int a[],int n)
{
 int temp;
 for(i=0
