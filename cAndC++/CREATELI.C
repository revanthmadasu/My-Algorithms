#include<stdio.h>
#include<stdlib.h>
struct linked_list
{
 int num;
 struct linked_list *next;
};
typedef struct linked_list node;
void create(node *p);
void print(node *p);

void main()
{
 node *head;
 head=(node*)malloc(sizeof(node));
 create(head);
 print(head);
 getch();
}

void create(node *list)
{
 printf("Enter a number:\n(type -999 at end\n");
 scanf("%d",&list->num);
 if(list->num==-999)
 {
  list->next==NULL;
 }
 else
 {
  list->next=(node*)malloc(sizeof(node));
  create(list->next);
 }
 return;
}

void print(node *list)
{
 if(list->next!=NULL)
 {
  printf(" %d",list->num);
  if(list->next->next==NULL)
   printf(" %d",list->next->num);
  print(list->next);
 }
 return;
}

