import java.util.Scanner;
public class soma_vetor {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n,i,soma;
			float media;
			
			
			System.out.print("Quantos numeros voce vai digitar: ");
			n = sc.nextInt();
			
			int [] vet = new int [n];
			
			soma = 0;
			int cont1 = 0;
			for (i = 0; i < n; i++) {
				System.out.print("Digete um numero: ");
				vet[i] = sc.nextInt();
				soma = soma + vet[i];
				cont1 = cont1 + 1;
			}
			
			media = (float)soma / cont1;
			
			System.out.print("VALORES: ");		
			for(i = 0; i < n; i++){
				System.out.print(" "+vet[i]);
			}
			System.out.println();
			System.out.println("soma = " + soma);
			System.out.println("MEDIA = "+ media);
			
			sc.close();
		}
	}

}
