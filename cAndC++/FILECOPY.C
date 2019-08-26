#include<stdio.h>
#include<conio.h>
void main()
{
 FILE *f1,*f2;
 char c;
 f1=fopen("data.txt","r");
 f2=fopen("data1.txt","w");
 while(!feof(f1))
 {
  c=fgetc(f1);
  fputc(c,f2);
 }
 fcloseall();
 f2=fopen("data1.txt","r");
 while(!feof(f2))
 {
  c=fgetc(f2);
  printf("%c",c);
 }
 getch();
}
