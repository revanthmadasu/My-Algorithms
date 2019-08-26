#include<math.h>
#include<stdio.h>
#include<conio.h>
void decimal(int[]);
void main()
{
 int bn[8]={0},N,n,j=7;
 printf("\nEnter the number");
 scanf("%d",&N);
 n=N;
 if(n>=0)
  bn[0]=0;
 else
  bn[0]=1;
 n=abs(n);
 while(n!=1)
 {
  if(n%2==0) bn[j]=0;
  else
  {
   bn[j]=1;
   --n;
  }
  n/=2;
  --j;
 }
 bn[j]=n;
 printf("\nThe binary euivalent of %d is",N);
 for(j=0;j<8;j++)
  printf(" %d",bn[j]);
 decimal(bn);
 getch();
}

void decimal(int n[])
{
 int sum=0,i,n1,sz=8,j;
 printf("\n");
 for(i=0;i<sz;i++)
 {
  n1=sz-1-i;
  j=n[i]*pow(2.0,n1);
  sum+=j;
 }
 printf("\nDecimal form=%d",sum);
}