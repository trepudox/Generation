package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exe2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrada;
		int[] lista = {-2147483648, -2147483648, -2147483648};
		
		for(int i = 0; i < 3; i++) 
		{
			System.out.print("Insira um número: ");
			entrada = scanner.nextInt();
			if(entrada >= lista[2]) 
			{
				lista[0] = lista[1];
				lista[1] = lista[2];
				lista[2] = entrada;
			}
			else if(entrada >= lista[1]) 
			{
				lista[0] = lista[1];
				lista[1] = entrada;
			}
			else 
			{
				lista[0] = entrada;
			}
			
		}
		
		System.out.println("\nOrdem crescente: " + Arrays.toString(lista));
		scanner.close();
	}
	
}
