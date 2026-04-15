package entities;

public class ImportedProduc extends Product {
	
	private Double customsFee;
	
	public ImportedProduc () {
		super();
	}

	public ImportedProduc(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price = price + customsFee;
	}
	@Override
	public String priceTag() {
		return name + " $" + totalPrice() + " (Customs fee: $" + customsFee+")";
	}
}
