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
			System.out.println("Impossível ligar o/a " + this.nome + ", está sem bateria.");
		}
		else if(!this.desligado) 
		{
			System.out.println("O/A " + this.nome + " já está ligado!");
		}
		else 
		{
			System.out.println(this.nome + " agora está ligado.");
			this.desligado = false;
		}
	}
	
	public void desligar() 
	{
		if(this.desligado) 
		{
			System.out.println(this.nome + " já está desligado.");
		}
		else 
		{
			System.out.println(this.nome + " agora está desligado.");
			this.desligado = true;
		}
	}

	public void usar() 
	{
		if(this.desligado) 
		{
			System.out.println("Não é possível usar " + this.nome + " enquanto está desligado!");
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
			System.out.println("A bateria de " + this.nome + " está ficando sem carga...");
			this.desligar();
			this.setBateria(0);
		}
	}
}
