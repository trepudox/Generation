package exercicios;

import java.util.Scanner;
//    SEXO    	          OPÇÕES    
//------------        --------------
// 1-Feminino		  1-Calmo(a)
// 2-Masculino	      2-Nervoso(a)
// 3-Outros		      3-Agressivo(a)
public class Exe4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd = 0, sexo = 0, personalidade = 0, idade = 0, pessoasCalmas = 0, mulheresNervosas = 0;
		int homensAgressivos = 0, outrosCalmos = 0, pessoasNervosas40 = 0, pessoasCalmas18 = 0;
		
		boolean tentouBurlar;
				
		System.out.println("Insira os dados de acordo com suas características\n");
		
		while(qtd < 5) 
		{
			
			System.out.print("Quantos anos você tem? ");
			idade = scanner.nextInt();
			System.out.print("Qual seu sexo? ");
			sexo = scanner.nextInt();
			System.out.print("Qual sua personalidade? ");
			personalidade = scanner.nextInt();
			
			tentouBurlar = (personalidade > 3 || personalidade < 0) || (sexo > 3 || sexo < 0) || (idade > 120 || idade < 0);
			
			if(tentouBurlar == true) 
			{
				System.out.println("\nVocê inseriu dados inválidos, este perfil não será contabilizado.\n");
				continue;
			}
			
			if(personalidade == 1) 
			{
				pessoasCalmas++;
				
				if(sexo == 3) 
				{
					outrosCalmos++;
				}
				if(idade < 18) 
				{
					pessoasCalmas18++;
				}
				
			}
			else if(personalidade == 2) 
			{
				if(sexo == 1) 
				{
					mulheresNervosas++;
				}
				if(idade > 40) 
				{
					pessoasNervosas40++;
				}
				
			}
			else if(personalidade == 3 && sexo == 2)
			{
				homensAgressivos++;
			}
			
			System.out.println();
			qtd++;
		}
		
		System.out.printf("Com os dados de %d perfis, obtivemos os seguintes dados:\n\tPessoas calmas: %d\n\t"
				+ "Outros calmos: %d\n\tPessoas calmas com menos de 18 anos: %d\n\tMulheres nervosas: %d\n\t"
				+ "Pessoas nervosas com mais de 40 anos: %d\n\tHomens agressivos: %d", qtd, pessoasCalmas,
				outrosCalmos, pessoasCalmas18, mulheresNervosas, pessoasNervosas40, homensAgressivos);
		
		scanner.close();
	}
}
