package Ex3;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("JV","MM");
		Pessoa p2 = new Pessoa();
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println();
		
		p1.setNome("Bili");
		p1.setSobrenome("Bob");
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println();
		
		p2.setNome("Bi");
		p2.setSobrenome("Bb");
		System.out.println(p2.getNomeCompleto());
		System.out.println(p2.getNome());
		System.out.println(p2.getSobrenome());
		System.out.println();
	}

}
