#include<iostream.h>
#include<stdio.h>
#include<conio.h>
void main()
{
 int n,f=0,f1,*types,c[5],i;
 cout<<"Enter the number of birds\n";
 cin>>n;
 types=new int[n];
 cout<<"Enter the ids\n";
 for(i=0;i<5;i++)c[i]=0;
 for(i=0;i<n;i++)
  cin>>types[i];
 for(i=0;i<n;i++)
  ++c[types[i]-1];
  for(i=0;i<5;i++)
   printf(" %d ",c[i]);
 for(i=0;i<5;i++)
  if(f<c[i]){
   f=c[i];
   f1=i;
  }
 cout<<"\nMost counted "<<f<<"\nbird id: "<<++f1;
 getch();
}