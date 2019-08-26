#include<stdio.h>
#include<conio.h>
void main()
{
 int i,j,n,c=0,b=0,g=0;

 char order[20],temp;
 printf("Enter the number of boys\n");
 scanf("%d",&n);
 printf("Enter the order:\n");
 scanf("%s",order);
 for(i=0;i<2*n;i++)
 {
  if(i%2==0&&order[i]=='b')
   ++b;
  if(i%2==0&&order[i]=='g')
  ++g;
 }
 if(b>g)
  printf("boy should be first\n");
 if(g>b)
  printf("girl should be first\n");
 if(b==g&&order[0]=='b')
  printf("boy should be first\n");
 else
  printf("girl should be first\n");
 printf("Number of boys and girls in even position are %d and %d",b,g);
 if(b>g||(b==g&&order[0]=='b'))
  for(i=0;i<2*n;i++)
   if(i%2==0&&order[i]=='g')
     for(j=0;j<2*n;j++)
       if(j%2!=0&&order[j]=='b')
       {
	temp=order[i];
	order[i]=order[j];
	order[j]=temp;
	++c;
       }
 if(g>b||(g==b&&order[0]=='g'))
  for(i=0;i<2*n;i++)
   if(i%2==0&&order[i]=='b')
    for(j=0;j<2*n;j++)
     if(j%2!=0&&order[j]=='g')
     {
      temp=order[i];
      order[i]=order[j];
      order[j]=temp;
      ++c;
     }
 printf("The minimum number of swaps are %d\nThe arranged order is %s",c,order);
 getch();
}
