#include<stdio.h>
struct Address
{
 int H_No;
 char street[20];
 char city[20];
};
struct Employee
{
 char name[15];
 int id;
 struct Address addr;
 char desig;
 float salary;
}emp[10];
void main()
{
 int i,j,sid,n;
 printf("\nEnter the number of employees");
 scanf("%d",&n);
 printf("\nEnter employee name, id, address, designation and salary.");
 for(i=0;i<n;i++)
 scanf("%s%d%d%s%s%s%f",emp[i].name,&emp[i].id,&emp[i].addr.H_No,emp[i].addr.street,emp[i].addr.city,emp[i].desig,&emp[i].salary);
 printf("\nEnter 1 to display the information of all employees \nEnter 2 to display the information of selected employee");
 scanf("%d",&i);
 if(i==1)
  for(i=0;i<n;i++)
   printf("\nEmployee Name %s,  Id-%d,  Address: %d, %s, %s    Designation-%s,  Salary-%f",emp[i].name,emp[i].id,emp[i].addr.H_No,emp[i].addr.street,emp[i].addr.city,emp[i].desig,emp[i].salary);
 if(i==2)
 {
  printf("\nEnter the employee id");
  scanf("%d",&sid);
  for(i=0;i<n;i++)
   if(emp[i].id==sid)
    j=i;
  printf("Name: %s,  Id:%d,  Address: %d, %s, %s    Designation: %s,  Salary: %f",emp[j].name,emp[j].id,emp[j].addr.H_No,emp[j].addr.street,emp[j].addr.city,emp[j].desig,emp[j].salary);
 }
}


