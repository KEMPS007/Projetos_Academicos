#include <stdio.h>

int main(){

    int x,y;
    //printf("Digite 2 numeros:\n ");
    //scanf("%d",&x);
    //scanf("%d",&y);


    while (x != y)
    {
        printf("Digite 2 numeros:\n");
        scanf("%d",&x);
        scanf("%d",&y);

        if (x < y || y > x){
            printf("CRESENTE\n");
        }
        else if(x > y || y < x){
            printf("DECRESENTE\n");
        }
         
    }
    

    return 0;
}