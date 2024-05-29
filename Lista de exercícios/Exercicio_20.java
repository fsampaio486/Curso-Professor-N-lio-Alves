package Modulo;

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, n = 0, soma1 = 0, soma2 = 0;
		
		System.out.println("Informe quantos valores deseja insrir: ");
		x = sc.nextInt();
		
		for (int i=0; i<x; i=i+1 ) {
			
			System.out.println("Informe os valores insrir: ");
			n = sc.nextInt();
		
			if ( n >= 10 && n <= 20 ) {
				soma1 = soma1 + 1;
			}
			else {
				soma2 = soma2 + 1;
			}
			
		}
		
		System.out.println("in " + soma1);
		System.out.println("out " + soma2);
		
		sc.close();

	}

}
