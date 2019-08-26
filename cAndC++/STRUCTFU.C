#include<stdio.h>
struct human
{
 char name[15];
 int wt;
 int age;
 char sex[7];
 char cond[100];
}patient[20];
int n,i;
void show(char *,int,char*,int,char*);
void main()
{
 int i;
 printf("\nEnter the number of patients");
 scanf("%d",&n);
 printf("\nEnter the patient's name,age,sex,weight,health condition");
 for(i=0;i<n;i++)
 scanf("%s%d%s%d%s",patient[i].name,&patient[i].age,patient[i].sex,&patient[i].wt,patient[i].cond);
 show(patient*.name,patient*.age,patient*.sex,patient*.wt,patient*.cond);
}
void show(char *n1[20],int ag[20],char *s[20],int wght[20],char *c[20])
{
 for(i=0;i<n;i++)
  printf("%s%d%s%d%s",*n1[i],ag[i],*s[i],wght[i],*c[i]);
}

