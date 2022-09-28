package Ex3;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa() {
		super();
	}
	
	public Pessoa getNomeCompleto() {
		Pessoa aux = new Pessoa(this.nome,this.sobrenome);
		return aux;
	}
	
	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
