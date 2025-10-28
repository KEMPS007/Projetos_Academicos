
import java.util.Scanner;
import java.util.Locale;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double area,base,altura,perimetro,diagonal;
		
		System.out.print("Digite a base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		diagonal = Math.sqrt(base*base + altura * altura);
		
		System.out.println("AREA = " + String.format("%.4f",area) );
		System.out.println("PERIMETRO = " + String.format("%.4f",perimetro));
		System.out.println("DIAGONAL = " +  String.format("%.4f",diagonal));
		
		sc.close();
		
		

	}

}