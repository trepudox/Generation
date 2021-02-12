package Exercicios;

import java.util.Scanner;

public class Exe3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int segundos;
		int[] resultado = new int[3];
		
		System.out.print("Quantos segundos dura o evento da fábrica? ");
		segundos = scanner.nextInt();
		
		resultado[0] = segundos / 3600;
		resultado[1] = (segundos % 3600) / 60;
		resultado[2] = (segundos % 3600) % 60;
		
		System.out.printf("O evento da fábrica dura %d horas, %d minutos e %d segundos.", resultado[0], resultado[1], resultado[2]);
		
		scanner.close();
	}
	
}
