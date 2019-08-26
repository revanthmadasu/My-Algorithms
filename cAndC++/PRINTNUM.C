//print numbers to 11-20 in word form
#include<stdio.h>
main()
{
 int n;
 printf("\nenter number:");
 scanf("%d",&n);
 switch(n)
 {
  case 11:printf("\neleven");break;
  case 12:printf("\ntwelve");break;
  default: printf("\nout of range");break;
 }
 return 0;
}
