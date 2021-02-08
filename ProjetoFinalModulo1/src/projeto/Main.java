package projeto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static ArrayList<Veiculos> listaCarros = new ArrayList<Veiculos>();

	static Scanner scanner = new Scanner(System.in);
	static Scanner scanner2 = new Scanner(System.in);
	
	public static void alugar(char caso) 
	{
		System.out.println("Carros disponíveis:");
		
		for(Veiculos v: listaCarros) 
		{
			if(v.getCategoria() == caso && v.isDisponivel()) 
			{
				System.out.print(" " + v.getModelo() + " |");
			}
		}
		
		System.out.print("\n\nEscolha o carro desejado: ");
		String escolhaCarro = scanner2.nextLine();
		
		Veiculos vAux = null;
		
		for(Veiculos v: listaCarros) 
		{
			if(v.getModelo().equalsIgnoreCase(escolhaCarro.trim()) && v.getCategoria() == caso) 
			{
				vAux = v;
			}
		}
		
		int dias, opcaoSeg;
		String localRet, localEnt;
		if(vAux != null) 
		{
			System.out.println("\n" + vAux);	
			System.out.print("\nInforme por quantos dias irá alugar o veículo:  ");
			dias = scanner.nextInt();
			
			System.out.print("\nInforme o local de retirada: ");
			localRet = scanner2.nextLine();
			
			System.out.print("\nAgora, informe o local de entrega: ");
			localEnt = scanner2.nextLine();
			
			System.out.print("\nDeseja adicionar o seguro? 0 para não e 1 para sim. ");
			opcaoSeg = scanner.nextInt();
			
			for(Veiculos v: listaCarros) 
			{
				if(vAux == v) 
				{
					v.setQntd_dias(dias);
					v.setLocal_retirada(localRet);
					v.setLocal_entrega(localEnt);
					if(opcaoSeg == 0) 
					{
						v.setSeguro(false);								
					}
					else 
					{
						v.setSeguro(true);
					}
				}
			}
		}
		else 
		{
			System.out.println("\nEsse carro não existe nessa categoria!");
			return;
		}
	
		System.out.println("\nReserva concluída!");
		for(Veiculos v: listaCarros) 
		{
			if(vAux == v) 
			{
				System.out.println("Você alugou o/a " + v.getFabricante() + " " + v.getModelo() + " por " + v.getQntd_dias()
				+ " dias. A retirada do veículo será em " + v.getLocal_retirada() + " e a devolução em " + v.getLocal_entrega()
				+ ".\nTotal seguro: " + formataMoeda(v.calculaSeguro()) + "\nTotal taxa: " + formataMoeda(v.calculaTaxa())
				+ "\nValor final: " + formataMoeda(v.calculaTotalTotal()));
				v.setDisponivel(false);
			}
		}
		System.out.println("\nObrigado por utilizar nosso sistema! :)");
		return;
	}
	
	public static String formataMoeda(double valor) 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}
	
	public static void bdCarros() 
	{
		
		GrupoA mercedes = new GrupoA("Mercedes Benz", "GEN1A11", "AMG", 2021, 5, true, true, true, false, true);
		GrupoB hilux = new GrupoB("Toyota", "GEN2B22", "Hilux", 2020, 5, false, true, true, false, true);
		GrupoB tiguan = new GrupoB("Volkswagen", "GEN4B44", "Tiguan", 2020, 7, false, true, true, false, true);
		GrupoC onix = new GrupoC("Chevrolet", "GEN3C33", "Onix", 2019, 5, false, true, false, false, false);
		GrupoC uno = new GrupoC("Fiat", "GEN5C55", "Uno", 2020, 5, false, true, false, false, true);
		GrupoD fluence = new GrupoD("Renault", "GEN6D66", "Fluence", 2021, 5, false, true, true, true, true);
		
		listaCarros.add(mercedes);
		listaCarros.add(hilux);
		listaCarros.add(tiguan);
		listaCarros.add(onix);
		listaCarros.add(uno);
		listaCarros.add(fluence);
	} 
	
	public static void main(String[] args) {
		int entrada;
		bdCarros();
				
		System.out.println("*** ALUGUEL CARROS GENERATION ***\n");
		try
		{
			do 
			{
				System.out.println("Menu:\n\t0 - Sair do programa\n\t1 - Exibir categorias de carro\n\t2 - Verificar disponibilidade de carros"
						+ "\n\t3 - Alugar carro\n");
				System.out.print("Escolha sua opção: ");
				entrada = scanner.nextInt();
				
				switch(entrada) 
				{
				case 0:
					System.out.println("\nPrograma finalizado.");
					break;
					
				case 1:
					System.out.println("\nCategoria A - Carros de luxo, carros blindados, com ar-condicionado, câmbio automático e tudo que a mais nova tecnologia pode te trazer."
							+ "\nCategoria B - Carros premium, carros automáticos, com ar-condicionado, com opção de até 7 lugares, proporcionando toda comodidade para o seu passeio."
							+ "\nCategoria C - Carros standard, carros hatch e econômicos, com ar-condicionado e são perfeitos para situações cotidianas."
							+ "\nCategoria D - Carros adaptados para PCD, com ar-condicionado, transmissão automática, extremamente confortáveis e seguros (é preciso ter uma CNH de categoria H).\n");
					break;
					
				case 2:
					char cat = 65;
					for(int i = 0; i < 4; i++) 
					{
						System.out.println("\nCategoria " + cat + ":");
						for(int j = 0; j < listaCarros.size(); j++) 
						{
							if(listaCarros.get(j).getCategoria() == cat && listaCarros.get(j).isDisponivel()) 
							{
								System.out.println("\t" + listaCarros.get(j).getFabricante() + " " + listaCarros.get(j).getModelo() + ", disponível");
							}
						}
						
						for(int k = 0; k < listaCarros.size(); k++) 
						{
							if(listaCarros.get(k).getCategoria() == cat && !listaCarros.get(k).isDisponivel()) 
							{
								System.out.println("\t" + listaCarros.get(k).getFabricante() + " " + listaCarros.get(k).getModelo() + ", indisponível");
							}
						}
	
						cat++;
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("\nCategorias disponíveis: A, B, C, D");
					System.out.print("Escolha a categoria: ");
					char ent3 = scanner.next().toUpperCase().trim().charAt(0);
					System.out.println();
					
					switch(ent3) 
					{
					case 'A':
						alugar('A');
						System.out.println();
						break;	
						
					case 'B':
						alugar('B');
						System.out.println();
						break;
						
					case 'C':
						alugar('C');
						System.out.println();
						break;
						
					case 'D':
						alugar('D');
						System.out.println();
						break;
						
					default:
						System.out.println("Opção inválida.");
						break;
					}
					
					
					System.out.println();
					break;
					
				default:
					System.out.println("Selecione uma opção válida.");
					break;
				
				}
				
			} while(entrada != 0);
			
			scanner.close();
			scanner2.close();
		} 
		catch(InputMismatchException err1) 
		{
			System.out.println("\nDigite apenas opções válidas para o funcionamento correto do programa.");
			System.err.println("Erro: " + err1);
		}
		catch(Exception err2) 
		{
			System.err.println("Erro: " + err2);
		}
	}
}
