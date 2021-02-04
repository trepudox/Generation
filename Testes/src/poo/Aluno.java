package poo;

public class Aluno extends Pessoa {

	private String ra;
	
	public Aluno(String nome, int idade, double altura, int peso, String ra) 
	{
		super(nome, idade, altura, peso);
		setRa(ra);
	}
	
	private void setRa(String ra) 
	{
		this.ra = ra;
	}
	
	public String getRa() 
	{
		return this.ra;
	}
	
	@Override
	public void fichaPessoal() 
	{
		super.fichaPessoal();
		System.out.println("RA: " + this.ra);
	}
	
}
