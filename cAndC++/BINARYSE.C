#include<stdio.h>
#include<conio.h>
int binary(int a[],int key,int n);
void main()
{
 int i,n,a[30],key;
 clrscr();
 printf("Enter size\n");
 scanf("%d",&n);
 printf("Enter the elements\n");
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 printf("Enter key\n");
 scanf("%d",&key);
 i=binary(a,key,n);
 if(i==-1)
  printf("key not found\n");
 else
  printf("%d is found at location %d",key,++i);
  getch();
}

int binary(int a[],int key,int n)
{
 int i,low=0,high=n-1;
 int mid;
 while(low<=high)
 {
  mid=(low+high)/2;
  if(a[mid]==key)
   return mid;
  else
  {
   if(key<a[mid])
    high=mid;
   if(key>a[mid])
    low=mid;
  }
 }
}



