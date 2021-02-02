package poo;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String n,double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double sal) {
		this.salario = sal;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1+percentual/100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimirInfo()
	{
		System.out.println(nome+" "+" salario "+this.formatarMoeda());
	}

	
}
