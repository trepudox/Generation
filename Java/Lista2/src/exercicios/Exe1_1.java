package exercicios;

import java.util.Scanner;

public class Exe1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, maiorNumero;
		
		System.out.println("digite o numero: ");
		numero = scanner.nextInt();
		maiorNumero = numero;
		
		System.out.println("digite outro numero: ");
		numero = scanner.nextInt();
		if(numero > maiorNumero) 
		{
			maiorNumero = numero;
		}
		
		System.out.println("digite o ultimo numero: ");
		numero = scanner.nextInt();
		if(numero > maiorNumero) 
		{
			maiorNumero = numero;
		}
		
		System.out.println("O maior numero foi o " + maiorNumero);
		
		scanner.close();
	}
	
}
