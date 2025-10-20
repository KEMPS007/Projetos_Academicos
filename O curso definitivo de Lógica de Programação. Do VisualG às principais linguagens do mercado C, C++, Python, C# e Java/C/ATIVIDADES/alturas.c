#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");    
}

int main(){
    int n,menores;
    double alturatotal,alturamedia,percentualMenores;
    
    printf("Quantas pessoas? :");
    scanf("%d",&n);

    char nome[n][50];
    int idade[n];
    double altura[n];

    for(int i = 0;i < n; i++ ){
        printf("dados da %d° pessoa:\n ",i + 1);
        printf("nome: ");
        limpar_entrada();
        ler_texto(nome[i],50);
        printf("idade: ");
        scanf("%d", &idade[i]);
        printf("altura: ");
        scanf("%lf,", &altura[i]);


    }

    menores = 0; 
    alturatotal = 0;

    for (int i=0; i < n; i++){
        if (idade[i] < 16)
        {
          menores++;/* code */
        }
        alturatotal = alturatotal + altura[i];
    }

    alturamedia = alturatotal + n;
    percentualMenores = ((double) menores / n) * 100.0;

    printf("\nAltura media = %.2lf\n", alturamedia);
    printf("Pessoas com menos de 16 anos: %.1lf%\n", percentualMenores);

    for(int i=0; i < n; i++){
        if (idade[i] < 16){
            printf("%s\n", nome[i]);
        }
    }
    return 0;
}