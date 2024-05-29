package Modulo;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.
*/

public class Exercicio_27_Fun {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double grossSalary) {
		this.grossSalary += this.grossSalary *= (grossSalary / 100);
	}

	public String toString() {
		return	 name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}

}
