#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx=0;idx<=arr_size-1;idx++)
  {
  scanf("%d",&arr[idx]);
  }
  int search_elem1;
  scanf("%d",&search_elem1);
  int search_elem2;
  scanf("%d",&search_elem2);
  int elem1_idx= -1;
   int elem2_idx= -1;
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    if(search_elem1==arr[idx])
    {
      elem1_idx=idx;
    }
    if(search_elem2==arr[idx])
    {
      elem2_idx=idx;
    }
  }
  printf("%d\n",elem1_idx);
  printf("%d\n",elem2_idx);       
  
  
  return 0;
}