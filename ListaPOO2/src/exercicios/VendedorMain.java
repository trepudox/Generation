package exercicios;

public class VendedorMain {
	public static void main(String[] args) {
		Vendedor vend1 = new Vendedor("Marco V", 18, "Rua A", "(11) 91111-1111", 59.99, 12);
		
		vend1.vender(100);
		vend1.abrirVenda();
		vend1.vender(112);
		vend1.fichaVendedor();
	}
}
