#include<stdio.h>
void main()
{
	 int i,T=0,L,R,j,co;
	 printf("\nEnter the range");
	 scanf("%d %d",&L,&R);
	 for(i=L;i<=R;i++)
	 {
		co=0;
		j=i;
		while(j>=1)
		{
			if(i%j==0)
			 co++;
			j--;
		}
		if(co%2!=0)
		 ++T;
	 }
	 printf("\n%d",T);
}