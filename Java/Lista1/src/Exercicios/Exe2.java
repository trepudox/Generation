package Exercicios;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrada, anos, meses, dias;
		
		System.out.print("Quantos dias voc� j� viveu? ");
		entrada = scanner.nextInt();
		
		anos = entrada / 365;
		meses = (entrada % 365) / 30;
		dias = (entrada % 365) % 30;
		
		System.out.printf("\nVoc� j� viveu cerca de %d anos, %d meses e %d dias.", anos, meses, dias);
		
		scanner.close();
	}
	
}
