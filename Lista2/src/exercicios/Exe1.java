package exercicios;

import java.util.Scanner;

public class Exe1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, maiorNumero;
		int[] numerosDigitados = new int[3];
		
		System.out.print("Insira o valor do 1º número: ");
		numero = scanner.nextInt();
		maiorNumero = numero;
		numerosDigitados[0] = numero;
		
		for(int i = 1; i < 3; i++) 
		{
			System.out.printf("Insira o valor do %d número: ", i+1);
			numero = scanner.nextInt();
			numerosDigitados[i] = numero;
			if(numero > maiorNumero) 
			{
				maiorNumero = numero;
			}
			
		}
		
		System.out.print("\nOs números digitados foram: ");
		for(int digitados: numerosDigitados) 
		{
			System.out.print(digitados + " ");
		}
		System.out.println("\nE o maior deles é o número " + maiorNumero);
		
		
		scanner.close();
	}
	
}
