package exercicios;

public class Cavalo extends Animal {
	private String cor;
	
	public Cavalo(String nome, int idade, String cor) 
	{
		super("Cavalo", nome, idade);
		this.cor = cor;
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println(this.getNome() + ": Iiihhh");
	}
	
	@Override
	public void fichaAnimal() 
	{
		super.fichaAnimal();
		System.out.println("\tCor: " + this.cor);
		System.out.println();
	}
	
	public void correr() 
	{
		System.out.println("O " + this.getEspecie() + " " + this.getNome() + " está correndo!");
	}
	
	public String getCor() 
	{
		return this.cor;
	}
	
}
