#include<stdio.h>
#include<conio.h>
void quicksort(int a[20],int low,int up);
void main()
{
 register int i;
 int a[15],n;
 printf("\nEnter the size:");
 scanf("%d",&n);
 printf("\nEnter the data to be sorted:");
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 quicksort(a,0,n-1);
 printf("\nThe sorted order is:");
 for(i=0;i<n;i++)
  printf(" %d",a[i]);
}

void quicksort(int a[],int low,int up)
{
 int pivot,i,j,temp;
 if(low<up)
 {
  pivot=low;
 i=low;
 j=up;
 while(i<j)
 {
  while((a[i]<a[pivot])&&(i<up))
   i++;
  while(a[j]>a[pivot])
   j--;
  if(i<j)
  {
   temp=a[i];
   a[i]=a[j];
   a[j]=temp;
  }
 }
 temp=a[pivot];
 a[pivot]=a[j];
 a[j]=temp;
 quicksort(a,low,j-1);
 quicksort(a,j+1,up);
 }
}