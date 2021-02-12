package exercicios;

public class Pessoa {
	
	private String nome = null;
	private int idade = 0;
	private double altura = 0;
	private int peso = 0;
	private double imc = 0;
	private boolean calcularImc = false;
	private String endereco = null;
	private String telefone = null;
	
	public Pessoa() 
	{
		
	}
	
	public Pessoa(String nome, int idade, String endereco, String telefone) 
	{
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, int idade, double altura, int peso, boolean calcularImc) 
	{
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.calcularImc = calcularImc;
		if(calcularImc) 
		{
			this.imc = this.peso / (this.altura * this.altura);			
		}
		else 
		{
			this.imc = 0;
		}
	}
	
	public Pessoa(String nome, int idade, double altura, int peso, boolean calcularImc, String endereco, String telefone) 
	{
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.calcularImc = calcularImc;
		this.endereco = endereco;
		this.telefone = telefone;
		if(calcularImc) 
		{
			this.imc = this.peso / (this.altura * this.altura);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		if(calcularImc) 
		{
			this.imc = this.peso / (this.altura * this.altura);
		}
	}

	public int getPeso() 
	{
		return this.peso;
	}
	
	public void setPeso(int peso) 
	{
		this.peso = peso;
		if(calcularImc) 
		{
			this.imc = this.peso / (this.altura * this.altura);
		}
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double getIMC() 
	{
		return this.imc;
	}

	public void fichaPessoal() 
	{
		System.out.println();
		if(this.nome != null) 
		{
			System.out.println("Nome: " + this.nome);			
		}
		if(this.idade != 0) 
		{
			System.out.println("Idade: " + this.idade);			
		}
		if(this.altura != 0) 
		{
			System.out.println("Altura: " + this.altura);			
		}
		if(this.peso != 0) 
		{
			System.out.println("Peso: " + this.peso);			
		} 
		if(this.imc != 0) 
		{
			System.out.printf("IMC: %.2f\n", this.imc);			
		}
		if(this.endereco != null) 
		{
			System.out.println("Endereço: " + this.endereco);
		}
		if(this.telefone != null) 
		{
			System.out.println("Telefone: " + this.telefone);
		}
	}
	
}
