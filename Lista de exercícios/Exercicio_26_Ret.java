package Modulo;

/*
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
Usar uma classe como mostrado no projeto ao lado.
*/

public class Exercicio_26_Ret {
	
	public double height;
	public double width;
	
	double result;
	
	public double arearectangle() {
		return width * height;
	}
	public double perimeterrectangle() {
		return 2 * (height + width);
	}
	
	public double diagonalrectangle () {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)) ;
	}

	public String toString() {
		return 	"AREA = "
				+ String.format("%.2f", arearectangle()) 
				+ " PERIMETER = "
				+ String.format("%.2f",perimeterrectangle())
				+ " DIAGONAL = "
				+ String.format("%.2f", diagonalrectangle());
				
	}

}
