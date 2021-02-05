package exercicioArrayList;

import java.util.List;
import java.util.ArrayList;

public class Estoque implements Esqueleto {
	
	private ArrayList<String> listaProdutos = new ArrayList<String>();
	private ArrayList<Integer> listaQuantidade = new ArrayList<Integer>();
	
	public Estoque() {}
	
	@Override
	public void create(String produto) 
	{
		if(listaProdutos.contains(produto)) 
		{
			System.out.println("\nProduto já existente!\n");
		}
		else 
		{
			listaProdutos.add(produto);
			listaQuantidade.add(0);
			System.out.println("\nProduto criado com sucesso.\n");
		}
	}
	
	@Override
	public void create(String produto, int quantidade) 
	{
		if(listaProdutos.contains(produto)) 
		{
			System.out.println("\nProduto já existente!\n");
		}
		else 
		{
			listaProdutos.add(produto);
			listaQuantidade.add(setQuantidade(quantidade));
			System.out.println("\nProduto criado com sucesso.\n");
		}
	}

	@Override
	public void update(String produto, int quantidade) 
	{
		if(!listaProdutos.contains(produto)) 
		{
			System.out.println("\nProduto não existe!\n");
		}
		else 
		{
			listaQuantidade.set(listaProdutos.indexOf(produto), quantidade);
			System.out.println("\nProduto atualizado com sucesso.\n");
		}
	}
	
	@Override
	public void update(String produto, String produtoNovo)
	{
		if(!listaProdutos.contains(produto)) 
		{
			System.out.println("\nProduto não existe!\n");
		}
		else 
		{
			listaProdutos.set(listaProdutos.indexOf(produto), produtoNovo);
			System.out.println("\nProduto atualizado com sucesso.\n");
		}
	}
		
	@Override
	public void update(String produto, String produtoNovo, int quantidade)
	{
		if(!listaProdutos.contains(produto)) 
		{
			System.out.println("\nProduto não existe!\n");
		}
		else 
		{
			listaProdutos.set(listaProdutos.indexOf(produto), produtoNovo);
			listaQuantidade.set(listaProdutos.indexOf(produtoNovo), setQuantidade(quantidade));
			System.out.println("\nProduto atualizado com sucesso.\n");
		}
	}
	
	@Override
	public void read() 
	{
		System.out.println();
		System.out.println("Produtos: " + listaProdutos);
		System.out.println("Quantidade: " + listaQuantidade);
		System.out.println();
	}
	
	@Override
	public void read(String produto) 
	{
		if(!listaProdutos.contains(produto))
		{
			System.out.println("\nProduto não existe!\n");
		}
		else 
		{
			System.out.println();
			System.out.println("Produto: " + produto);
			System.out.println("Quantidade: " + listaQuantidade.get(listaProdutos.indexOf(produto)));
			System.out.println();
		}
	}
	
	@Override
	public void delete(String produto) 
	{
		if(!listaProdutos.contains(produto)) 
		{
			System.out.println("\nProduto não existe!\n");
		}
		else 
		{
			listaQuantidade.remove(listaProdutos.indexOf(produto));
			listaProdutos.remove(listaProdutos.indexOf(produto));
			System.out.println("\nProduto removido com sucesso.\n");
		}
	}
	
	private Integer setQuantidade(Integer valor) 
	{
		if(valor >= 0) 
		{
			return valor;			
		}
		else 
		{
			return 0;
		}
	}
	
}
