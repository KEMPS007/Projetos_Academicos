#include <stdio.h>

int main(){
    int x,soma,pessoas;
    float media;

    printf("Digite as idades: ");
    scanf("%d",&x);

    if(x < 0){
        printf("IMPOSSIVEL CALCULAR");
    }
    else{
        soma = 0;
        pessoas = 0;

        while (x > 0){
            
            soma = soma + x;
            pessoas = pessoas + 1;
            printf("Digite as idades: ");
            scanf("%d",&x);       
        }
        media = (float)soma / pessoas;
        printf("MDEIA DE IDADES = %.2f",media);
    }    
    return 0; 
}
    


