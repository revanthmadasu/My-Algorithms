#include<iostream.h>
#include<conio.h>
void main()
{
 clrscr();
 int sum=3,i,j=1,k=3;
 for(i=0;i<7;i++,j++)
 {
  cout<<sum<<" ";
  if(i%2==0)
  {
   j+=k;
   --k;
  }
  sum+=j;
 }
 getch();
}