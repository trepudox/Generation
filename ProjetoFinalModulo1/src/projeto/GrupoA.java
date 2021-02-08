package projeto;

public class GrupoA extends Veiculos {

	public GrupoA(String fabricante, String placa, String modelo, int ano, int qntd_lugares, 
	         boolean blindado, boolean ar_condicionado, boolean automatico,
	         boolean adaptavel, boolean disponivel) {
			 super(fabricante, placa, modelo, ano, qntd_lugares, blindado, ar_condicionado, automatico, adaptavel, disponivel);
			 this.setCategoria('A');
	}
	
	@Override
	public double calculaTotal() {
		return getQntd_dias()*1159.58;
	}
	
	@Override
	public double calculaSeguro() {
		if(!isSeguro()) {
			return 0;
		}
		else {
			return calculaTotal()*0.15;
		}
	}

}
