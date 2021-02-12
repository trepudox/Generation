package exercicios;

import java.text.NumberFormat;

public class Empregado extends Pessoa {
	
	private String codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, int idade, String endereco, String telefone, String codigoSetor, double salarioBase, double imposto) 
	{
		super(nome, idade, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public String getCodigoSetor() 
	{
		return this.codigoSetor;
	}
	
	public double getSalarioBase() 
	{
		return this.salarioBase;
	}
	
	public double getImposto() 
	{
		return this.imposto;
	}
	
	public void setCodigoSetor(String novoValor) 
	{
		this.codigoSetor = novoValor;
	}
	
	public void setSalarioBase(double novoSalario) 
	{
		this.salarioBase = novoSalario;
	}
	
	public void setImposto(int novoImposto) 
	{
		this.imposto = novoImposto;
	}
	
	public void fichaEmpregado() 
	{
		super.fichaPessoal();
		System.out.println("Setor: " + this.codigoSetor);
		System.out.println("Salario bruto: " + this.salarioBase);
	}
	
	private String formatarMoeda(double valor) 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}
	
	public double calcularSalario() 
	{
		return (this.salarioBase * (1 - (this.imposto / 100)));
	}
	
	public String calcularSalarioFormatado() 
	{
		return formatarMoeda(this.calcularSalario());
	}
	
}
