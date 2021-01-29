package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		
		System.out.println("Preencha a matriz com os valores que você desejar.");
		for(int i = 0; i < matriz.length; i++) 
		{
			for(int j = 0; j < matriz.length; j++) 
			{
				System.out.printf("Matriz[%d][%d]: ", i, j);
				matriz[i][j] = scanner.nextInt();
				
				soma += matriz[i][j];
				
				if(i == j) 
				{
					somaDiagonal += matriz[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("A matriz ficou assim: ");
		for(int[] linhas: matriz) 
		{
			System.out.println(Arrays.toString(linhas));
		}
		
		System.out.printf("\nA soma dos elementos foi igual a %d, enquanto a soma da diagonal principal foi igual a %d.", soma, somaDiagonal);
		
		scanner.close();
	}
}
