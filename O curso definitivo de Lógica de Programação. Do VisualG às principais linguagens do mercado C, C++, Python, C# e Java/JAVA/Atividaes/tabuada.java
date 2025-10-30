import java.util.Scanner;
public class tabuada {
//d
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
            int x,i,soma;
            
            System.out.print("Deseja tabuada para qual valor?: ");
            x = sc.nextInt();
            
            for(i=1; i<11 ; i++){
            	soma = x * i;
            	System.out.println(x+" x "+ i+" = "+soma);
            	
            }
            
            sc.close();
        }
		
	}

}
