package exercicios;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma = 0, qtd = 0;
		int numero;
		
		do 
		{
			System.out.print("Digite um n�mero: ");
			numero = scanner.nextInt();
			if(numero % 3 == 0 && numero != 0) 
			{
				soma += numero;
				qtd++;
			}
			
		} while(numero != 0);
		
		System.out.printf("\nA soma dos n�meros foi %.0f e a m�dia de %.2f", soma, soma / qtd);
		
		scanner.close();
	}
	
}
