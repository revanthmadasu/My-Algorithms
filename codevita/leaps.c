#include<stdio.h>
int main()
{
    int t,i,d,z,ini,leaps,pdis;
    scanf("%d",&t);
    for(i=0;i<t;++i)
    {
        scanf("%d %d %d",&ini,&d,&z);
        if((d>z)||(d==z&&ini!=0))
        {
            printf("-1");
            return 0;
        }
        leaps=0;
        pdis=ini;
        while(pdis%z!=0)
        {
            pdis+=d;
            ++leaps;
        }
        leaps=pdis/z;
        printf("%d ",leaps);
    }
    return 0;
}