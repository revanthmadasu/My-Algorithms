#include<stdio.h>
#include<conio.h>
void quicksort(int a[],int low,int up);
void main()
{
 register int i;
 int a[15],n;
 printf("\nEnter the size:");
 scanf("%d",&n);
 printf("\nEnter the data to be sorted:");
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 quicksort(a,0,n);
 printf("\nThe sorted order is:");
 for(i=0;i<n;i++)
  printf(" %d",a[i]);
}

void quicksort(int a[],int low,int up)
{
 int pivot,i,j,temp;
 pivot=a[low];
 i=low+1;
 j=up;
 while(i<=j)
 {
  while((a[i]<pivot)&&(i<up))
   i++;
  while(a[j]>pivot)
   j--;
  if(i<j)
  {
   temp=a[i];
   a[i]=a[j];
   a[j]=temp;
  }
 }
 temp=a[low];
 a[low]=a[j];
 a[j]=temp;
 quicksort(a,low,j-1);
 quicksort(a,j+1,up);
}