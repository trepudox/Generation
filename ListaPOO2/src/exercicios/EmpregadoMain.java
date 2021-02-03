package exercicios;

public class EmpregadoMain {
	public static void main(String[] args) {
		Empregado empre1 = new Empregado("Marco IV", 18, "Rua Z", "(11) 91111-1111", "S-01", 50000, 15);
		
//		empre1.fichaPessoal();
		
		empre1.fichaEmpregado();
		
		System.out.println();
		
		System.out.println(empre1.calcularSalario());

		System.out.println(empre1.calcularSalarioFormatado());
	}
}
