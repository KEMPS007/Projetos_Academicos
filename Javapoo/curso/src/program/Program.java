package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i <n;i++) {
			System.out.print("digite um numero: ");
			double m = sc.nextDouble();
			vect[i] = m;
		}
		System.out.print("VALORES = ");
		double soma =0;
		for(int i=0; i<n;i++) {
			System.out.print(" "+vect[i]);
			soma += vect[i];
		}
		System.out.println();
		double media = soma/n;
		System.out.println("SOMA = "+ soma);
		System.out.println("MEDIA = "+ media);
		
		
		
		
		sc.close();

	}

}
