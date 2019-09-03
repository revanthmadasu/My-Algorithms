#include<stdio.h>
#include<conio.h>
#include<math.h>
#define pi 3.141592654
float add();
float mult();
void converter();
float trignometry();
int main()
{
 int n,A;
 float x,y;
 printf("\nEnter '1-add' '2-mult' '3-divide' '4-sin' '5-cos' '6-tan' '7-cot' '8-cosec' '9-sec' '10-asin' '11-acos' '12-atan' '13-sinh' '14-cosh' '15-tanh' '16-coth' '17-cosech' '18-sec' '19-converter'");
 scanf("%d",&A);
 switch(A)
 {
  case 1:
  {
   y=add();
   printf("\n%f",y);
  }
  break;
  case 2:printf("%f",mult());break;
  case 3:
  {
   float N,D,Q;
   printf("\nEnter the numerator and denominator");
   scanf("%f%f",&N,&D);
   Q=N/D;
   printf("\nThe quotient when %f is divided by %f is %f",N,D,Q);
  }
  break;
  case 4:
  {
   x=trignometry();
   printf("\n%f",sin(x));
  }
  break;
  case 5:
  {
   x=trignometry();
   printf("\n%f",cos(x));
  }
  break;
  case 6:
  {
   x=trignometry();
   y=sin(x)/cos(x);
   printf("\n%f",y);
  }
  break;
  case 7:
  {
   x=trignometry();
   y=cos(x)/sin(x);
   printf("\n%f",y);
  }
  break;
  case 8:
  {
   x=trignometry();
   y=1/sin(x);
   printf("\n%f",y);
  }
  break;
  case 9:
  {
   x=trignometry();
   y=1/cos(x);
   printf("\n%f",y);
  }
  break;
  case 10:
  {
   printf("\n%f",asin(x));
  }
  break;
  case 11:
  {
   printf("\n%f",acos(x));
  }
  break;
  case 12:
  {
   printf("\n%f",atan(x));
  }
  break;
  case 13:
  {
   x=trignometry();
   printf("\n%f",sinh(x));
  }
  break;
  case 14:
  {
   x=trignometry();
   printf("\n%f",cosh(x));
  }
  break;
  case 15:
  {
   x=trignometry();
   printf("\n%f",tanh(x));
  }
  break;
  case 16:
  {
   x=trignometry();
   y=cosh(x)/sinh(x);
   printf("\n%f",y);
  }
  break;
  case 17:
  {
   x=trignometry();
   y=1/sinh(x);
   printf("\n%f",y);
  }
  break;
  case 18:
  {
   x=trignometry();
   y=1/cosh(x);
   printf("\n%f",y);
  }
  case 19: converter();break;
 }
 return 0;
 getch();
}

float add()
{
 float n[20];
 float A=0;
 int i,s;
 printf("\nEnter the number of numbers that are to be added");
 scanf("%d",&s);
 printf("\nEnter the numbers that are to be added");
 for(i=0;i<s;i++)
  scanf("%f",n[i]);
 for(i=0;i<s;i++)
  A+=n[i];
 return A;
}

float mult()
{
 float n[20];
 float M=1;
 int i,s;
 printf("\nEnter the number of numbers that are to be multiplied");
 scanf("%d",&s);
 printf("\nEnter the numbers that are to be multiplied");
 for(i=0;i<s;i++)
  scanf("%f",&n[i]);
 for(i=0;i<s;i++)
  M*=n[i];
 return M;
}

void converter()
{
 float x;
 int a;
 printf("\nEnter the respective number to convert '1-inch->cm' '2-cm->inch' '3-feet->meter' '4-meter->feet' '5-yard->meter' '6-meter->yard' '7-mile->kilometer' '8-kilometer->mile' '9-n mile->meter' '10-meter->n mile' '11-acre->meter^2' '12-meter^2->acre' '13-gal(US)->litre' '14-litre->gal(US)' '15-gal(UK)->litre' '16-litre->gal(UK)' '17-parsec->km' '18-km->parsec' '19-km/hr->m/s' '20-m/s->km/hr' '21-oz->gram' '22-gram->oz' '23-pound->kg' '24-kg->pound' '25-atmosphere->pascal' '26-pascal->atmosphere' '27-mmHg->pascal' '28-pascal->mmHg' '29-horse power->kilo watt' '30-kilowatt->horse power' '31-kgf/(cm)^2->pascal' '32-pascal->kgf/(cm)^2' '33-kgf.m->joule' '34-joule->kgf.m' '35-lbf/(in)^2->kPascal' '36-kPascal->lbf/(in)^2' '37-farenheit->celsius' '38-celsius->farenheit' '39-Joule->calories' '40-Calories->Joules'");
 scanf("%d",&a);
 printf("\nEnter the value to be converted");
 scanf("%f",&x);
 switch(a)
 {
  case 1:printf("\n%f",2.54*x);break;
  case 2:printf("\n%f",x/2.54);break;
  case 3:printf("\n%f",0.3048*x);break;
  case 4:printf("\n%f",x/0.3048);break;
  case 5:printf("\n%f",x*0.9144);break;
  case 6:printf("\n%f",x/0.9144);break;
  case 7:printf("\n%f",x*1.6093);break;
  case 8:printf("\n%f",x/1.6093);break;
  case 9:printf("\n%f",x*1852);break;
  case 10:printf("\n%f",x/1852);break;
  case 11:printf("\n%f",x*4046.856);break;
  case 12:printf("\n%f",x/4046.856);break;
  case 13:printf("\n%f",x*3.785);break;
  case 14:printf("\n%f",x/3.785);break;
  case 15:printf("\n%f",x*4.546);break;
  case 16:printf("\n%f",x/4.546);break;
  case 17:printf("\n%f",x*(3.086*pow(10,13)));break;
  case 18:printf("\n%f",x/(3.086*pow(10,13)));break;
  case 19:printf("\n%f",x*0.2778);break;
  case 20:printf("\n%f",x/0.2778);break;
  case 21:printf("\n%f",x*28.349);break;
  case 22:printf("\n%f",x/28.349);break;
  case 23:printf("\n%f",x*0.4536);break;
  case 24:printf("\n%f",x/0.4536);break;
  case 25:printf("\n%f",x*101325);break;
  case 26:printf("\n%f",x/101325);break;
  case 27:printf("\n%f",x*133.32);break;
  case 28:printf("\n%f",x/133.32);break;
  case 29:printf("\n%f",x*0.746);break;
  case 30:printf("\n%f",x/0.746);break;
  case 31:printf("\n%f",x*98066.5);break;
  case 32:printf("\n%f",x/98066.5);break;
  case 33:printf("\n%f",x*9.806);break;
  case 34:printf("\n%f",x/9.806);break;
  case 35:printf("\n%f",x*6.894);break;
  case 36:printf("\n%f",x/6.894);break;
  case 37:printf("\n%f",(x-32)*5/9);break;
  case 38:printf("\n%f",((9*x)/5)+32);break;
  case 39:printf("\n%f",x*0.239);break;
  case 40:printf("\n%f",x/0.239);break;
 }
}

float trignometry()
{
 float R,a;
 int i;
 printf("\nEnter 1 if the angle is in degrees or enter 2 if the angle is in radians");
 scanf("%d",&i);
 printf("\nEnter the angle");
 scanf("%f",&a);
 if(i==1)
 {
  R=a*(3.142/180);
  a=R;
 }
 return a;
}









