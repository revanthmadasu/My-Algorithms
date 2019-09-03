#include<stdio.h>
#include<conio.h>
void main()
{
 int i,j,k;
 clrscr();
 for(i=0;i<=6;i++)
 {
  for(j=0;j<abs(3-i);j++)
   printf(" ");
  printf("*");
  if(i!=0&&i!=6)
  {
   for(k=0;k<5-2*abs(3-i);k++)
    printf(" ");
   printf("*");
  }
  printf("\n");
 }
 getch();
}