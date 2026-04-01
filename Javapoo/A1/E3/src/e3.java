import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		System.out.println("Digite dois numeros para ver se são multiplos");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.print("sao multiplos!");
			
		}
		else {
			System.out.print("Nao sao multiplos!!");
		}
		
		sc.close();

	}

}
