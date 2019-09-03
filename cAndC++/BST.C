/*program for creation of binary search tree */
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

typedef struct NODE
{
 int inf;
 struct NODE *left,*right;
}node;

node* create(node*,int);
void inoreder(node*);
void preorder(node*);
void postorder(node*);
void rem(node*);

node* create(node *root,int x)
{
 if(root==NULL)
 {
  root=(node*)malloc(sizeof(node));
  root->inf=x;
  root->left=NULL;
  root->right=NULL;
 }
 else
 {
  if(x>root->inf)
   root->right=create(root->right,x);
  if(x<root->inf)
   root->left=create(root->left,x);
  if(x==root->inf)
   printf("\nDuplications not allowed\n");
 }
 return root;
}

void inorder(node* root)
{
 if(root==NULL) return;
 inorder(root->left);
 printf(" %d",root->inf);
 inorder(root->right);
 return;
}

void preorder(node* root)
{
 if(root==NULL)
  return;
  printf(" %d",root->inf);
  preorder(root->left);
  preorder(root->right);
}

void postorder(node* root)
{
 if(root==NULL) return;
 postorder(root->left);
 postorder(root->right);
 printf(" %d",root->inf);
}

void rem(node *root)
{
 int t;
 void *temp;
 printf("\nEnter the element to be deleted");
 scanf("%d",&t);
 if(t==root->inf)
 {

 }
}

void main()
{
 node *root=NULL;
 int opn,i,n,key;
 do
 {
  printf("\n### BINARY SEARCH TREE OPERATIONS\n1-CREATE\n2-display in inorder\n3-display in preorder\n4-display in postorder\n5-exit");
  scanf("%d",&opn);
  switch(opn)
  {
   case 1:
	  printf("\nEnter the number of elements\n");
	  scanf("%d",&n);
	  for(i=0;i<n;i++)
	  {
	   printf("\nEnter the element");
	   scanf("%d",&key);
	   root=create(root,key);
	  }
	  break;
   case 2:printf("\nDisplay in Inorder");
	  inorder(root);
	  break;
   case 3:printf("\nDisplay in Preorder");
	  preorder(root);
	  break;
   case 4:printf("\nDisplay in Postorder");
	  postorder(root);
	  break;
   case 5:printf("\nTerminating\n");
	  break;
   default:printf("\nInvalid choice\tTry again");
  }
 }while(opn!=5);
}



