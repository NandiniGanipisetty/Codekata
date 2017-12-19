#include <stdio.h>
#include <stdlib.h>
 int digit(int a)
    {
        int count=0;
        while(a!=0)
        {
            a=a/10;
            count++;
        }
        return count;
    }
    int main()
    {
        int a,b;
        scanf("%d",&a);
        b=digit(a);
        printf("number of digits:%d",b);
    }
