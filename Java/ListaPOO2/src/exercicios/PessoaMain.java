package exercicios;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa();
		
		pes1.fichaPessoal();
		
		Pessoa pes2 = new Pessoa("Marco I", 18, 1.64, 57, true);
		
		pes2.fichaPessoal();
		
		Pessoa pes3 = new Pessoa("Marco II", 18, 1.64, 57, false, "Rua X", "(11)91111-1111");
		
		pes3.fichaPessoal();
		
		pes3.setAltura(2.10);
		
		pes3.fichaPessoal();
	}
}
