import java.util.Scanner;
public class crescente {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Digite dois numeros: ");
    a = sc.nextInt();
    b = sc.nextInt();
    
    while(a != b) {
    	if(a > b) {
    		System.out.println("DECRECESNTE!");
    	}
    	else {
    		System.out.println("CRESCENTE!");
    	}
    	System.out.println("Digite dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    sc.close();
	}

}
