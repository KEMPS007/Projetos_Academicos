import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero para ver se é par ou impar: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Esse numero é par");
		}
		else {
			System.out.print("Esse numero é impar");
		}
		
		sc.close();

	}

}
