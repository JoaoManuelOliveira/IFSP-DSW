package exerciciosAula1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um Número: ");
		int n = in.nextInt();
		System.out.println("");
		if (n % 2 == 0) {
			System.out.println("Número Par.");
		} else {
			System.out.println("Número Ímpar.");
		}
	}

}
