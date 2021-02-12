package exercicios;

public class Patinete {
	
	private String modelo;
	private String marca;
	private String cor;
	private int rodas;
	private int velocidade = 0;
	
	private static int limite = 32;
	
	//Setter do atributo rodas
	private void setRodas(int rodas) 
	{
		if(rodas < 2 || rodas > 3) 
		{
			System.out.printf("Você digitou %d rodas. Um patinete por padrão possui 2 ou 3 rodas. Foi definido que este patinete possui 2 rodas.", rodas);
			this.rodas = 2;
		}
	}
	
	//Construtor
	public Patinete(String modelo, String marca, String cor, int rodas) 
	{
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.setRodas(rodas);
	}
	
	//Getters dos atributos
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getCor() {
		return cor;
	}

	public int getRodas() {
		return rodas;
	}

	public int getVelocidade() {
		return velocidade;
	}
	
	public void acelerar() 
	{	
		System.out.println();
		if(this.velocidade >= 0 && this.velocidade <= 8)
		{
			this.velocidade += 2;
			System.out.printf("Você acelerou o patinete e ele agora atingiu a velocidade de %d km/h.", this.velocidade);
		}
		else if(this.velocidade >= 10 && this.velocidade <= 18) 
		{
			this.velocidade += 2;
			System.out.printf("Você está ficando rápido! O patinete acelerou ainda mais, e agora atingiu %d km/h.", this.velocidade);
		}
		else if(this.velocidade >= 20 && this.velocidade <= 24) 
		{
			this.velocidade += 2;
			System.out.printf("Você está muito rápido!!! O patinete já está com velocidade de %d km/h!", this.velocidade);
		}
		else if(this.velocidade >= 26 && this.velocidade <= 28) 
		{
			this.velocidade += 2;
			System.out.printf("Você está quase na velocidade limite!!!! O patinete bateu %d km/h!!!!!", this.velocidade);
		}
		else if(this.velocidade == 30) 
		{
			this.velocidade += 2;
			System.out.println("É o patinete mais rápido do mundo!!! Você alcançou o limite!!!! É melhor parar antes que se machuque!");
		}
		else 
		{
			System.out.println("Nossa! O patinete bateu e você perdeu toda a velocidade. Que pena...");
			this.velocidade = 0;
		}
	}

}
