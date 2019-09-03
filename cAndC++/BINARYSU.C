/*This program sums numbers using 1's compliment
Date-19/7/16 */
#include<math.h>
#include<stdio.h>
#include<conio.h>
int decimal(int[]);
void binary(int ,int[]);
void print(int[]);
void onecomp(int[]);
void addbinary(int[],int[],int[]);
void main()
{
 int A[16]={0},B[16]={0},C[16]={0},a,b,b1[16]={0},final[16]={0},d;
 clrscr();
 printf("\nEnter two numbers");
 scanf("%d %d",&a,&b);
 binary(a,A);
 binary(b,B);
 printf("\nBinary equivalent of %d is ",a);
 print(A);
 printf("\nBinary equivalent of %d is ",b);
 print(B);
 if((a>=0&&b>=0)||(a<0&&b<0))
 {
  addbinary(A,B,C);
  printf("\nThe sum is:");
  print(C);
  d=decimal(C);
  if(a<0)//sum of all negatives is negative 
   printf("\nDecimal form is %d",-d);
  else
  printf("\ndecimal form is %d",d);
  getch();
  exit(1);
 }
 if(abs(a)>=abs(b))
 {
  onecomp(B);
  addbinary(A,B,C);
  binary(1,b1);
  addbinary(C,b1,final);
  printf("\nThe sum is :");
  print(final);
  d=decimal(final);
  if(a<0)
   printf("\ndecimal form is %d",-d);
  else
   printf("\nDecimal form is %d",d);
 }
 if(abs(a)<abs(b))
 {
  onecomp(B);
  addbinary(A,B,C);
  onecomp(C);
  printf("\nThe sum is :");
  print(C);
  d=-decimal(C);
  printf("\ndecimal form is %d",d);
 }
 getch();
}

void binary(int N,int bn[16])//converts to binary
{
 int n,j=15;
 n=abs(N);//abs(int) is an absolute function which returns the postive value and i am using it because to avoid -1 in place of 1
 while(j>=0)
 {
  bn[j]=n%2;
  n/=2;
  --j;
 }
 return;
}

void print(int bn[16])
{
 int j;
 for(j=0;j<16;j++)
  printf(" %d",bn[j]);
}

int decimal(int n[])//returns the decimal equivalent
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
 for(i=15;i>=0;i--)//the array elements of C are initiated to 0 when declared
 {
  C[i]=A[i]+B[i]+C[i];// i am also adding C[i] because it is treated as carry
  if(i!=0)//if carry is obtained in addition, it is passed to its left member
   C[i-1]=C[i]/2;
  C[i]%=2;
 }
 return;
}