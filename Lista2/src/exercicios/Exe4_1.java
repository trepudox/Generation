package exercicios;

import java.util.Scanner;

public class Exe4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) 
		{
			System.out.printf("\nO n�mero %d � par\n", numero);
			System.out.printf("A raiz quadrada de %d � %.2f", numero, Math.sqrt(numero));
		}
		else 
		{
			System.out.printf("\nO n�mero %d � �mpar\n", numero);
			System.out.printf("O n�mero %d ao quadrado vale %d", numero, (int) Math.pow(numero, 2));
		}
		
		scanner.close();
	}
}
