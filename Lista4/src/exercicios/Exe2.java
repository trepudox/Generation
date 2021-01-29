package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exe2 {

	public static void main(String[] args) {
		Random random = new Random();
		double soma = 0;
		int maiorPontuacao = 0, indiceMaiorPontuacao = 0;
		int[] listaContadora = new int[6];
		int[] listaDado = new int[10];
		
		for(int i = 0; i < 10; i++) 
		{
			listaDado[i] = random.nextInt(6) + 1;
		}
		System.out.println("A sequ�ncia dos dados foi a seguinte: " + Arrays.toString(listaDado));
		
		for(double numero: listaDado) 
		{
			soma += numero;
		}
		System.out.println("A m�dia dos dados lan�ados foi: " + soma / listaDado.length);
		
		for(int numero: listaDado) 
		{
			listaContadora[numero - 1] += 1;
		}
		for(int i = 5; i >= 0; i--) 
		{
			if(listaContadora[i] == 0) 
			{
				continue;
			}
			else 
			{
				indiceMaiorPontuacao = i;
				maiorPontuacao = i + 1;
				break;
			}
		}
		
		System.out.printf("A maior pontua��o foi a %d, ela apareceu em %d ocasi�es diferentes.", maiorPontuacao, listaContadora[indiceMaiorPontuacao]);
		
	}
	
}
