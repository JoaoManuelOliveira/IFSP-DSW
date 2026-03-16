package exerciciosAula2;

import java.util.Scanner;

public class AppEx8 {
	public static void menu() {
		System.out.println("");
		System.out.println("---Umbra Payments---");
		System.out.println("(1) Depositar");
		System.out.println("(2) Sacar");
		System.out.println("");
	}

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		Scanner in = new Scanner(System.in);
		System.out.println("---Umbra Payments---");
		System.out.println("Digite o nome do titular: ");
		String titular = in.nextLine();
		conta1.setTitular(titular);
		System.out.println("Digite o saldo inicial: ");
		double saldo = in.nextDouble();
		conta1.setSaldo(saldo);
		int opcao = 0;

		while (opcao != 3) {
			menu();
			System.out.println("Bem vindo(a) " + conta1.getTitular());
			opcao = in.nextInt();
			if(opcao == 1) {
				System.out.println("");
				System.out.println("Saldo: R$" + conta1.mostrarSaldo());
				System.out.println("Valor do depósito: ");
				double valorDeposito = in.nextDouble();
				conta1.depositar(valorDeposito);
			}
			
			if (opcao == 2) {
				System.out.println("");
				System.out.println("Saldo: R$" + conta1.mostrarSaldo());
				System.out.println("Digite o valor do saque: ");
				double valorSaque = in.nextDouble();
				if (valorSaque <= conta1.mostrarSaldo()) {
					conta1.sacar(valorSaque);
				} else {
					System.out.println("O valor do saque ultrapassa o seu saldo.");
				}
			}
		}

	}

}
