#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    float meal;
    int tip,tax,total;
    scanf("%f",meal);
    scanf("%d",tip);
    scanf("%d",tax);
    tip = meal * (tip/100);
    tax = meal * (tax/100);
    total = meal+tip+tax;
    printf("The total meal cost is %d dollars",total);
    return 0;
}