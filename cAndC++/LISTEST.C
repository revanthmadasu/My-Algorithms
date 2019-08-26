#include<stdio.h>
#include<stdlib.h>
struct linked
{
 int inf;
 struct linked *next;
};
typedef struct linked node;
node *list,*head;
void create(node*);
void display(node*);
void main()
{
 int slct;
 do
 {
  printf("\t\t\tSELECT\n1.Create\n2.Display\n3.Exit\n");
  scanf("%d",&slct);
  switch(slct)
  {
   case 1:head=(node*)malloc(sizeof(node));create(head);break;
   case 2:display(head);break;
   case 3:exit(0);break;
   default:printf("\nInvalid Choice");
  }
 }while(1);
}

void create(node *list)
{
 printf("Enter element\n");
 scanf("%d",&list->inf);
 if(list->inf!=-999)
 {
  list->next=(node*)malloc(sizeof(node));
  create(list->next);
 }
 if(list->inf==-999)
  list->next=NULL;
}

void display(node *list)
{
 node *temp;
 temp=list;
 while(temp->next!=NULL)
 {
  printf(" %d",temp->inf);
  temp=temp->next;
 }
}

