package programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduc;
import entities.Product;
import entities.UsedProduct;
public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product>list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Product #" +i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double Customsfee = sc.nextDouble();
				Product p = new ImportedProduc (name,price,Customsfee);
				list.add(p);
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				Product p = new UsedProduct(name,price,LocalDate.parse(date,dd));
				list.add(p);
			}
			else {
				Product p = new Product(name,price);
				list.add(p);
			}
			
		}
		System.out.println("PRICE TAGS: ");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
