#include<stdio.h>
#include<string.h>

int main ()
{
    int idade;
    double salario,altura;
    //char genero;
    char nome [50];

    printf("Digite o valor da idade: ");
    scanf("%d", &idade);
    printf("Digite o valor do salario: ");
    scanf("%lf", &salario);
    printf("Digite a sua altura: ");
    scanf("%lf", &altura);
    printf("Digite o nome da pessoa: ");
    scanf("%s", nome);

    return 0;
}