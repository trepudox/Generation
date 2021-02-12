package exercicios;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) 
	{
		super("Preguiça", nome, idade);
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println(this.getNome() + ": som de preguiça");
	}
	
	public void subirArvore() 
	{
		System.out.println("O " + this.getEspecie() + " " + this.getNome() + " está subindo em uma árvore!");
	}
	
	public void fichaAnimal() 
	{
		super.fichaAnimal();
		System.out.println();
	}
	
}
