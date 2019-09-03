#include<iostream.h>
#include<conio.h>
#include<math.h>
double area(double,double);
double area(double);
void area();
void main()
{
 double l,b,r,a,Ac;
 cout<<"Enter the length and breath of rectangle\n";
 cin>>l>>b;
 cout<<"\nEnter the length of side of square\n";
 cin>>a;
 area();
 cout<<"\nArea of Rectangle is "<<area(l,b)<<"\nArea of square is "<<area(a);
 getch();
}

double area(double l, double b)
{
 return l*b;
}

double area(double a)
{
 return a*a;
}

void area()
{
 double r;
 cout<<"\nEnter the radius of circle\n";
 cin>>r;
 cout<<"\nArea of circle is "<<3.1415*r*r;
}