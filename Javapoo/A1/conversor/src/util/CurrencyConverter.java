package util;

public class CurrencyConverter {
	
	public static double IOF = 0.011;
		
	
	
	public static double Reais(double dollars,double Dollar) {
		return dollars * Dollar * (1.0 + IOF);
	}
		
	
	

}
