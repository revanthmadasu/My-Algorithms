#include<stdio.h>
#include<conio.h>
void main()
{
 FILE *f1, *f2 , *f3;
 int num=1;
 printf("Enter numbers and ente -1 to end copying\n")         ;
 f1=fopen("Numbers.txt","w");
 while(num!=-1)
 {
  scanf("%d",&num);
  if(num==-1)
   break;
  putw(num,f1);
 }
 fclose(f1);
 f2=fopen("Even NUmbers.txt","w");
 f3=fopen("Odd Numbers.txt","w");
 f1=fopen("NUmbers.txt","r");
 while(!feof(f1))
 {
  num=getw(f1);
  if(num%2==0)
   putw(num,f2);
  else
   putw(num,f3);
 }
 printf("Even.txt reads...............\n");
 fcloseall();
 f2=fopen("Even Numbers.txt","r");
 while(!feof(f2))
 {
  num=getw(f2);
  printf(" %d",num);
 }
 printf("Odd.txt reads................\n");
 f3=fopen("Odd Numbers.txt","r");
 while(!feof(f3))
 {
  num=getw(f3);
  printf(" %d",num);
 }
 fcloseall();
 getch();
}


