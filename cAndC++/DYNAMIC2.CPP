#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
void main()
{
 int *A,i,j,r,c;
 clrscr();
 printf("Enter the number of rows and columns\n");
 scanf("%d%d",&r,&c);
 A=(int*)malloc(r*c*2);
 printf("Enter the elements\n");
 for(i=0;i<r;i++)
  for(j=0;j<c;j++)
  scanf("%d",(A+(i*c)+j));
 for(i=0;i<r;i++)
 {
  printf("\n");
  for(j=0;j<c;j++)
   printf(" %d",*(A+i*c)+j);
 }
 getch();
}