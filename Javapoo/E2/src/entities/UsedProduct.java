package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate ManufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() 
				+ " Manufacture date: " 
				+ ManufactureDate.format(dd); 
		
	}
}
