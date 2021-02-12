package poo4;

public class Cachorro extends Animal {
	
	private String raca;
	
	public Cachorro(String nome, int idade, String raca) 
	{
		super(nome, idade);
		this.raca = raca;
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("auau");
	}
	
	public void correr() 
	{
		System.out.println(this.getNome() + " est� correndo.");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	
}
