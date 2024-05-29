package Modulo;

/*
 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.
*/

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("Insira um valor: ");
		valor1 = sc.nextInt();
		System.out.println("Insira outro valor: ");
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("A soma dos valores é = "+ soma);	
		
		sc.close();

	}
}
