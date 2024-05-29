package Modulo;

/*
 * Ler um número inteiro N e calcular todos os seus divisores.
 */

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Insira um número: ");
		N = sc.nextInt();
		
		for ( int i=0; i<=N; i=i+1 ) {
			
			if ( N % i == 0 ) {
				
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
