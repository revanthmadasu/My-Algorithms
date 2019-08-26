//sort three numbers in ascending order
#include<stdio.h>
main()
{
 int n1,n2,n3;
 printf("\nEnter three numbers:");
 scanf("%d%d%d",&n1,&n2,&n3);
 if(n1<n2&&n1<n3)
 {
  printf("%d",n1);
  if(n2<n3)
   printf("%d%d",n2,n3);
  else
   printf("%d%d",n3,n2);
 }
 if(n2<n1&&n2<n3)
 {
  printf("%d",n2);
  if(n1<n3)
   printf("%d%d",n1,n3);
  else
   printf("%d%d",n3,n1);
 }
 if(n3<n1&&n3<n2)
 {
  printf("%d",n3);
  if(n1<n2)
   printf("%d%d",n1,n2);
  else
   printf("%d%d",n2,n1);
 }
 return 0;
}