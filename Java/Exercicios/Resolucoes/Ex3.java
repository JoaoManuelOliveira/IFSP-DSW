package exerciciosAula1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite nota 1:");
		double n1 = in.nextDouble();
		System.out.println("Digite nota 2:");
		double n2 = in.nextDouble();
		double media = (n1 + n2) / 2;
		System.out.println("");
		System.out.println("Média: " + media);
		System.out.println("");

		if (media >= 7) {
			System.out.println("Situação: Aprovado.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Situação: Recuperação.");

		} else {
			System.out.println("Situação: Reprovado.");

		}

	}

}
