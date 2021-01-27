package exercicios;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrada;
		
		System.out.print("Insira a idade: ");
		entrada = scanner.nextInt();
		
		switch(entrada) 
		{
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
			System.out.println("Categoria infantil.");
			break;
		case 15:
		case 16:
		case 17:
			System.out.println("Categoria juvenil.");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
			System.out.println("Categoria adulto.");
			break;
		default:
			System.out.println("Você não está em nenhuma categoria.");
		}
		
		scanner.close();
	}
	
}
