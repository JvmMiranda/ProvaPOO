package Ex2;

public class Main {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(3);
		System.out.println(c.getRaio());
		System.out.println(c.area());
		System.out.println(c.perimetro());
		System.out.println();
		c.setRaio(6);
		System.out.println(c.getRaio());
		System.out.println(c.area());
		System.out.println(c.perimetro());
	}

}
