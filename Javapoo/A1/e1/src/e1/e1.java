package e1;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Fale um numero para ver se ele é negativo ou positivo: ");
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.print("Esse numero é negativo!");
			
		}
		else{
			System.out.print("Esse numero é positivo");
			
		}
			
		
		sc.close();
	}

}
