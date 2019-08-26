#include<stdio.h>
#include<ctype.h>
#include<conio.h>
void main()
{
 int a=0,d=0,p=0,s=0;
 char c,file[10];
 FILE *fp;
 printf("enter file name\n");
 scanf("%s",file);
 fp=fopen(file,"r");
 if(fp==NULL)
 {
  printf("The file cannot be opened\n");
  exit(1);
 }
 while(!feof(fp))
 {
  c=getc(fp);
  if(isalpha(c))
   ++a;
  if(isdigit(c))
   ++d;
  if(ispunct(c))
   ++p;
  if(isspace(c))
   ++s;
 }
 printf("There are %d alphabets, %d digits, %d puntuations, %d spaces",a,d,p,s);
 fclose(fp);
 getch();
}