package exercicios;

import java.util.Scanner;

public class Exe2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int par = 0, impar = 0, numero;
		
		for(int i = 0; i < 10; i++) 
		{
			System.out.print("Escolha um n�mero: ");
			numero = scanner.nextInt();
			if(numero % 2 == 0) 
			{
				par++;
			}
			else 
			{
				impar++;
			}
		}
		
		System.out.printf("\nTivemos %d n�meros pares e %d n�meros �mpares.", par, impar);
		
		scanner.close();
	}
}
