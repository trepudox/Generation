package Exercicios;

import java.util.Scanner;

public class Exe8 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int custoFabrica;
		double custoConsumo;
		
		System.out.print("Insira o custo de fábrica do veículo: ");
		custoFabrica = scanner.nextInt();
		
		custoConsumo = custoFabrica + custoFabrica * 0.28 + custoFabrica * 0.45;
		
		System.out.printf("O custo de fábrica do veículo é de R$ %d. Já o custo ao consumidor é de R$ %.2f.", custoFabrica, custoConsumo);
		
		scanner.close();
	}
	
}
