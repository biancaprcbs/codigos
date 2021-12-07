package all;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private int idade;
	
	public Pessoa() {}
	
	public Pessoa(String nomeP, int cpfP, int idadeP) {
		this.nome = nomeP;
		this.cpf = cpfP;
		this.idade = idadeP;
	}
	
	// getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// toString
	
	public String toString() {
		return "Pessoa {" +
						"nome: "+ nome + '\'' +
						"cpf: "+ cpf + '\'' +
						"idade: "+ idade + '\'' +
						'}';
	}
}