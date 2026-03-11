package exerciciosAula1;

import java.util.Scanner;

public class Ex4 {
	static Scanner in = new Scanner(System.in);
	static double n1;
	static double n2;

	public static void pedirNumeros() {
		System.out.println("Digite N1: ");
		double a = in.nextDouble();
		System.out.println("Digite N2: ");
		double b = in.nextDouble();
		n1 = a;
		n2 = b;

	}

	public static void main(String[] args) {
		System.out.println("Escolha uma opção do menu: ");
		System.out.println("");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Sair");
		System.out.println("");
		int opcao = in.nextInt();

		switch (opcao) {

		case 1:
			pedirNumeros();
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;

		case 2:
			pedirNumeros();
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;

		case 3:
			pedirNumeros();
			System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
			break;

		case 4:
			pedirNumeros();
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		}
		System.out.println("");
		System.out.println("Programa Encerrado");
	}

}
