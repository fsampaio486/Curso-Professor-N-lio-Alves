package Modulo;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, nPeca1, codigo2, nPeca2;
		float valorUnitario1, valorUnitario2, tot;
		
		System.out.println("Código da peça: ");
		codigo1 = sc.nextInt();
		
		System.out.println("Quantidade de peças: ");
		nPeca1 = sc.nextInt();
		
		System.out.println("Valor unitário: ");
		valorUnitario1 = sc.nextFloat();
		
		System.out.println("Código da peça: ");
		codigo2 = sc.nextInt();
		
		System.out.println("Quantidade de peças: ");
		nPeca2 = sc.nextInt();
		
		System.out.println("Valor unitário: ");
		valorUnitario2 = sc.nextFloat();
		
		tot = (nPeca1 * valorUnitario1) + (nPeca2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", tot);
		
		sc.close();

	}
}
