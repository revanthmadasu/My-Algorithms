#include<iostream.h>
#include<conio.h>
class sample
{
 public:
 char name[20];
 int rno;
 void read()
 {
  cout<<"\nEnter inf"<<endl;
  cin>>name>>rno;
 }
 void disp()
 {
  cout<<"\nContents read "<<name<<rno<<endl;
 }
};
void main()
{
 sample *obj;
 cout<<"\nSize of object before allocation "<<sizeof(*obj)<<endl;
 cout<<"\nSize of object after allocating "<<sizeof(*obj)<<endl;
 obj->read();
 obj->disp();
 getch();
}