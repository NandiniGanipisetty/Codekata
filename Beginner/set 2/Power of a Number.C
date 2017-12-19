#include <stdio.h>
#include <stdlib.h>
int main() 
{
    int a,b,power=1;
    printf("enter the number\n");
    scanf("%d",&a);
    printf("enter the power of the number\n");
    scanf("%d",&b);
    for(int i=1;i<=b;i++)
    {
        power=power*a;
    }
    printf("%d",power);
return 0;
}

