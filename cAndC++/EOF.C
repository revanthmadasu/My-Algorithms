#include<stdio.h>
#include<conio.h>
void main()
{
 int t;
 FILE *fp;
 fp=fopen("data.txt","w");
 while(scanf("%d",t)!=EOF)
 {
  fprintf(fp,"%d",t);
  printf("Enter next number or <EOF>");
 }
 fclose(fp);
 fp=fopen("data.txt","r");
 while(!feof(fp))
 {
  fscanf(fp,"%d",&t);
  printf(" %d",t);
 }
 fcloseall();
 getch();
}