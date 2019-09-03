#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void main()
{
 long double x,y,z,xt,yt,zt;
 int xc[3],yc[3],zc[3],c[3],i;
 printf("\nEnter the coefficiants of x,y,z and constant");
 for(i=0;i<3;i++)
  scanf("%d%d%d%d",&xc[i],&yc[i],&zc[i],&c[i]);
 printf("\nEnter the initial approximations");
 scanf("%Lf%Lf%Lf",&x,&y,&z);
 for(i=1;i<=20;i++)
 {
  xt=x;
  yt=y;
  zt=z;
  x=(c[0]-(yc[0]*yt)-(zc[0]*zt))/xc[0];
  y=(c[1]-(xc[1]*xt)-(zc[1]*zt))/yc[1];
  z=(c[2]-(xc[2]*xt)-(yc[2]*yt))/zc[2];
  printf("\nThe %dth approximations are x=%Lf  y=%Lf  z=%Lf",i,x,y,z);
 }
}