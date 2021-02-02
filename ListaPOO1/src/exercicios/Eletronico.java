package exercicios;

public class Eletronico {
	
	private String marca;
	private String nome;
	private int bateria = 100;
	private boolean semBateria = false;
	private boolean desligado = true;
	
	
	public Eletronico(String marca, String nome)
	{
		this.marca = marca;
		this.nome = nome;
	}
	
	public void setBateria(int b) 
	{
		if(b >= 100) 
		{
			this.bateria = 100;
			this.semBateria = false;
		}
		else if(b <= 0) 
		{
			this.bateria = 0;
			this.semBateria = true;
			this.desligado = true;
		}
		else
		{
			this.bateria = b;
			this.semBateria = false;
			
		}
	}
	
	public int getBateria() 
	{
		return this.bateria;
	}
	
	public void ligar() 
	{
		if(this.semBateria) 
		{
			System.out.println("Imposs�vel ligar o/a " + this.nome + ", est� sem bateria.");
		}
		else if(!this.desligado) 
		{
			System.out.println("O/A " + this.nome + " j� est� ligado!");
		}
		else 
		{
			System.out.println(this.nome + " agora est� ligado.");
			this.desligado = false;
		}
	}
	
	public void desligar() 
	{
		if(this.desligado) 
		{
			System.out.println(this.nome + " j� est� desligado.");
		}
		else 
		{
			System.out.println(this.nome + " agora est� desligado.");
			this.desligado = true;
		}
	}

	public void usar() 
	{
		if(this.desligado) 
		{
			System.out.println("N�o � poss�vel usar " + this.nome + " enquanto est� desligado!");
		}
		else 
		{
			System.out.println(this.nome + " foi usado.");
			usarBateria();
		}
	}
	
	public void infoEletronico() 
	{
		System.out.println("\nMarca: " + this.marca);
		System.out.println("Nome: " + this.nome);
		System.out.println("Bateria atual: " + this.bateria);
	}

	private void usarBateria() 
	{
		this.bateria -= 10;
		if(bateria <= 0) 
		{
			System.out.println("A bateria de " + this.nome + " est� ficando sem carga...");
			this.desligar();
			this.setBateria(0);
		}
	}
}
