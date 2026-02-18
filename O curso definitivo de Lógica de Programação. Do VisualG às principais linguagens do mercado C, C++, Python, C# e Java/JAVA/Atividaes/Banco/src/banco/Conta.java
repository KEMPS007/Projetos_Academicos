package banco;

import java.util.Locale;
import java.util.Scanner;

import entites.Cliente;

public class Conta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char letra = sc.next().charAt(0);
		double Balance = 0.0;
		while (letra != 'y' && letra != 'n') {
			System.out.printf("Is there na initial deposit (y/n)?");
			 letra = sc.next().charAt(0);
			
		}
		if (letra == 'y'){
			System.out.printf("Enter initial deposit value: ");
		 	Balance = sc.nextDouble();
			
		}
		
		Cliente stu = new Cliente(accountNumber,accountHolder,Balance);	
		
		System.out.println("Account data:");
		System.out.print("Account "+stu.getAccountNumber()+" Holder: "+ stu.getAccountHolder()+" Balance: $ "+ stu.getBalance());
		
		System.out.println();
		
		System.out.println("Do you want to make a withdrawal or a deposit? (w/d)");
		char letras = sc.next().charAt(0);
		
		while (letras != 'w' && letras != 'd') {
			System.out.print("Do you want to make a withdrawal or a deposit? (w/d)");
			 letras = sc.next().charAt(0);
		}
		if (letras == 'w') {
			System.out.print("Enter a withdraw value: ");
			double withdraw = sc.nextDouble();
			System.out.println("Updated Account data:");
			System.out.print("Account "+stu.getAccountNumber()+" Holder: "+ stu.getAccountHolder()+" Balance: $ "+ stu.withdraw(withdraw));
		}
		else if(letras == 'd') {
			System.out.println("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			System.out.println("Updated Account data:");
			System.out.print("Account "+stu.getAccountNumber()+" Holder: "+ stu.getAccountHolder()+" Balance: $ "+ stu.deposit(deposit));
		}
		
		sc.close();

	}

}
