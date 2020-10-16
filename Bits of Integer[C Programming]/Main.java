#include<stdio.h>
int dec_to_bin(int n)
{
  int sum = 0, rem = 0, count = 0;  
  int dec = n;
  while(n>0)
  {
    n /= 2;
    count++;
  }
  return count;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
