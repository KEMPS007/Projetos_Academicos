#include<stdio.h>

int main(){


    float largura, comprimento, valor, area, preco;
    
    printf("Digite a largura do terreno: ");
    scanf("%f", &largura);

    printf("Digite o comprimento do terreno: ");
    scanf("%f", &comprimento);

    printf("Digite o valor do metro quantrado: ");
    scanf("%f", &valor);

    area = largura * comprimento;

    printf("Area do terreno = %f\n", area);

    preco = area * valor;

    printf("Preco do terreno = %f\n", preco);

    return 0;





}