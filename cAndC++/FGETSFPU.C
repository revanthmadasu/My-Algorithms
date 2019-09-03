#include<stdio.h>
#include<conio.h>
void main()
{
 FILE *fp;
 char c[100];int i=0;
 fp=fopen("data.txt","w");
 printf("\nEnter data");
 scanf("%s",c);
 fputs(c,fp);
 fclose(fp);
 fp=fopen("data.txt","r");
 printf("\cContents read\n");
 if(fgets(c,100,fp)!=NULL)
  while(c[i]!='\0')
  {
   putchar(c[i]);
   i++;
  }
 getch();
}
