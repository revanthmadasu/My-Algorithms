#include<stdio.h>
#include<conio.h>
void main()
{
 char c;
 FILE *fp;
 fp=fopen("data.txt","r");
 if(fp==NULL)
 {
  printf("The file cannot be opened\n");
  exit(1);
 }
 while(!feof(fp))
 {
  fscanf(fp,"%c",&c);
  printf("%c",c);
 }
 fclose(fp);
 getch();
}