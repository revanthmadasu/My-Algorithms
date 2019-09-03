/*Milly is at the examination hall where she is reading a question paper. She checked the question paper and discovered that there are N questions in that paper. Each question has some score value. Ideally it's like questions requiring more time have more score value and strangely no two questions on the paper require same time to be solved.

She is very excited by looking these questions. She decided to solve K questions while maximizing their score value. Could you please help Milly to determine the exact time she needs to solve the questions.*/
#include<stdio.h>
void main()
{
	int N,Q,K[10],T[100],S[100],i,j,temp,tt;
	scanf("%d %d",&N,&Q);
	for(i=0;i<N;i++)
	 scanf("%d",&T[i]);
	for(i=0;i<N;i++)
	 scanf("%d",&S[i]);
	for(i=0;i<Q;i++) 
	 scanf("%d",&K[i]);
	for(i=0;i<N;i++)
	 for(j=i;j<N-i-1;j++)
	  {
		if(T[j]>T[j-1])
		{
			temp=T[j];
			T[j]=T[j-1];
			T[j-1]=temp;
		}
		if(S[j]>S[j-1])
		{
			temp=S[j];
			S[j]=S[j-1];
			S[j-1]=temp;
		}
	  }
	for(i=0;i<Q;i++)
	{
		 tt=0;
		 for(j=0;j<K[i];++j)
		  tt+=T[j];
		 printf("\n%d",tt);
	}
}