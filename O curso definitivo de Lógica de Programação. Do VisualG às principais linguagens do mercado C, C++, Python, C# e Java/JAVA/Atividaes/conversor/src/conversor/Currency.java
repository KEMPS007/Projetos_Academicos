package conversor;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Currency {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price?%n");
		double Dollar = sc.nextDouble();
		System.out.printf("How many dollars will be bought?%n");
		double dollars = sc.nextDouble();
		double result = CurrencyConverter.Reais(dollars, Dollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		sc.close();
		

	}

}
