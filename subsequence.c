#include <stdio.h>
#include <string.h>
int main(){
  char str[1001];
  scanf("%s" , str);
  int n = strlen(str);
  for(int i=0;i<(1<<n);i++){
    for(int j=0;j<n;j++){
      if(i & (1<<j)) printf("%c" , str[j]);
    }
    printf("\n");
  }
  return 0;
}
