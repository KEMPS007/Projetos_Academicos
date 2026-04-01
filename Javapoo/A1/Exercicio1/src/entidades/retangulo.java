package entidades;

public class retangulo {
	
	public double width;
	public double height;
	
	public double Area(){
		return width * height;
		
	}
	public double Perimetro(){
		return 2 * (width + height);
	}
	public double diagonal(){
		return Math.sqrt(width*width + height*height);
		//Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
		
	}
	
	

}
