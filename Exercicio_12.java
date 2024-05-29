package Modulo;

/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
 * A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * CÓDIGO  ESPECIFICAÇÃO    PREÇO	
 * 1      Cachorro Quente   R$ 4.00
 * 2      X-Salada          R% 4.50
 * 3	  X-Bacon           R$ 5.00
 * 4   	  Torrada Simples   R$ 2.00
 * 5      Refrigerante      R$ 1.50
 */

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double codigo1 = 4.00;
		double codigo2 = 4.50;
		double codigo3 = 5.00;
		double codigo4 = 2.00;
		double codigo5 = 1.50;
		double qntd, tot = 0;
		int codigo;
		
		System.out.println("CÓDIGO  ESPECIFICAÇÃO  PREÇO");
		System.out.println("1     Cachorro Quente  R$4.50");
		System.out.println("2       X-Salada       R$4.50");
		System.out.println("3       X-Bacon        R$5.00");
		System.out.println("4    Torrada Simples   R$2.00");
		System.out.println("5     Refrigerante     R$1.50");

		System.out.println("Informe código do pedido: ");
		codigo = sc.nextInt();
		System.out.println("Insira a quantidade de itens");
		qntd = sc.nextDouble();
		
		if ( codigo == 1 ) {
			tot = qntd * codigo1;
		}
		else if ( codigo == 2 ) {
			tot = qntd * codigo2;
		}
		else if ( codigo == 3) {
			tot = qntd * codigo3;
		}
		else if ( codigo == 4 ) {
			tot = qntd * codigo4;
		}
		else if ( codigo == 5 ) {
			tot = qntd * codigo5;
		}
		else {
			System.out.println("Código inválido");
		}
		
		System.out.printf("Total: R$ %.2f", tot);
		
		sc.close();

	}

}
