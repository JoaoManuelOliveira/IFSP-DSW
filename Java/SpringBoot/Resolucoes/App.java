package br.com.ifsp.aulaMaven;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

//João Manuel Oliveira

// Exercicio de String utilizando a classe StringUtils

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um texto qualquer");
		String texto = in.nextLine();
		System.out.println(StringUtils.capitalize(texto)); //coloca a primeira lera maiúscula
		System.out.println(StringUtils.abbreviate(texto, 13)); //se o texto tiver 13 ou mais caracteres, o mesmo sera abreviado para apenas 13, sendo os ultimos 3: "..."
		System.out.println(StringUtils.center(texto, 200)); //centraliza
		System.out.println(StringUtils.countMatches(texto, "a"));//conta quantos caracteres ou cadeia de caracteres tem
		System.out.println(StringUtils.wrap(texto, "-")); //envolve a string

		
		
	}
}
