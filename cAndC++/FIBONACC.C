#include<stdio.h>
#include<conio.h>
long fibonacci(long);
long n;
void main()
{
 int size,i;
 printf("Enter the extent upto which you want fibonacci series:\n");
 scanf("%d",&size);
 for(i=0;i<size;i++)
 {
  printf("%ld,\t",fibonacci(n));
  n++;
 }
 getch();
}

long fibonacci(long x)
{
 if(x==0||x==1)
  return x;
 else
  return(fibonacci(x-1)+fibonacci(x-2));
}
