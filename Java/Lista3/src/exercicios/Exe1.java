package exercicios;

public class Exe1 {
	
	public static void main(String[] args) {
		System.out.println("Os n�meros de 1000 a 1999 que obtemos resto 5 ao dividir por 11 s�o:");
		for(int i = 1000; i < 2000; i++) 
		{
			if(i % 11 == 5) 
			{
				System.out.print(i + " ");
			}
			
			if(i == 1248 || i == 1501 || i == 1754) 
			{
				System.out.println();
			}
		}
	}
	
}
