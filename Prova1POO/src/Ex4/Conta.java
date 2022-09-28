package Ex4;

public class Conta {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldoDep(double saldo) {
		this.saldo += saldo;
	}
	
	public void setSaldoSac(double saldo) {
		if(this.saldo < saldo) {
			System.out.println("Tu n�o tem tudo isso n�o irm�o");
		}else {
			this.saldo -= saldo;
		}
	}
	
	public Conta(double saldo) {
		super();
		if(saldo < 0) {
			System.out.println("Valor invalido saldo ajustado para 0.00: ");
		}else {
			this.saldo = saldo;
		}
	}
	
}
