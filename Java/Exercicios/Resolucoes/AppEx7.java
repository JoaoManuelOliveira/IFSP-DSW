package exerciciosAula2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppEx7 {
	static Scanner in = new Scanner(System.in);
	static ArrayList<ProdutoEx7> listinha = new ArrayList<>();

	public static void cadastrarProduto() {
		String nome;
		double preco;
		int estoque;

		System.out.println("Cadastre um produto: ");
		System.out.println("");
		System.out.println("Digite o nome:");
		nome = in.nextLine();
		System.out.println("");
		System.out.println("Digite o preço:");
		preco = in.nextDouble();
		System.out.println("");
		System.out.println("Digite o estoque:");
		estoque = in.nextInt();

		ProdutoEx7 produto = new ProdutoEx7();
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setEstoque(estoque);
		listinha.add(produto);
	}

	public static void listarProdutos() {
		for (ProdutoEx7 produtinho : listinha) {
			System.out.println("Nome: " + produtinho.getNome() + " - Preço: R$" + produtinho.getPreco() + " - Estoque: "
					+ produtinho.getEstoque());
			System.out.println("");

		}
	}

	public static void main(String[] args) {

		int opcao = 0;

		while (opcao != 3) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produto");
			System.out.println("3 - Encerrar Aplicação");
			opcao = in.nextInt();
			in.nextLine(); // limpa o enter do scanner pq estava bugando
			switch (opcao) {
			case 1:
				cadastrarProduto();
				break;

			case 2:
				listarProdutos();
				break;
			}
			if (opcao > 3 || opcao < 1) {
				System.out.println("Dígito Inválido");
				System.out.println("");
			}

			if (opcao == 3) {
				System.out.println("");
				System.out.println("Programa Encerrado.");
			}
		}

	}

}
