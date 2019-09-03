#include<iostream.h>
#include<conio.h>
const int size=20;
void main()
{
 cout.fill('*');
 cout.setf(ios::left);
 cout.width(10);
 cout<<"Value";
 cout.setf(ios::right);
 cout.width(10);
 cout<<"Square of value";
 getch();
}