package Exercicios;

import java.util.Scanner;

public class Exe6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1, y1, x2, y2;
		double d;
		
		System.out.print("Determine a coordenada X de P1: ");
		x1 = scanner.nextInt();
		System.out.print("Determine a coordenada Y de P1: ");
		y1 = scanner.nextInt();
		
		System.out.print("\nDetermine a coordenada X de P2: ");
		x2 = scanner.nextInt();
		System.out.print("Determine a coordenada Y de P2: ");
		y2 = scanner.nextInt();
		
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("\nA dist�ncia entre os dois pontos � de aproximadamente %.2f unidades de medida.", d);
		
		scanner.close();
	}
	
}
