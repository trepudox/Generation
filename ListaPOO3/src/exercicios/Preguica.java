package exercicios;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) 
	{
		super("Pregui�a", nome, idade);
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println(this.getNome() + ": som de pregui�a");
	}
	
	public void subirArvore() 
	{
		System.out.println("O " + this.getEspecie() + " " + this.getNome() + " est� subindo em uma �rvore!");
	}
	
	public void fichaAnimal() 
	{
		super.fichaAnimal();
		System.out.println();
	}
	
}
