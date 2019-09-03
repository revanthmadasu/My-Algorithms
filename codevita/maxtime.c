//This is The Coding Area
#include<stdio.h>
#include<math.h>
void base6(int[],int);
int main()
{
  int n,N[50],i,inverse=0,j;
  scanf("%d",&n);
  if(n>50) return;
  for(i=0;i<n;++i)
  {
    scanf("%d,",&N[i]);
    if(N[i]>107) return;
  }
  base6(N,n);
 for(i=0;i<n-1;i++)
 {
     for(j=i;j<n;j++)
     {
         if(N[i]>N[j])
          ++inverse;
     }
 }
 printf("%d",inverse);
  return 0;
}

void base6(int N[],int s)
{
  int i,t,t1,t2,p,b6,sum;
  for(i=0;i<s;++i)
  {
    t=N[i];
    p=0;
    b6=0;
    sum=0;
    while(t>6)
    {
      b6+=((int)pow(10,p))*(t%6);
      ++p;#include<stdio.h>
void bubbleSort(int[],int);
void swap(int*,int*);
int main()
{
    int N[9],i,zerocount=0,two=0,four=0,t[6],j,one=0,three=0;
     for(i=0;i<9;++i)
    {
      scanf("%d,",&N[i]);
      if(N[i]==0)
       ++zerocount;
      if(N[i]==1)
       ++one;
      if(N[i]==2)
       ++two;
      if(N[i]==3)
       ++three;
      if(N[i]==4)
       ++four;
       
    }
       /*for(i=0;i<9;++i) printf(" %d",N[i]);
       printf("\n");*/
    bubbleSort(N,9);
    //for(i=0;i<9;++i) printf(" %d",N[i]);
    if(two!=0&&four!=0&&zerocount==4)
    {
        printf("24:00:00");
        return 0;
    }
    for(j=0;j<6;++j)
    {
        if(j==0)
        {
            for(i=0;i<9;++i)
            {
                if(N[i]==2&&three>=1&&two>=2&&one>=1)
                {
                    t[j]=N[i];
                    N[i]=-1;
                    break;
                }
                else if(N[i]>=3) continue;
                else {
                    t[j]=N[i];
                    N[i]=-1;
                    break;
                } 
            }
        }
        if(j==1)
        {
            if(t[0]==2)
            {
                for(i=0;i<9;++i)
                {
                    if(N[i]==-1||N[i]>3) continue;
                    t[j]=N[i];
                    N[i]=-1;
                    break;
                }
            }
            else
            {
                for(i=0;i<9;++i)
                {
                    if(N[i]==-1) continue;
             else
             {
                 t[j]=N[i];
                 N[i]=-1;
                 break;
             }
                }
            }
        }
        if(j==2||j==4)
        {
            for(i=0;i<9;++i)
            {
                if(N[i]>=6||N[i]==-1) continue;
                //printf("T[%d]=%d",j,N[i]);
                t[j]=N[i];
                N[i]=-1;
                break;
            }
        }
        if(j==3||j==5)
        {
            for(i=0;i<9;++i)
             if(N[i]==-1) continue;
             else
             {
                 t[j]=N[i];
                 N[i]=-1;
                 break;
             }
        }
    }
    for(i=0;i<6;++i)
    {
        if(t[i]<0)
        {
            printf("Impossible");
            return 0;
        }
    }
    printf("%d%d:%d%d:%d%d",t[0],t[1],t[2],t[3],t[4],t[5]);
    //for(i=0;i<9;++i) printf(" %d",N[i]);
    return 0;
}
void bubbleSort(int arr[], int n)
{
   int i, j;
   int swapped;
   for (i = 0; i < n-1; i++)
   {
     swapped = 0;
     for (j = 0; j < n-i-1; j++)
     {
        if (arr[j] < arr[j+1])
        {
           swap(&arr[j], &arr[j+1]);
           swapped = 1;
        }
     }
 
     // IF no two elements were swapped by inner loop, then break
     if (swapped == 0)
        break;
   }
}
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
      t/=6;
    }
    b6+=((int)pow(10,p))*(t%6);
    while(b6!=0)
    {
        sum+=(b6%10);
        b6/=10;
    }N[i]=sum;
  }
}