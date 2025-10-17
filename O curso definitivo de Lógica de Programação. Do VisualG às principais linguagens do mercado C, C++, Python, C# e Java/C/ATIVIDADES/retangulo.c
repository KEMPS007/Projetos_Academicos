#include <stdio.h>
#include <math.h>


int main(){
    float altura,base,area,perimetro,diagonal;

    printf("Base do retangulo: ");
    scanf("%f", &base);

    printf("Altura do retabgulo: ");
    scanf("%f",&altura);

    area = base * altura;

    printf("AREA = %4.f/n",area);

    perimetro = 2 * (base + altura);

    printf("perimetro = %.4f\n", perimetro);

    diagonal = sqrt(base * base + altura * altura);

    printf("diagonal = %.4f\n", diagonal);

    return 0;
    

}