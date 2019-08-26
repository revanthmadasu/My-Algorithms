#include<stdio.h>
void main()
{
 FILE *fp;
 char c;
 fp=fopen("data.txt","w");
 printf("\nEnter data");
 while(c!='.')
 {
  scanf("%c",&c);
  fputc(c,fp);
 }
 fclose(fp);
 fp=fopen("data.txt","r");
 while(!feof(fp))
 {
  c=fgetc(fp);
  printf("%c",c);
 }
}