package Modulo;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_28_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio_28_Student program = new Exercicio_28_Student();
		
		System.out.println("Nome do Aluno: ");
		program.nome = sc.nextLine();
		
		System.out.println("Insira as notas do trimeste: ");
		program.nota1Tri = sc.nextDouble();
		program.nota2Tri = sc.nextDouble();
		program.nota3Tri = sc.nextDouble();
		
		System.out.println(program.toString());
		
		sc.close();

	}

}
