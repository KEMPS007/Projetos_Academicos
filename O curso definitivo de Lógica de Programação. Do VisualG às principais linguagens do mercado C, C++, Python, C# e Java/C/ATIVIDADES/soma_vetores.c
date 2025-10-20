#include <stdio.h>

int main (){

    int x,i,soma,media,cont;
    
    printf("Quantos numeros voce vai digitar?: ");
    scanf("%d",&x);

    int vetor[x];

    for(i= 0;i < x ; i++){
        printf("Digite um numero: ");
        scanf("%d",&vetor[i]);
    }
    soma = 0;
    cont = 0; 
    for(i= 0; i < x; i++){
        soma = soma + vetor[i];
        cont = cont + 1;        
    }
    media = soma / cont;
    printf("Valores = ");
    for(i= 0; i < x; i++){
        printf("%d ",vetor[i]);
    }
    printf("\n");
    printf("soma = %d\n",soma);
    printf("media = %d\n",media);

    
    return 0;
}