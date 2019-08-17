#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int turn=0;
  for(int row=1;row<=n;row++)
  {
     for(int space=1;space<=n-row;space++)
     {
       printf(" ");
     }
    for(int col=1;col<=2*row-1;col++)
    {
    printf("*");
    }
    printf("\n");
  }
    
	return 0;
}