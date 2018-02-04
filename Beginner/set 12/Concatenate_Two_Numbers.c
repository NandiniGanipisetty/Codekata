#include <stdio.h>

int main(void) {
	int K,N,temp=10;
	scanf("%d %d",&K,&N);
	while(N>=temp)
	{
		temp*=10;
	}
	printf("%d",K*temp+N);
	return 0;
}
