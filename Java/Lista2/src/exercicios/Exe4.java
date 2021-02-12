package exercicios;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int numero = scanner.nextInt();
		
		switch(numero % 2) 
		{
		case 0:
			System.out.println("\nO número " + numero + " é par");
			System.out.printf("A sua raiz quadrada vale %.2f", Math.sqrt(numero));
			break;
		case 1:
			System.out.println("\nO número " + numero + " é ímpar");
			System.out.println("O seu quadrado vale " + (int) Math.pow(numero, 2));
			break;
		}
		
		scanner.close();
	}
}
