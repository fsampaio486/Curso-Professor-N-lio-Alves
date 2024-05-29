package Modulo;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Insira um valor: ");
		A = sc.nextInt();
		System.out.println("Insira outro valor: ");
		B = sc.nextInt();
		System.out.println("Insira outro valor: ");
		C = sc.nextInt();
		System.out.println("Insira outro valor: ");
		D = sc.nextInt();
		
		diferenca = (A*B-C*D);	
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();

	}
}
