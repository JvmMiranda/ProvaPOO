package Ex4;

public class Corrente extends Conta {
	double taxa;

	public Corrente(double saldo, double taxa) {
		super(saldo);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void setSaldoDep(double saldo) {
		saldo -= taxa;
		super.setSaldoDep(saldo);
	}
	
	public void setSaldoSac(double saldo) {
		saldo -= taxa;
		super.setSaldoSac(saldo);
	}
}
