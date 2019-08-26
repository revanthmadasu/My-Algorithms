#include<stdio.h>
#include<ctype.h>
#include<conio.h>
void main()
{
	 char c[],file[10];
	 int a=0,d=0,p=0,s=0;
	 FILE *fp;
	 printf("Enter the file name\n");
	 scanf("%s",file);
	 fp=fopen(file,"r");
	 while(!feof(fp))
	 {
	 	if(isalpha(getchar(fp))) 
		 ++a;
	    if(isdigit(getchar(fp)))
		 ++d;
		if(ispunct(getchar(fp)))
		 ++p;
		if(isspace(getchar(fp))) 
		 ++s;  
	 }
	 printf("There are %d alphabets, %d digits, %d punctuations, %d spaces\n");
	 fclose(fp);
	 
	 
}