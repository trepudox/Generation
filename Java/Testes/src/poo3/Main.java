package poo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String [] args)
	
	{	int op;
		try (Scanner ler = new Scanner(System.in)) {
			ArrayList<String> estoque = new ArrayList();
			
			
			
			do {
				System.out.println("\n           Digite uma opção: "           );
				System.out.println("----------------------------------------");
				System.out.println("(1)Deseja adicionar produtos ao estoque\n(2)Deseja remover\n(3)Atualizar\n(4)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
				System.out.println("----------------------------------------");
				op = ler.nextInt();
			
				

				switch(op)
					{
						case 1:
							ler.nextLine();
							System.out.print("Digite o produto para adicionar ao estoque:");
							String produto = ler.nextLine();
							estoque.add(produto);
							break;
				
						case 2:
							ler.nextLine();
							System.out.println("Digite o produto para remover do estoque:");
							String produtor = ler.nextLine();
							if(estoque.contains(produtor))
							{
							estoque.remove(produtor);
							}
							else
							{
								System.out.println("Produto não existe");
							}
							break;
							
						case 3:
							ler.nextLine();
							System.out.println("Digite o produto que quer atualizar: ");
							String verifica = ler.nextLine();
							System.out.println("Digite o nome do produto que entrará no lugar de "+verifica+":");
							String novo = ler.nextLine();
							
							if(estoque.contains(verifica))
							{
								estoque.remove(verifica);
								estoque.add(novo);
							}
							else
							{
								System.out.println("Produto não existe!!!");
							}
							System.out.println(estoque);
							break;
				
						case 4:
							
							System.out.println(" Os produtos  do estoque:");
							System.out.println(estoque);
							break;
							
						default:
							System.out.println("Finalizou o programa!!!");
					
						}
			
			}while(op !=0);
		}

	}

}
