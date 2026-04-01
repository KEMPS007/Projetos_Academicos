package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;


public class alunos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.print("Name: ");
		stu.name = sc.nextLine();
		System.out.println("Notas:");
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
	
		System.out.println();
		
		if(stu.notaFinal() > 60) {
			System.out.println("FINAL GRADE: "+ stu.notaFinal());
			System.out.printf("PASS");
			
		}else {
			System.out.println("FINAL GRADE: "+ stu.notaFinal());
			System.out.println("FAILED");
			double a = 60 - stu.notaFinal();
			System.out.printf("MISSING " + a + " POINTS");
			
		}
		
		
		sc.close();

	}

}
