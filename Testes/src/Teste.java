import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
//		ArrayList<Integer> lista = new ArrayList<Integer>();
//		
//		lista.add(11);
//		
//		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) 
		{
			System.out.println("oi");
		}
		
		int entrada = 0;
		System.out.println("\n\n\n");
		
		do
		{
			System.out.println("oi");
			System.out.print("Digite o valor de entrada: ");
			entrada = scanner.nextInt();

		} while(entrada != 0);
	
		
		System.out.println("fim");
	}
	
}
