
public class Bola {
	String cor;
	double raio;
	
	
	public Bola(String cor, double raio) {
		super();
		this.cor = cor;
		this.raio = raio;
	}


	public Bola maiorBola(Bola bola2, Bola bola3) {
		if(bola2.raio >= bola3.raio) {
			if(bola2.raio == bola3.raio) {
				System.out.println("As bolas tem o mesmo raio");
			}
			return bola2;
		}else {
			return bola3;
		}
	}

	public String retornarDados() {
		String aux = "Cor: " + this.cor + " ; Raio: " + this.raio;
		return aux;
	}


	@Override
	public String toString() {
		return "Bola cor = " + cor + ", raio = " + raio;
	}
	
}
