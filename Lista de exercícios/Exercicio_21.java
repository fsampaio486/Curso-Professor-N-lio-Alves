package Modulo;

/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		Double s1, s2, s3, soma1;
		
		System.out.println("Insira a quantidade de testes realizados: ");
		n = sc.nextInt();
		
		for ( int i=0; i<n; i=i+1 ) {
			
			System.out.println("Insira o peso dos testes: ");
			s1 = sc.nextDouble();
			s2 = sc.nextDouble();
			s3 = sc.nextDouble();
				
			soma1 = ( s1 * 2.0 + s2 * 3.0 + s3 * 5.0 ) / ( 2 + 3 + 5 );
			
			System.out.printf("%.1f%n", soma1);

		}
		
		sc.close(); 

	}

}
