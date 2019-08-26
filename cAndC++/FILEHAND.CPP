#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main()
{
 ofstream out("fees");
 int i,fd;
 char name[10];
 cout<<"Enter name and fees due";
 for(i=0;i<5;i++)
 {
  cin>>name>>fd;
  out<<name<<fd<<endl;
 }
 ifstream in("fees");
 for(i=0;i<5;i++)
 {
  in>>name;
  in>>fd;
  cout<<name<<" "<<fd<<endl;
 }
 getch();
}