import java.util.Scanner;
import java.util.Locale;
public class exercio_fixação {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int numero1,numero2,soma;
	
	System.out.print("Digite dois numeros para a soma:");
	numero1 = sc.nextInt();
	numero2 = sc.nextInt();
	soma = numero1 + numero2;
	
	System.out.print("O valor da soma deses 2 numeros é : "+ soma);
	
	sc.close();

	}

}
