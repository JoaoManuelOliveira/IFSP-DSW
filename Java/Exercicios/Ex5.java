package exerciciosAula1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite N para ver a tabuada (até o 20)");
		int n = in.nextInt();

		for (int i = 0; i <= 20; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}

}
