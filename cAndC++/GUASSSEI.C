#include<stdio.h>
void main()
{
 int xc[3],yc[3],zc[3],c[3];
 float x,y,z;
 int i;
 printf("\nEnter the coefficiants:");
 for(i=0;i<3;i++)
  scanf("%d%d%d%d",&xc[i],&yc[i],&zc[i],&c[i]);
 y=0;
 z=0;
 for(i=1;i<=15;i++)
 {
  x=(c[0]-(yc[0]*y)-(zc[0]*z))/xc[0];
  y=(c[1]-(xc[1]*x)-(zc[1]*z))/yc[1];
  z=(c[2]-(xc[2]*x)-(yc[2]*y))/zc[2];
  printf("\nThe %dth approximations are x=%f, y=%f, z=%f",i,x,y,z);
 }
}
