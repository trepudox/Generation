package exercicioArrayList;

public interface Esqueleto {
	public void create(String produto);
	public void create(String produto, int quantidade);
	
	public void update(String produto, int quantidadeNova);
	public void update(String produto, String produtoNovo);
	public void update(String produto, String produtoNovo, int quantidade);

	public void read();
	public void read(String produto);
	
	public void delete(String produto);
}
