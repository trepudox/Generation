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
			System.out.printf("Voc� digitou %d rodas. Um patinete por padr�o possui 2 ou 3 rodas. Foi definido que este patinete possui 2 rodas.", rodas);
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
			System.out.printf("Voc� acelerou o patinete e ele agora atingiu a velocidade de %d km/h.", this.velocidade);
		}
		else if(this.velocidade >= 10 && this.velocidade <= 18) 
		{
			this.velocidade += 2;
			System.out.printf("Voc� est� ficando r�pido! O patinete acelerou ainda mais, e agora atingiu %d km/h.", this.velocidade);
		}
		else if(this.velocidade >= 20 && this.velocidade <= 24) 
		{
			this.velocidade += 2;
			System.out.printf("Voc� est� muito r�pido!!! O patinete j� est� com velocidade de %d km/h!", this.velocidade);
		}
		else if(this.velocidade >= 26 && this.velocidade <= 28) 
		{
			this.velocidade += 2;
			System.out.printf("Voc� est� quase na velocidade limite!!!! O patinete bateu %d km/h!!!!!", this.velocidade);
		}
		else if(this.velocidade == 30) 
		{
			this.velocidade += 2;
			System.out.println("� o patinete mais r�pido do mundo!!! Voc� alcan�ou o limite!!!! � melhor parar antes que se machuque!");
		}
		else 
		{
			System.out.println("Nossa! O patinete bateu e voc� perdeu toda a velocidade. Que pena...");
			this.velocidade = 0;
		}
	}

}
