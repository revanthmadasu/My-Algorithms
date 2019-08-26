#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
 {
 FILE *fp;
 char text[100];
 printf("Enter data\n");
 gets(text);
 fp=fopen("data.txt","w");
 fputs(text,fp);
 fp=fopen("data.txt","r");
 printf("Cntents read\n");
 fgets(text,100,fp);
 puts(text);
 fclose(fp);
 getch();
}