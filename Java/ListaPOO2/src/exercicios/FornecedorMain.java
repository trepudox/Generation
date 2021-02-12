package exercicios;

public class FornecedorMain {
	public static void main(String[] args) {
		Fornecedor forn1 = new Fornecedor("Marco III", 18, "Rua Y", "(11) 91111-1111", 1000, 150);
		
		System.out.println(forn1.obterSaldo());
		
		forn1.fichaPessoal();
		
		forn1.fichaFornecedor();

		System.out.println(forn1.obterSaldo());
	}
}
