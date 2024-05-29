package Modulo;

/*
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
 casas decimais.
 Fórmula da área: area = π . raio2
 Considere o valor de π = 3.14159
 */

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double valor, area;
		double pi = 3.14159;
		
		System.out.println("Insira um valor: ");
		valor = sc.nextDouble();
		
		area = pi * (Math.pow(valor,2.0));
		
		System.out.printf("O valor da área é de: %.4f", area);

		sc.close();
		
	}
}
