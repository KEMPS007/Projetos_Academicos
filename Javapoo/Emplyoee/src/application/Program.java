package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How many employees will be registered? ");
			int n = sc.nextInt();
			Emplyoee[] vect = new Emplyoee[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("Emplyoee #"+(i+1)+":");
				System.out.print("ID: ");
				Integer id = sc.nextInt();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				
				Emplyoee emp = new Emplyoee(id,name,salary);
				vect[i] = emp;
			}
			System.out.println();
			System.out.println("Enter the employee id that will have salary increase :");
			int id = sc.nextInt();
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			for(Emplyoee emp : vect) {
				if(emp.getId() == id) {
					emp.increaseSalary(percentage);
				}
				else if(emp.getId() != id) {
					System.out.println("This id does not exist!");
				}
			}
			System.out.println("List of employees: ");
			for(int i=0;i < vect.length; i++) {
				System.out.println(vect[i]);
			}
				
			
			
			
			
			sc.close();

	}

}
