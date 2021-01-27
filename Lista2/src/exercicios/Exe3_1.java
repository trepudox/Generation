package exercicios;

import java.util.Scanner;

public class Exe3_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		
		System.out.print("Insira sua idade: ");
		idade = scanner.nextInt();
		
		if(idade >= 10 && idade <= 14) 
		{
			System.out.println("Categoria infantil.");
		}
		else if(idade > 14 && idade < 18) 
		{
			System.out.println("Categoria juvenil.");
		}
		else if(idade >= 18 && idade <= 25) 
		{
			System.out.println("Categoria adulta.");
		}
		else 
		{
			System.out.println("Essa idade não se enquadra em nenhuma categoria.");
		}
		
		scanner.close();
	}
}
