package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee fun = new Employee();
		
		System.out.print("Name: ");
		fun.name = sc.nextLine();
		System.out.print("Gross salary: ");
		fun.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		fun.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + fun.name + ", $" + fun.netSalary());
		System.out.print("Which percentage to increase salary?");
		double porcentage = sc.nextDouble();
		fun.increseSalary(porcentage);
		System.out.println();
		System.out.println("Updated data: " + fun);
		
		sc.close();

	}

}
