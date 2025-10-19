#include <stdio.h>
int main (){
    int i,n,x;
    printf("Digite um numero para a tabuada: ");
    scanf("%d",&n);

    for(i = 1; i <=10 ; i++) {
        x = n * i;
        printf("%i x %i = %i\n",n,i,x);
    }

    return 0;
}