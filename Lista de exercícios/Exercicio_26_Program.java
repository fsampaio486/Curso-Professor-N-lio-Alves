package Modulo;

/*
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
Usar uma classe como mostrado no projeto ao lado.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_26_Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio_26_Ret product = new Exercicio_26_Ret();
		
		System.out.println("Enter rectangle width and height:");
		product.height = sc.nextDouble();
		product.width = sc.nextDouble();
		
		System.out.println();
		System.out.println(product.toString());
		
		sc.close();

	}

}
