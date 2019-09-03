//This is The Coding Area
#include<stdio.h>
#include<math.h>
void base6(int[],int);
int main()
{
  int n,N[50],i,inverse=0,j;
  scanf("%d",&n);
  if(n>50) return;
  for(i=0;i<n;++i)
  {
    scanf("%d,",&N[i]);
    if(N[i]>107) return;
  }
  base6(N,n);
 for(i=0;i<n-1;i++)
 {
     for(j=i;j<n;j++)
     {
         if(N[i]>N[j])
          ++inverse;
     }
 }
 printf("%d",inverse);
  return 0;
}

void base6(int N[],int s)
{
  int i,t,t1,t2,p,b6,sum;
  for(i=0;i<s;++i)
  {
    t=N[i];
    p=0;
    b6=0;
    sum=0;
    while(t>6)
    {
      b6+=((int)pow(10,p))*(t%6);
      ++p;
      t/=6;
    }
    b6+=((int)pow(10,p))*(t%6);
    while(b6!=0)
    {
        sum+=(b6%10);
        b6/=10;
    }N[i]=sum;
  }
}