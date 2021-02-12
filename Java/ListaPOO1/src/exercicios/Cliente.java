package exercicios;

import java.util.Scanner;

public class Cliente {
	private Scanner scanner = new Scanner(System.in);
	
	private String nome;
	private int idade;
	private double credito;
	private int codigoCliente;

	private static int cont = 1;
	
	public Cliente() 
	{
		this.setNome();
		this.setIdade();
		this.setCredito();
		this.setCodigoCliente();
		cont++;
		System.out.println();
	}

	private void setNome() 
	{
		System.out.print("Informe o seu nome: ");
		this.nome = scanner.nextLine();
	}
	
	private void setIdade() 
	{
		System.out.print("Informe sua idade: ");
		this.idade = scanner.nextInt();
	}
	
	private void setCredito() 
	{
		System.out.print("Informe quantos reais em crédito você possui: ");
		this.credito = scanner.nextDouble();
	}
	
	private void setCodigoCliente() 
	{
		this.codigoCliente = cont;
	}
	
	public void infoCliente() 
	{
		System.out.println("\nCliente de código " + this.codigoCliente + ":\nNome: " + 
				this.nome + "\nIdade: " + this.idade + "\nCrédito: " + this.credito);
	}
	
}
