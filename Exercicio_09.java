package Modulo;

/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("Insira um número: ");
		N = sc.nextInt();
		
		if ( N % 2 == 0 ) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
