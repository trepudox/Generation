package poo;

//Uma classe abstrata não pode ser instanciada, ela serve apenas como base para outras subclasses.
public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private int peso;
	
	public Pessoa(String nome, int idade, double altura, int peso) 
	{
		setNome(nome);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
	}
	
	private void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	private void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	private void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	private void setPeso(int peso) 
	{
		this.peso = peso;
	}
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public int getIdade() 
	{
		return this.idade;
	}
	
	public double getAltura() 
	{
		return this.altura;
	}
	
	public int getPeso() 
	{
		return this.peso;
	}
	
	public void fichaPessoal() 
	{
		if(this.nome != null) 
		{
			System.out.println("Nome: " + this.nome);			
		}
		if(this.idade != 0) 
		{
			System.out.println("Idade: " + this.idade);			
		}
		if(this.altura != 0) 
		{
			System.out.println("Altura: " + this.altura);			
		}
		if(this.peso != 0) 
		{
			System.out.println("Peso: " + this.peso);			
		} 
	}
	
}