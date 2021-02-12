package exercicios;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0, soma = 0;
		
		do 
		{
			System.out.print("Insira um número: ");
			numero = scanner.nextInt();
			soma += numero;
			
		} while(numero != 0);
		
		System.out.println("\nResultado da soma: " + soma);
		
		scanner.close();
	}
	
}
