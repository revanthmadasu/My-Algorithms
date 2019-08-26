#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main(int argc, char *argv[])
{
 FILE *fp,*ft;
 char ch;
 if(argc!=3)
 {
  printf("\nYou should give the destination file name");
  return 0;
 }
 fp=fopen(argv[1],"rb");
 ft=fopen(argv[2],"wb");
 while(!feof(fp))
 {
  ch=fgetc(fp);
  fputc(ch,ft);
 }
 printf("\nFile has been copied");
 fcloseall();
 getch();
 return 0;
}
