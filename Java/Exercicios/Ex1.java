package exerciciosAula1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int a = in.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = in.nextInt();
		int soma = a + b;

		if (a > b) {
			System.out.println("O número " + a + " é o maior.");
		} else if (b > a) {
			System.out.println("O número" + b + "é o maior.");

		} else {
			System.out.println("Os números são iguais.");
		}
		System.out.println("");
		System.out.println("Soma: " + soma);
	}
}
