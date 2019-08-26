#include<stdio.h>
void main()
{
 int N,i,c,j;
 long long int S[100];
 scanf("%d",&N);
 for(i=0;i<N;i++)
  scanf("%lld",&S[i]);
 for(i=0;i<N;i++)
 {
  j=i;
  c=0;
  while(j>=0)
  {
   if(S[i]%S[j]==0)
    c++;
    j--;
  }
  if(c==1)
   printf(" %d",S[i]);
 }
}

