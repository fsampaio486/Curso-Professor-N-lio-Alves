package Modulo;

/*
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, r, q, c;
		
		System.out.println("Inisira um número positivo: ");
		N = sc.nextInt();
		
		for ( int i=1; i<=N; i=i+1 ) {
			r = i+0;
			q = i*i;
			c = i * i * i;
			
			System.out.printf("%d %d %d%n", r, q, c);
			
		}
		
		sc.close();

	}

}
