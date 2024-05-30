package Modulo;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema.
*/

public class Exercicio_28_Student {
	
	public String nome;
	public double nota1Tri;
	public double nota2Tri;
	public double nota3Tri;
	public double notaFinal;
	public String status;
	
	public double notaFinalAluno() {
		return nota1Tri + nota2Tri + nota3Tri;
	}
	
	public String statusAluno() {
		 
		if (notaFinalAluno() >= 60) {
			return status = "PASS";
		} 
		else {
			return status = "FAILED MISSING, "
					+ (60 - notaFinalAluno()) + " POINTS ";
		}
	}
	
	public String toString() {
		return "FINAL GRADE: "
				+ String.format("%.2f", notaFinalAluno())
				+ ", "
				+ statusAluno();
	}

}
