#include <stdio.h>
#include <stdlib.h>
int main() 
{
    int a,sum=0;
    printf("enter the total numbers\n");
    scanf("%d",&a);
    for(int i=1;i<=a;i++)
    {
        sum=sum+i;
    }
    printf("the addition is:%d",sum);
return 0;
}
