package Modulo;

/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		if ( num < -1 ) {
			System.out.println("NEGATIVO");
			
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
