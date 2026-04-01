import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? :");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] idade = new int[n];
		double[] alturas = new double[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da "+ (i+1) +"° pessoa ");
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			System.out.print("altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma = soma + alturas[i];
		}
		
		double media = soma /n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n",media);
		
		int cont = 0;
		for (int i=0; i<n; i++) {
			if(idade[i] < 16) {
				cont = cont + 1;
			}
		}
		
		double porcentagem = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagem);
		
		for (int i=0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}
