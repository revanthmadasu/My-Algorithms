#include<stdio.h>
#include<conio.h>
void main()
{
 FILE *fp;
 char next='y';
 char name[25];
 fp=fopen("marks.txt","w");
 while(!feof(fp))
 {
  next=fgetc(fp);
  printf("%c",next);
  if(ferror(fp))
  {
   printf("\nWorng mode");
   break;
  }
 }
 fclose(fp);
 getch();
}