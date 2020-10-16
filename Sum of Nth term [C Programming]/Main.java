#include<stdio.h>
#include<math.h>
int main()
{
	int i,N;
	float sum;
	int count;
	scanf("%d",&N);
	sum=0.0f;
	count=1;
	for(i=0;i<N;i++)
	{
		sum = sum +  ((pow((i*2)+1,2)) / (pow((i*2)+1,3)));
		count+=1;
	}
	printf("%.2f\n",sum);
	return 0;
}
