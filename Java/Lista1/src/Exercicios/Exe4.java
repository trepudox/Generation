package Exercicios;

import java.util.Scanner;

public class Exe4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		double d, r, s;
		
		System.out.print("Informe o valor de A: ");
		a = scanner.nextInt();
		System.out.print("Informe o valor de B: ");
		b = scanner.nextInt();
		System.out.print("Informe o valor de C: ");
		c = scanner.nextInt();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		
		d = (r + s) / 2;
		
		System.out.print("\nResultado: " + d);
		
		scanner.close();
	}
	
}
