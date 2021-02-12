package exercicios;

public abstract class Animal {

	private String especie;
	private String nome;
	private int idade;
	
	public Animal(String especie, String nome, int idade) 
	{
		this.especie = especie;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public String getEspecie() 
	{
		return this.especie;
	}
	
	public int getIdade() 
	{
		return this.idade;
	}
	
	public abstract void emitirSom();
	
	public void fichaAnimal() 
	{
		System.out.println();
		System.out.println(this.getEspecie() + " " + this.getNome());
		System.out.println("\tNome: " + this.getNome());
		System.out.println("\tIdade: " + this.getIdade() + " anos");
	} 
	
}
