#include <stdio.h>

int main(){
    int n,quantosNegativos;

    printf("Qual a ordem da matriz?");
    scanf("%d",&n);

    int matriz[n] [n];

    for(int i =0; i < n; i++){
        for (int j = 0; j < n; j++)
        {
            printf("Elemento [%d,%d]: ",i,j);
            scanf("%d", &matriz[i][j]);
        }
        
    }

    printf("diagonal principal:\n");

    for (int i=0; i<n; i++){
        printf("%d ", matriz[i][i]);
    }

    quantosNegativos = 0;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++)
        {
            if (matriz[i] [j] < 0)
            {
                quantosNegativos++;
            }
            
        }
            
        printf("\nQUANTIDADE DE NEGATIVOS = %d\N", quantosNegativos);
    }


    return 0;
}