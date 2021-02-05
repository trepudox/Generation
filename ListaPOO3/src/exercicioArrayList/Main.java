package exercicioArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String produto1, produto2;
		int entrada, quantidade, opcao;
		
		try 
		{
			do 
			{
				System.out.print("Lista de comandos:\n\t0 - Sai do programa.\n\t1 - Cria novos produtos (nome do produto e a quantidade desejada)."
						+ "\n\t2 - Atualiza os produtos já existentes (nome do produto que deseja alterar, nome do novo produto e a quantidade desejada)."
						+ "\n\t3 - Exibe algum produto específico e sua quantidade, caso queira listar todos, deixe em branco.\n\t4 - Remove algum produto específico."
						+ "\nEscolha sua opção: ");
				
				entrada = scanner.nextInt();
				System.out.println();
				
				switch(entrada) 
				{
				case 0:
					System.out.println("\nPrograma encerrado.");
					break;
					
				case 1:
					System.out.print("Informe o nome do produto que deseja adicionar: ");
					produto1 = scanner2.nextLine().trim().toLowerCase();
					
					System.out.print("Informe a quantidade que deseja: ");
					quantidade = scanner.nextInt();
				
					estoque.create(produto1, quantidade);
					break;
					
				case 2:
					System.out.print("Digite 1 para alterar um produto por outro ou 2 para alterar apenas a quantidade de um produto existente: "); 
					opcao = scanner.nextInt();
					while(opcao != 1 && opcao != 2) 
					{
						System.out.println("\nPor favor, digite um valor válido.");
						System.out.print("Digite 1 para alterar um produto por outro ou 2 para alterar apenas a quantidade de um produto existente: "); 
						opcao = scanner.nextInt();
					}
					
					if(opcao == 1) 
					{
						System.out.print("Informe o nome do produto que deseja trocar: ");
						produto1 = scanner2.nextLine().trim().toLowerCase();
						
						System.out.print("Agora, o nome do produto que entrará no lugar: ");
						produto2 = scanner2.nextLine().trim().toLowerCase();
						
						System.out.print("Digite a quantidade do produto: ");
						quantidade = scanner.nextInt();
						
						estoque.update(produto1, produto2, quantidade);					
					}
					else 
					{
						System.out.print("Informe o produto: ");
						produto1 = scanner2.nextLine().trim().toLowerCase();
						
						System.out.println("Agora, informe a nova quantidade: ");
						quantidade = scanner.nextInt();
						
						estoque.update(produto1, quantidade);
					}
					break;
					
				case 3:
					System.out.print("Digite o nome do produto que deseja ver (para listar o estoque inteiro não digite nada): ");
					produto1 = scanner2.nextLine().trim().toLowerCase();;
					if(produto1 == "") 
					{
						estoque.read();
					}
					else 
					{
						estoque.read(produto1);
					}
					break;
					
				case 4:
					System.out.println("Digite o nome do produto que deseja remover: ");
					produto1 = scanner2.nextLine().trim().toLowerCase();
					
					estoque.delete(produto1);
					break;
					
				default:
					System.out.println("\nPor favor, digite apenas de 0 a 4.");
					break;
				}
				
			} while(entrada != 0);
			
		} 
		catch(InputMismatchException err1) 
		{
			System.out.println("\nPor favor, digite apenas números inteiros quando for escolher sua opção.\nErro: " + err1);
		}
		catch(Exception err) 
		{
			System.out.println("Erro: " + err);
		}
		
		scanner.close();
		scanner2.close();
	}
}
