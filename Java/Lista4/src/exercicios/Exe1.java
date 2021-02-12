package exercicios;

import java.util.Scanner;

public class Exe1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		double maiorNota = 0, soma = 0;
		
		System.out.println("Digite o valor de suas notas, iremos apresentar a maior delas, junto com a sua média.");
		for(int i = 0; i < notas.length; i++) 
		{
			System.out.printf("Nota %d: ", i+1);
			notas[i] = scanner.nextDouble();
			while(notas[i] > 10 || notas[i] < 0) 
			{
				System.out.println("\nDigite uma nota válida por favor.\n");
				System.out.printf("Nota %d: ", i+1);
				notas[i] = scanner.nextDouble();
			}
		}
		
		for(double nota: notas) 
		{
			if(nota > maiorNota)
			{
				maiorNota = nota;
			}
			soma += nota;
		}
		
		System.out.printf("\nSua média foi de %.2f em %d provas", soma / notas.length, notas.length);
		System.out.printf("\nJá a sua maior nota foi %.2f", maiorNota);
		
		
		scanner.close();
	}
	
}
