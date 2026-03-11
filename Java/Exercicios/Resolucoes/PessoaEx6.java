package exerciciosAula2;

public class PessoaEx6 {

	private String nome;
	private int idade;

	public void mostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + idade);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
