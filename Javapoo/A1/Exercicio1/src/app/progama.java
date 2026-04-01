package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.retangulo;

public class progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo Retangulo = new retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		Retangulo.width = sc.nextDouble();
		Retangulo.height = sc.nextDouble();
		
		//double area = Retangulo.Area();
		double diagonal = Retangulo.diagonal();
		double perimetro = Retangulo.Perimetro();
		
		System.out.println();
		System.out.println("AREA = " + Retangulo.Area()%.2f);
		System.out.println("PERIMETER = " + perimetro);
		System.out.println("DIAGONAL = " + diagonal); 
		
		
		
		sc.close();

	}

}
