package poo1;

import java.util.Scanner;

public class Automovel {
	Scanner scanner = new Scanner(System.in);
	
	//Declaração dos atributos
	private String modelo;
	private String marca;
	private String cor;
	private String placa;
	private int ano;
	private int rodas;
	private int portas;
	
	//Construtor padrão
	public Automovel() 
	{
		
	}
	
	//Construtor para motos
	public Automovel(String modelo, String marca, String cor, String placa, int ano) 
	{
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}
	
	//Construtor para carros
	public Automovel(String modelo, String marca, String cor, String placa, int ano, int portas) 
	{
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.ano = ano;
		this.portas = portas;
		this.rodas = 4;
	}
	
	public void infoAutomovel() 
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Placa: " + this.placa);
		System.out.println("Ano: " + this.ano);
		System.out.println("Portas: " + this.portas);
		System.out.println("Rodas: " + this.rodas);
	}
	
	public String getModelo() 
	{
		return this.modelo;
	}
	
	public void setModelo() 
	{
		System.out.print("Digite o modelo do seu carro: ");
		modelo = scanner.next();
	}
	
}
