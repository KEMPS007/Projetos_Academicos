package application;
import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma = soma + vect[i];
		}
		double media = soma / n;
		System.out.printf("Altura media: %.2f%n",media);
		
		sc.close();

	}

}
