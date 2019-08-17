#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int count=1;
  while(count<=n)
  {
    if(count%2==1)
    {
    printf("%d \n",count);
    }
    count=count+1;
  }
	return 0;
}