package exercicios;

public class Cachorro extends Animal{
	private String raca;
	
	public Cachorro(String nome, int idade, String raca) 
	{
		super("Cachorro", nome, idade);
		this.raca = raca;
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println(this.getNome() + ": auau");
	}
	
	@Override
	public void fichaAnimal() 
	{
		super.fichaAnimal();
		System.out.println("\tRa�a: " + this.raca);
		System.out.println();
	}
	
	public void correr() 
	{
		System.out.println("O " + this.getEspecie() + " " + this.getNome() + " est� correndo!");
	}
	
	public String getRaca() 
	{
		return this.raca;
	}
	
}
