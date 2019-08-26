#include<stdio.h>
#include<conio.h>
int V[20][20],first,last,Q[40];
void enq(int);
int dq();
void main()
{
 int i,j,n,start;
 printf("Enter the number of vertices\n");
 scanf("%d",&n);
 printf("Enter the adjacency matrix\n");
 for(i=1;i<=n;i++)
  for(j=1;j<=n;j++)
   scanf("%d",&V[i][j]);
 printf("Enter the starting vertex\n");
 scanf("%d",&start);
 enq(start);
 while(last<=first)
 {
  i=dq();
  for(j=1;j<=n;j++)
  {
   if(V[i][j]!=0)
   {
    enq(j);
    V[j][i]=0;
    printf("%d-->%d\n",i,j);
   }
  }
 }
 getch();
}
void enq(int a)
{
 if(first>40)
  printf("Queue overflow");
 else
 {
  Q[first]=a;
  ++first;
 }
}
int dq()
{
 int t;
 if(last>first)
  printf("Queue Underflow");
 else
 {
  t=last;
  ++last;
  return Q[t];
 }
}