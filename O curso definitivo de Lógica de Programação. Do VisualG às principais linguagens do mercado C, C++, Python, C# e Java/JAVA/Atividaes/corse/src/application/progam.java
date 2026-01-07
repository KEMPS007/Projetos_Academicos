package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangulo;

public class progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangulo x , y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("informe o valor do triagulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("informe o valor do triagulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();

		
		System.out.printf("triangle x area:%.4f%n",areaX);
		System.out.printf("triangle y area:%.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("larger area: x ");
		}
		else {
			System.out.println("larger area: y ");
		}
		
		sc.close();

	}

}
