#include <stdio.h>
int main(){
  	// Type your code here
  int n;
  scanf("%d",&n);
  int turn=0;
  for(int row=1;row<=n;row++)
  {
     for(int col=1;col<=row;col++)
     {
       printf("%d",row);
     }
    printf("\n");
  }
	return 0;
}