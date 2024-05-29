package Modulo;

/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N, v, v1, r = 0;
		
		System.out.println("Insira a quantidade dde repetições: ");
		N = sc.nextInt();
		
		for ( int i=0; i<N; i=i+1 ) {
			
			System.out.println("Insira dois números: ");
			v = sc.nextInt();
			v1 = sc.nextInt();
			
			if ( v1 == 0 ) {
				System.out.println("divisão impossível");
			}
			else {
				r = v / v1 ;
				System.out.printf( "%.1f%n", r );
			}
		
		}
		
		sc.close();

	}

}
