package exercicios;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private int idade;
	private int peso;
	private double altura;
	private double salario;
	private int idFuncionario;

	private static int ids = 1;

	public Funcionario(String nome, int idade, int peso, double altura, double salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setSalario(salario);
		this.setIdFuncionario();
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double getSalario() {
		return salario;
	}

	public String getSalarioFormatado() {
		return formataMoeda(salario);
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private void setPeso(int peso) {
		this.peso = peso;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}

	private void setIdFuncionario() {
		this.idFuncionario = ids;
		ids++;
	}

	private String formataMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}

	public void aumentarSalario(double porcentagem) {
		double salarioAtual = this.salario;
		this.salario = salarioAtual * (1 + porcentagem / 100);
		System.out.println("O salário do funcionário " + this.nome + ", que era de " + formataMoeda(salarioAtual)
				+ " sofreu um aumento de " + porcentagem + "%, se tornando agora " + formataMoeda(this.salario) + ".");
	}

	public void diminuirSalario(double porcentagem) {
		double salarioAtual = this.salario;
		this.salario = salarioAtual * (1 - porcentagem / 100);
		System.out.println("O salário do funcionário " + this.nome + ", que era de " + formataMoeda(salarioAtual)
				+ " sofreu um aumento de " + porcentagem + "%, se tornando agora " + formataMoeda(this.salario) + ".");
	}

	public void infoFuncionario() 
	{
		System.out.println("\nFuncionário " + this.idFuncionario + ":");
		System.out.println("\tNome: " + this.nome);
		System.out.println("\tIdade: " + this.idade);
		System.out.printf("\tPeso: %d kg\n", this.peso);
		System.out.println("\tAltura: " + this.altura);
		System.out.printf("\tSalario: %s\n\n", formataMoeda(this.salario));
	}
}
