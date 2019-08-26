/* this program adds and substracts decimal numbers using 1's compliment
   writen by a guy from 2nd yr IT*/
#include<iostream.h>
#include<math.h>
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

class binary_num
{
 public: int bn[16],n;
 binary_num()
 {
  int N,j=15;
  cout<<"Enter a number\n";
  cin>>n;
  N=abs(n);
  while(N!=1)
  {
   if(N%2==0)
    bn[j]=0;
   else
   {
    bn[j]=1;
    --N;
   }
   N/=2;
   --j;
  }
  bn[j]=N;
 } 
}

void substract(binary_num,binary_num);
void binary(int ,int[]);
void print(int[]);
void onecomp(int[]);
void addbinary(int[],int[],int[]);
int decimal(int[]);

void main()
{
 binary_num A,B;
 int C[16]={0},d;
 cout<<"Binary equivalent of "<<A.n<<"is ";
 print(&A.n);
 cout<<"Binary equivalent of "<<B.n<<"is ";
 print(&B.n);
 if((A.n>=0&&B.n>=0)||(A.n<=0&&B.n<=0))
 {
  addbinary(A.bn,B.bn,C);
  cout<<"\nThe sum is:";
  print(C);
  d=decimal(C);
  if(A.n<0)
   d=-d;
  cout<<"\nDecimal form is"<<d;
  getch();
  exit(1);
 }
 else
 {
  if(A.n>0)
   substract(A,B);
  if(B.n>0)
   substract(B,A);
 }
 getch();
}

void substract(binary_num X,binary_num Y)
{
 int b1[16]={0},final[16]={0},C[16]={0};
 if(abs(X.n)>=abs(Y.n))
 {
  onecomp(Y.bn);
  addbinary(X.bn,Y.bn,C);
  binary(1,b1);
  addbinary(C,b1,final);
  printf("\nThe sum is :");
  print(final);
  cout<<"\ndecimal form is "<<decimal(final);
 }
 if(abs(X.n)<abs(Y.n))
 {
  onecomp(Y.bn);
  addbinary(X.bn,Y.bn,C);
  onecomp(C);
  printf("\nThe sum is :");
  print(C);
  cout<<"\ndecimal form is "<<-decimal(C);
 }
}

void binary(int N,int bn[16])
{
 int n,j=15;
 n=N;
 n=abs(n);
 while(n!=1)
 {
  if(n%2==0)
   bn[j]=0;
  else
  {
   bn[j]=1;
   --n;
  }
  n/=2;
  --j;
 }
 bn[j]=n;
 return;
}

void print(int bn[16])
{
 int j;
 for(j=0;j<16;j++)
  printf(" %d",bn[j]);
}

int decimal(int n[])
{
 int sum=0,i,n1,sz=16,j;
 for(i=0;i<sz;i++)
 {
  n1=sz-1-i;
  j=n[i]*pow(2.0,n1);
  sum+=j;
 }
 return sum;
}

void onecomp(int A[])
{
 int i;
 for(i=0;i<16;i++)
  if(A[i]==0)
   A[i]=1;
  else
   A[i]=0;
 return;
}

void addbinary(int A[16],int B[16],int C[16])
{
 int i;
 for(i=15;i>=0;i--)
 {
  C[i]=A[i]+B[i]+C[i];
  if(i!=0)
   C[i-1]=C[i]/2;
  C[i]%=2;
 }
 return;
}
 





 
 
 