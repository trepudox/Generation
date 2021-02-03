package exercicios;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	private int valorCredito;
	private int valorDivida;
	
	public Fornecedor(String nome, int idade, String endereco, String telefone, int valorCredito, int valorDivida) 
	{
		super(nome, idade, endereco, telefone);
		this.valorCredito = valorCredito;
		setValorDivida(valorDivida);
	}
	
	public int getValorCredito() 
	{
		return this.valorCredito;
	}
	
	public int getValorDivida() 
	{
		return this.valorDivida;
	}
	
	public void setValorCredito(int novoValor) 
	{
		this.valorCredito = novoValor;
	}
	
	public void setValorDivida(int novoValor) 
	{
		if(novoValor < 0) 
		{
			this.valorDivida = 0;
		}
		else 
		{
			this.valorDivida = novoValor;			
		}
	}
	
	private String formataMoeda(int valor) 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}
	
	public String obterSaldo() 
	{
		return formataMoeda(this.valorCredito - this.valorDivida);
	}
	
	public void fichaFornecedor() 
	{
		super.fichaPessoal();
		System.out.println("Saldo disponível: " + formataMoeda(valorCredito));
		System.out.println("Divida atual: " + formataMoeda(valorDivida));
		System.out.println();
	}
}