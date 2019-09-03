#include<stdio.h>
#include<conio.h>
void main()
{
 FILE *fp;
 char name[20];int rno;float marks;
 fp=fopen("data.txt","w");
 printf("\nEnter data");
 scanf("%s %d %f",name,&rno,&marks);
 fprintf(fp,"%c %d %f",name,rno,marks);
 fclose(fp);
 fp=fopen("data.txt","r");
 fscanf(fp,"%s %d %f",name,&rno,&marks);
 printf("\nContents read\n%s\t%d\t%f",name,rno,marks);
 fclose(fp);
 getch();
}
