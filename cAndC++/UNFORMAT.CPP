#include<iostream.h>
#include<conio.h>
const int size=20;
void main()
{
 char buffer[size];
 cout<<"Enter a line of text:\n ";
 cin.read(buffer,15);
 cout<<"The line of text entered was: ";
 cout.write(buffer,cin.gcount());
 getch();
}