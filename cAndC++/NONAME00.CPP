
#include<iostream.h>
#include<conio.h>
void main()
{
 int sum=3,i,j=0,k=3;
 for(i=0;i<7;i++)
 {
  if(i%2==0)
  {
   j+=k;
   --k;
  }
  sum+=j;
  cout<<" "<<sum;
  j++;
 }
 getch();
}