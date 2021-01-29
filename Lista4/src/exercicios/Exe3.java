package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Defina o quantidade de linhas da matriz: ");
		int x = scanner.nextInt();
		System.out.print("Defina o quantidade de colunas da matriz: ");
		int y = scanner.nextInt();
		
		int[][] matriz1 = new int[x][y];
		int[][] matriz2 = new int[x][y];
		int[][] n1 = new int[x][y];
		int[][] n2 = new int[x][y];
		
		System.out.println("\nAgora, defina os valores das matrizes");
		
		for(int i = 0; i < matriz1.length; i++) 
		{	
			for(int j = 0; j < matriz1[i].length; j++) 
			{
				System.out.printf("Matriz1[%d][%d]: ", i, j);
				matriz1[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("--------------------------\n");
		
		for(int i = 0; i < matriz2.length; i++) 
		{	
			for(int j = 0; j < matriz2[i].length; j++) 
			{
				System.out.printf("Matriz2[%d][%d]: ", i, j);
				matriz2[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		
		for(int i = 0; i < matriz1.length; i++) 
		{	
			for(int j = 0; j < matriz1[i].length; j++) 
			{
				n1[i][j] = matriz1[i][j] + matriz2[i][j]; 
			}
		}
		
		for(int i = 0; i < matriz1.length; i++) 
		{	
			for(int j = 0; j < matriz1[i].length; j++) 
			{
				n2[i][j] = matriz1[i][j] - matriz2[i][j]; 
			}
		}
		
		System.out.println("\n\nA soma das matrizes foi a seguinte: ");
		for(int[] listas: n1) 
		{
			System.out.println(Arrays.toString(listas));
		}
		
		System.out.println("\nJá a diferença foi: ");
		for(int[] listas: n2) 
		{
			System.out.println(Arrays.toString(listas));
		}
				
		scanner.close();
	}
}
