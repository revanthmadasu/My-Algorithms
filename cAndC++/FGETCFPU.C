#include<stdio.h>
#include<conio.h>
void main()
{
 FILE *fp;
 char c=' ';
 fp=fopen("data.txt","w");
 printf("\nEnter data and to stop press '.'");
 while(c!='.')
 {
  c=getchar();
  fputc(c,fp);
 }
 if(ferror(fp))
  printf("\nOpenig mode is incorrect");
 fclose(fp);
 fp=fopen("data.txt","r");
 while(!feof(fp))
 {
  c=fgetc(fp);
  printf("%c",c);
 }
 getch();
}
