package exercicios;

import java.text.NumberFormat;

public class Vendedor extends Pessoa {
	private double valorVenda;
	private double comissao;
	private int numeroDeVendas;
	private double valorVendido;
	private double valorLucro;
	private boolean vendaAberta;

	public Vendedor(String nome, int idade, String endereco, String telefone, double valorVenda, int comissao) 
	{
		super(nome, idade, endereco, telefone);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
		this.numeroDeVendas = 0;
		this.valorVendido = 0;
		this.valorLucro = 0;
		this.vendaAberta = false;
	}
	
	public double getValorVenda() 
	{
		return this.valorVenda;
	}
	
	public double getComissao() 
	{
		return this.comissao;
	}
	
	public int getNumeroDeVendas() 
	{
		return this.numeroDeVendas;
	}
	
	public double getValorVendido() 
	{
		return this.valorVendido;
	}
	
	public double getValorLucro() 
	{
		return this.valorLucro;
	}
	
	private String formataMoeda(double valor) 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}
	
	public void vender(int unidadesVendidas) 
	{
		if(this.vendaAberta)
		{
			double valorObtidoNessaVenda = this.valorVenda * unidadesVendidas;
			double lucroObtidoNessaVenda = (this.valorVenda * unidadesVendidas) * (comissao / 100);
			
			this.numeroDeVendas += unidadesVendidas;
			this.valorVendido += valorObtidoNessaVenda;
			this.valorLucro += lucroObtidoNessaVenda;
			
			System.out.printf("Nesta venda, %s conseguiu vender %d unidades do seu produto, obtendo %s e %s de lucro."
					+ "\nNo total, %s já vendeu %d unidades, ganhando %s e lucrando %s.\n\n", this.getNome(), unidadesVendidas,
					formataMoeda(valorObtidoNessaVenda), formataMoeda(lucroObtidoNessaVenda), this.getNome(), 
					this.numeroDeVendas, formataMoeda(this.valorVendido), formataMoeda(valorLucro) );			
		}
		else 
		{
			System.out.println("A venda de " + this.getNome() + " está fechada no momento.");
		}
	}

	public void fichaVendedor() 
	{
		super.fichaPessoal();
		System.out.println("Valor de venda: " + this.valorVenda);
		System.out.println("Comissão em cada venda: " + this.comissao + "%");
		System.out.println("Número de unidades vendidas: " + this.numeroDeVendas);
		System.out.println("Valor em reais vendido: " + formataMoeda(valorVendido));
		System.out.println("Lucro em reais: " + formataMoeda(valorLucro));
	}
	
	public void abrirVenda() 
	{
		if(!this.vendaAberta) 
		{
			System.out.println(this.getNome() + " abriu sua venda!");
			this.vendaAberta = true;			
		}
		else 
		{
			System.out.println("A venda de " + this.getNome() + " já estava aberta.");
		}
	}
	
	public void fecharVenda() 
	{
		if(this.vendaAberta) 
		{
			System.out.println(this.getNome() + " fechou a venda...");
			this.vendaAberta = false;			
		}
		else 
		{
			System.out.println("A venda de " + this.getNome() + " já estava fechada.");
		}
	}
}
