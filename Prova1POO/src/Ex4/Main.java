package Ex4;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Conta[] c = new Conta[10];
		
		Random g = new Random();
		
		for(int i = 0; i < 10; i++) {
			if(g.nextInt(2) == 1) {
				c[i] = new Corrente(g.nextInt(1000),g.nextInt(10));
			}else {
				c[i] = new Poupanca(g.nextInt(1000),g.nextInt(100));
			}
		}
		
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("Rendimento da conta poupanca: " + ((Poupanca)c[i]).CalculaRendimento());
			}
			catch(Exception e) {
				System.out.println("Saldo da conta: "+((Corrente)c[i]).getSaldo());
			}
		}
	}

}
