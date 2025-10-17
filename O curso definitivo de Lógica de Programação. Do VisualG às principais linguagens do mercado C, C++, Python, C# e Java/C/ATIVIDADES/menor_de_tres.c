#include <stdio.h>

int main(){

    int primerioNumero, segundoNumero,terceiroNumero;
    
    printf("Digite o primeiro numero: ");
    scanf("%i",&primerioNumero);
    printf("Digite o segundo numero: ");
    scanf("%i",&segundoNumero);
    printf("Digite o terceiro numero: ");
    scanf("%i",&terceiroNumero);

    if (primerioNumero < segundoNumero && primerioNumero < terceiroNumero){
        printf("MENOR = %i",primerioNumero);
    }
    else if (segundoNumero < primerioNumero && segundoNumero < terceiroNumero ){
            printf("MENOR = %i", segundoNumero);    
    }
    else 
        printf("MENOR = %i",terceiroNumero);
    

    return 0;
}