#include<stdio.h>
void main()
{
 FILE *fp;
 char name[10];
 int age;
 fp=fopen("data2.txt","w");
 printf("Enter name\tage:\n");
 scanf("%s %d",name,&age);
 fprintf(fp,"%s %d",name,age);
 printf("\nName\tAge\n");
 fscanf(fp,"%s %d",name,&age);
 printf("%s %d\n",name,age);

 fclose(fp);
}