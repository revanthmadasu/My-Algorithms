#include<stdio.h>
int size=0;
void main()
{
 void sizegen(char A[],int);
 char A[20];
 int i=0,j=0;
 printf("\n\nEnter the string:");
 gets(A);
 sizegen(A,20);
 for(i=0;i<=size;i++)
 {
  if(A[i]==A[size-1-i])
  j++;
 }
 if(j==size)
  printf("It is a palindrome.");
  else
  printf("\nIt is not palindrome:");
}

void sizegen(char A[],int x)
{
 int i=0;
 while(A[i]!='\0')
 {
  size++;
  i++;
 }
 return;
}