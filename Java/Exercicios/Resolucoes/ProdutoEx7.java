package exerciciosAula2;

public class ProdutoEx7 {
	private String nome;
	private int estoque;
	private double preco;

	public void mostrarDados() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: R$" + preco);
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
