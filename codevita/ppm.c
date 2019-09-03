#include<stdio.h>
int main()
{
    int s,r,samples[10000],i,sum,j;
    int range[1000000];
    scanf("%d %d",&s,&r);
    for(i=0;i<s;++i)
    {
        scanf("%d ",&samples[i]);
    }
    for(i=0;i<r*2;++i)
     scanf("%d ",&range[i]);
     printf("\n Samples :");
    for(i=0;i<s;++i) printf(" %d",samples[i]);
    printf("\n Range");
    for(i=0;i<r*2;i+=2) printf("\n%d %d",range[i],range[i+1]);
    for(i=0;i<r*2;i+=2)
    {
        sum=0;
        for(j=0;j<s;++j)
        {
            if(samples[j]>range[i]&&samples[j]<range[i+1])
             ++sum;
        }
        printf("%d\n",sum);
    }
    return 0;
}