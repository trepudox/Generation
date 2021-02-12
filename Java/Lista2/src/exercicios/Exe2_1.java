package exercicios;

import java.util.Scanner;

public class Exe2_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = scanner.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = scanner.nextInt();
		
		if(num1 >= num2 && num1 >= num3) 
		{
			if(num2 >= num3) 
			{
				System.out.printf("A ordem crescente dos números é: %d, %d, %d", num3, num2, num1);
			}
			else 
			{
				System.out.printf("A ordem crescente dos números é: %d, %d, %d", num2, num3, num1);
			}
		}
		else if(num2 >= num1 && num2 >= num3) 
		{
			if(num1 >= num3) 
			{
				System.out.printf("A ordem crescente dos números é: %d, %d, %d", num3, num1, num2);
			}
			else 
			{
				System.out.printf("A ordem crescente dos números é: %d, %d, %d", num1, num3, num2);
			}
		}
		else 
		{
			if(num1 >= num2) 
			{
				System.out.printf("A ordem crescente dos números é: %d, %d, %d", num2, num1, num3);
			}
			else 
			{
				System.out.printf("A ordem crescente dos números é: %d, %d, %d", num1, num2, num3);
			}
		}
		
		scanner.close();
	}
}
