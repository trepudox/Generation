package poo;

public class AlunoMain {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Marco", 18, 1.64, 57, "F132HB-5");
		
		aluno1.fichaPessoal();
		
		Teste teste = new Teste();
		System.out.println(teste.getClass());
	}
}
