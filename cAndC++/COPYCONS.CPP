#include<iostream.h>
#include<conio.h>
class X
{
 int a,b;
 public:
 X(int p,int q)
 {
  a=p;
  b=q;
 }
 void dis()
 {
  cout<<"a= "<<a<<" b = "<<b<<endl;
 }
};
void main()
{
 X a(3,4);
 X b=a;
 a.dis();
 b.dis();
 getch();
}