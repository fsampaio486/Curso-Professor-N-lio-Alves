package Modulo;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.
*/

import java.util.Locale;
import java.util.Scanner;


public class Exercicio_27_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio_27_Fun program = new Exercicio_27_Fun();
		
		System.out.println("Employee name: ");
		program.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		program.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		program.tax = sc.nextDouble();
		
		System.out.println("Empoiler: " + program.toString());
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		double grossSalary = sc.nextDouble();
		program.increaseSalary(grossSalary);
		
		System.out.println();
		System.out.println("Updated data: " + program.toString());
	
		
		sc.close();

	}

}
