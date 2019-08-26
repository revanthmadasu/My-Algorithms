#include<malloc.h>
#include<iostream.h>
#include<conio.h>
void main()
{
 int i,j,n,n1,cr,cl,ru,rd,*A,*r,*c;
 printf("Enter size");
 scanf("%d",&n);
 r=(int)malloc(n*sizeof(int));
 c=(int)malloc((n-1)*sizeof(int));
 n1=-1;
 for(i=0;i<n;i+=2)
  r[i]=i/2;
 n1=n;
 for(i=1;i<n;i+=2)
  r[i]=--n1;
 n1=n;
 for(i=0;i<n-1;i+=2)
  c[i]=--n1;
 n1=-1;
 for(i=1;i<n-1;i+=2)
  c[i]=++n1;
 printf("rows : ");
 for(i=0;i<n;++i)
  printf("%d ",r[i]);
 printf("\nColumns : ");
 for(i=0;i<n-1;++i)
  printf("%d ",c[i]);
 getch();
}