#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
struct contact
    {
     char name[20];
    long int number;
};
typedef struct
    {
    char name[20];
}names;

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long int i,N;
    scanf("%lld",&N);
    struct contact list[N];
    for(i=0;i<N;i++)
        scanf("%s %lld",list[i].name,&list[i].number);
    names y[N];
    for(i=0;i<N;i++)
        scanf("%s",y[i].name);
    for(i=0;i<N;i++)
        if(strcmp(y[i].name,list[i].name)==0)
          printf("%s=%d\n",list[i].name,list[i].number);
        else
          printf("Not found\n");
        
    return 0;
}