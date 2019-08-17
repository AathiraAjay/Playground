#include <stdio.h>
int main() {
	//Type your code
  int n,f,l,temp,sum;
  scanf("%d",&n);
  temp=n;
  l=n%10;
  while(n>=10)
  {
  n/=10;
  }
  f=n;
  sum=f+l;
  printf("%d",sum);
	return 0;
}