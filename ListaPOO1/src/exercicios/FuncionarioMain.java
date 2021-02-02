package exercicios;

public class FuncionarioMain {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Marco", 18, 57, 1.64, 3000);
		Funcionario func2 = new Funcionario("Marco", 18, 57, 1.64, 3000);
		Funcionario func3 = new Funcionario("Marco", 18, 57, 1.64, 3000);
		
		System.out.println(func1.getSalarioFormatado());
		
		func1.diminuirSalario(10);
		func1.aumentarSalario(10);
		
		System.out.println(func1.getSalarioFormatado());
		
		func1.aumentarSalario(10);
		
		func1.infoFuncionario();
		func1.diminuirSalario(50);
		func1.infoFuncionario();
		func2.infoFuncionario();
		func3.infoFuncionario();
		
	}
}
