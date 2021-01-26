package Exercicios;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.print("Digite a primeira nota: ");
		n1 = scanner.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = scanner.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = scanner.nextDouble();
		
		media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		
		System.out.printf("\nA média do aluno foi %.2f", media);
		
		scanner.close();
	}
	
}
