package Modulo;

/*
 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
 * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
 * 
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
 * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 *
 * Renda Imposto de Renda
 * de R$ 0.00 a R$ 2000.00
 * de R$ 2000.01 a R$ 3000.00
 * de R$ 3000.01 a R$ 4500.00
 * acima de R$ 4500.00
 *
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
 * duas casas decimais
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double valor, imp;
		
		System.out.println("Insira um valor em R$ ");
		valor = sc.nextDouble();
		
		if ( valor > 0.00 && valor < 2000.00 ) {
			System.out.println("Isento");
		}
		else if ( valor > 2000.01 && valor < 3000.00 ) {
			imp = valor * 0.08;
			System.out.printf("R$ %.2f", imp);
		}
		else if ( valor > 3000.01 && valor < 4500.00 ) {
			imp = (1000.00 * 0.08) + ( 2.00 * 0.18 );
			System.out.printf("R$ %.2f", imp);
		}
		else if ( valor > 4500.00) {
			
			imp = (valor - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08 ;
			
			System.out.printf("R$ %.2f", imp);
		}
		
		sc.close();

	}

}
