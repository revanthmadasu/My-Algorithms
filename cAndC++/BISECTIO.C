#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<stdlib.h>
int f(int x);
int main()
{
 int y,x,xn,xp,yn,yp,xz,yz;
 for(x=-20;x<=20;x++)
 {
  y=f(x);
  if(y<0&&y>f(x+1))
  {
   xn=x;
   yn=y;
  }
  if(y>0&&y<f(x+1))
  {
   xp=x;
   yp=y;
  }
 }
 printf("\nThe xn xp yn yp is %d %d %d %d",xn,xp,yn,yp);
 return 0;
}

int f(int x)
{
 int n,y=0,i=0,A[20];
 printf("\nEnter the degree:");
 scanf("%d",&n);
 printf("\nEnter the coeficiants:");
 for(i=0;i<=n;i++)
  scanf("%d",&A[i]);
 while(n!=-1)
 {
  y+=A[i]*pow(x,n);
  n--;
  i++;
 }
 printf("\nThe f(x) is %d",y);
 return y;
}