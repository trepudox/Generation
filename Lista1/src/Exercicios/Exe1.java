package Exercicios;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anos, meses, dias, resultado;
		
		System.out.print("Quantos anos de vida voc� tem? ");
		anos = scanner.nextInt();
		System.out.print("E quantos meses? ");
		meses = scanner.nextInt();
		System.out.print("E dias? ");
		dias = scanner.nextInt();
		
		resultado = dias + meses * 30 + anos * 365;
		
		System.out.printf("\nEnt�o, no total voc� j� viveu %d dias", resultado);
		
		scanner.close();
	}
	
}
