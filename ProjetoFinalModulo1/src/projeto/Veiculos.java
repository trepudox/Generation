package projeto;

public abstract class Veiculos {
	private String fabricante;
	private String placa;
	private String modelo;
	private char categoria;
	private int ano;
	private int qntd_lugares;
	private int qntd_dias;
	private String local_retirada;
	private String local_entrega;
	private boolean blindado;
	private boolean ar_condicionado;
	private boolean automatico;
	private boolean adaptavel;
	private boolean seguro;
	private boolean disponivel;
	
	public Veiculos(String fabricante, String placa, String modelo, int ano, int qntd_lugares, 
			         boolean blindado, boolean ar_condicionado, boolean automatico,
			         boolean adaptavel, boolean disponivel) {
		this.fabricante = fabricante;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.qntd_lugares = qntd_lugares;
		this.blindado = blindado;
		this.ar_condicionado = ar_condicionado;
		this.automatico = automatico;
		this.adaptavel = adaptavel;
		this.disponivel = disponivel;
	}

	@Override
	public String toString() 
	{
		String msg = "Modelo: " + this.modelo + "\nFabricante: " + this.fabricante + "\nAno: " + this.ano + "\nPlaca: " + 
				this.placa + "\nLugares: " + qntd_lugares + "\nBlindado: " + (this.blindado ? "Sim" : "N�o") + "\nAr condicionado: " 
				+ (this.ar_condicionado ? "Sim" : "N�o") + "\nAutom�tico: " + (this.automatico ? "Sim" : "N�o") + "\nAdapt�vel: "
				+ (this.adaptavel ? "Sim" : "N�o") + "\nDispon�vel para loca��o: " + (this.disponivel ? "Sim" : "N�o");
		
		return msg;
	}
	
	public char getCategoria() 
	{
		return this.categoria;
	}

	public void setCategoria(char categoria) 
	{
		this.categoria = categoria;
	}
	
	public boolean isDisponivel() 
	{
		return this.disponivel;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public int getQntd_dias() {
		return qntd_dias;
	}

	public void setQntd_dias(int qntd_dias) {
		this.qntd_dias = qntd_dias;
	}

	public String getLocal_retirada() {
		return local_retirada;
	}

	public void setLocal_retirada(String local_retirada) {
		this.local_retirada = local_retirada;
	}

	public String getLocal_entrega() {
		return local_entrega;
	}

	public void setLocal_entrega(String local_entrega) {
		this.local_entrega = local_entrega;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	  
	public abstract double calculaTotal();
	public double calculaTaxa() {
		if(this.local_entrega.equalsIgnoreCase(this.local_retirada)) {
			return 0;
		}
		else {
			return 300;
		}
	}
	public abstract double calculaSeguro();
	
	public double calculaTotalTotal() {
		return calculaTotal() + calculaSeguro() + calculaTaxa();
	}
	
	public void setDisponivel(boolean disponivel) 
	{
		this.disponivel = disponivel;
	}
	
}
