#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int N,i,j,Ar=0;
    int h[100],A[100][100];
    scanf("%d",&N);
    for(i=1;i<=N;i++)
        scanf("%d",&h[i]);
    for(i=1;i<=N;i++)
        for(j=i;j<=N;j++)
	    A[i][j]=h[i]*(N+1-j);
    for(i=1;i<=N;i++)
        for(j=i;j<=N;j++)
          if(A[i][j]>=Ar)
             Ar=A[i][j];
    printf("%d",Ar);    
        
         
    
    return 0;
}