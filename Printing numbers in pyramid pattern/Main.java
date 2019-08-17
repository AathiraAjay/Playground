#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int val=1;
  for(int row=1;row<=n;row++)
  {
     for(int space=1;space<=(n-row);space++)
     {
       printf(" ");
     }
    for(int col=1;col<=row;col++)
    {
     printf("%d ",val);
      val++;
    }
    printf("\n");
  }
	return 0;
}