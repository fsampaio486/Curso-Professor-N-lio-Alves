package Modulo;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id;
		float ht, valor, tot;
		
		System.out.println("Insira ID do funcionário: ");
		id = sc.nextInt();
		System.out.println("Insira total de horas trabalhadas: ");
		ht = sc.nextFloat();
		System.out.println("Insira valor por hora trabalhada: ");
		valor = sc.nextFloat();
		
		tot = ht * valor;
		
		System.out.printf("NUMBER ID %d%n", id);
		System.out.printf("SALARY = U$ %.2f", tot);
		
		sc.close();

	}
}
