package Exercicios;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d, e, f;
		double x, y;
		
		System.out.print("Insira o valor de A: ");
		a = scanner.nextInt();
		System.out.print("Insira o valor de B: ");
		b = scanner.nextInt();
		System.out.print("Insira o valor de C: ");
		c = scanner.nextInt();
		System.out.print("Insira o valor de D: ");
		d = scanner.nextInt();
		System.out.print("Insira o valor de E: ");
		e = scanner.nextInt();
		System.out.print("Insira o valor de F: ");
		f = scanner.nextInt();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.printf("\nO valor de x é %f e o de y é %f.", x, y);

		scanner.close();
	}

}
