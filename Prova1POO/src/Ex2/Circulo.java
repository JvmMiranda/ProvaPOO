package Ex2;

public class Circulo {
	private double raio; // Em cm 

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	public String area() {
		double area = 0;
		String res;
		area = Math.PI * Math.pow(this.raio, 2);  
		res = String.format("%.2f", area);
		return res;
	}
	public String perimetro(){
		double perimetro = 0;
		String res;
		perimetro = 2 * Math.PI * this.raio;
		res = String.format("%.2f", perimetro);
		return res;
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
	
	
	
}
