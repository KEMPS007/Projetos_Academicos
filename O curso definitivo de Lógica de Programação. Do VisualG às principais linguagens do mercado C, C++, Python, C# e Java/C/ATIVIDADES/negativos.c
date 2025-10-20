#include <stdio.h>

int main(){

    int X,i;

    printf("Quantos numeros voce vai digitar: ");
    scanf("%d",&X);

    float vet[X];
    printf("Digite um numero: \n");
    for(i = 0; i < X; i++){
            
            scanf("%f",&vet[i]);
    }

    for ( i = 0; i < X; i++)
    {
        if (vet[i] < 0)
        {
            printf("numeros negativos: %f\n",vet[i]);
        }
        /* code */
    }
    

    return 0;

}