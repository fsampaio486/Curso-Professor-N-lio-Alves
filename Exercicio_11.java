package Modulo;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inicio, fim, htot, htot1;
		
		System.out.println("Insira hora inicial: ");
		inicio = sc.nextInt();
		
		System.out.println("Insira a hora final: ");
		fim = sc.nextInt();
		
		if ( inicio < fim ) {
			htot = fim - inicio;
		}
		else {
			htot = 24 - inicio + fim;
		}

		System.out.printf("O JOGO DUROU %d HORAS", htot);
		
		sc.close();

	}

}
