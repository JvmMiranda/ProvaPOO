package Ex4;

public class Poupanca extends Conta {
	private double rendimento;

	public Poupanca(double saldo, double rendimento) {
		super(saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public double CalculaRendimento() {
		double aux = this.getSaldo() * this.rendimento;
		return aux;
	}
}
