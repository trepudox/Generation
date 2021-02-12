package exercicios;

import java.util.Scanner;

public class Exe3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0, pessoas21 = 0, pessoas50 = 0;
		
		while(idade != -99) 
		{
			System.out.print("Insira alguma idade: ");
			idade = scanner.nextInt();
			while((idade < 0 && idade != -99) || idade > 130) 
			{
				System.out.print("\nInsira uma idade válida: ");
				idade = scanner.nextInt();
				System.out.println();
			}
			
			if(idade < 21 && idade != -99) 
			{
				pessoas21++;
			}
			else if(idade > 50) 
			{
				pessoas50++;
			}
			
		}
			
		System.out.printf("\nNo total, temos %d pessoas com menos de 21 anos e %d pessoas com mais de 50 anos", pessoas21, pessoas50);
		
		scanner.close();
	}
	
}
