package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vect = new int [n];
		
		for(int i=0;i <n; i++) {
			System.out.printf("Digite um numero : ");
			int numero = sc.nextInt();
			vect [i] = numero;
		}
		System.out.println("NUMEROS NEGARIVOS: ");
		for(int i=0; i <n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
