package emporioVinoECo;

import java.io.IOException;
import java.util.Scanner;

import emporioVinoECo.controller.EmporioVinoECoController;
import emporioVinoECo.model.Acessorio;
import emporioVinoECo.model.Cerveja;
import emporioVinoECo.model.Vinho;



public class Menu {

	public static void main(String[] args) {
		
		EmporioVinoECoController emporioController = new EmporioVinoECoController();		
		
		Scanner scan = new Scanner(System.in);
		
		int categoria = 1, id = 0;
		String paisOrigem, dataValidade, descricao, nome, tipoUva, classificacao, tipoRolha, fermentacao, tipo;
		float preco;
		int estoque, anoSafra, volumeLitros;
		
		int opcao;
		
		while(true) {
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("                 EmporioVinoECo                ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("           1 - Cadastrar Produto               ");
			System.out.println("           2 - Listar todos Produtos           ");
			System.out.println("           3 - Buscar produto por ID           ");
			System.out.println("           4 - Atualizar Produto"               );
			System.out.println("           5 - Exluir Produto                  ");
			System.out.println("           6 - Sair                            ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("Entre com a opção desejada:                    ");
			System.out.println("                                               ");
			
			opcao = scan.nextInt();
			
			//agradecimento ao finalizar o programa
			if(opcao == 6) {
				System.out.println("Emporio VinoECo - Viva bons momentos!");
				sobre();
				scan.close();
				//.exit(0) o programa terá uma finalização bem sucedida
				System.exit(0);			
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Cadastrar Produto");
				System.out.println("Digite a categoria: 1 - VINHO | 2 - CERVEJA | 3 - ACESSÓRIOS ");	
				
				do {			
					while(!scan.hasNextInt()) {				
					System.out.println("Por favor digite um número válido para categoria: ");
					scan.next();
					}
				
				categoria = scan.nextInt();
				scan.nextLine();
				
				if(categoria < 1 || categoria > 3) {
					System.out.println("Categoria inválida. Digite 1 para Vinho, 2 para Cerveja ou 3 para Acessorio");
				}
				
				}while(categoria < 1 || categoria > 3);
				
				System.out.println("Digite o país de Origem: ");
				paisOrigem = scan.nextLine();
			
				
				System.out.println("Digite a data de validade: ");
				dataValidade = scan.nextLine();				
				
				System.out.println("Descrição do Produto: ");
				descricao = scan.nextLine();						
				
				System.out.println("Digite o Preço:");
				while(!scan.hasNextFloat()) {
					System.out.println("Por favor digite um valor númerico para o preço: ");
					scan.next();
				}
				preco = scan.nextFloat();
				scan.nextLine();
							
				if(categoria == 1) {
								
				System.out.println("Digite o nome da Vinicola: ");
				nome = scan.nextLine();	
					
				
				System.out.println("Digite o Tipo da Uva: ");
				tipoUva = scan.nextLine();
				
				System.out.println("Digite a classificação do Vinho: ");
				classificacao = scan.nextLine();
				
				System.out.println("Vinho Tipo: ");
				tipo = scan.nextLine();
				
				System.out.println("Digite o ano Safra: ");
				while (!scan.hasNextInt()) {
					System.out.println("Por favor, digite um número válido para o ano da Safra: ");
					scan.next();
				}
				anoSafra = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Digite o tipo da Rolha: ");
				tipoRolha = scan.nextLine();
				
				emporioController.cadastrarProduto(new Vinho(emporioController.gerarId(),categoria, paisOrigem, dataValidade, descricao, preco, nome, tipoUva, classificacao, tipo, anoSafra, tipoRolha));
				
				}
				else if(categoria == 2) {
								
					System.out.println("Digite a marca da Cerveja: ");
					nome = scan.nextLine();
					
				
					
					System.out.println("Digite o Volume em ml / l): ");
					while(!scan.hasNextInt()) {
						System.out.println("Por favor digite um valor númerico para o volume (ml ou litro: ");
						scan.next();
					}
					volumeLitros = scan.nextInt();	
					scan.nextLine();	
							
					System.out.println("Tipo da Fermentação: ");
					fermentacao = scan.nextLine();					
										
					emporioController.cadastrarProduto(new Cerveja(emporioController.gerarId(),categoria, paisOrigem, dataValidade, descricao, preco, nome, volumeLitros, fermentacao));
					
				}else {					
					System.out.println("Digite o tipo de material do Acessório: ");
					nome = scan.nextLine();
					
					emporioController.cadastrarProduto(new Acessorio(emporioController.gerarId(),categoria, paisOrigem, dataValidade, descricao, preco, nome));
				}
				
				keyPress();
				break;
				
			case 2: 
				System.out.println("\n Listar todos os Produtos");
				emporioController.listarProdutos();
				
				keyPress();
				break;
				
			case 3:
				System.out.println("\n Buscar produto por ID");
				
				System.out.println("Digite o id do produto: ");
				id = scan.nextInt();
				
				emporioController.procurarProduto(id);
				
				keyPress();				
				break;
				
			case 4: 
				
				System.out.println("\n Atualizar Produto");
				System.out.println("Digite o id do produto: ");
				id = scan.nextInt();
				
				var buscaProduto = emporioController.buscarNaCollection(id);
				
				if(buscaProduto != null) {
					
					categoria = buscaProduto.getCategoria();					
																	
						System.out.println("Digite o país de Origem: ");
						paisOrigem = scan.nextLine();
						scan.nextLine();					
						
						System.out.println("Digite a data de validade: ");
						dataValidade = scan.nextLine();	
					
						
						System.out.println("Descrição do Produto: ");
						descricao = scan.nextLine();						
						
						System.out.println("Digite o Preço:");
						while(!scan.hasNextFloat()) {
							System.out.println("Por favor digite um valor númerico para o preço: ");
							scan.next();
						}
						preco = scan.nextFloat();
						scan.nextLine();						
						
						switch(categoria) {
											
							case 1 -> {
						
						System.out.println("Digite o nome da Vinicola: ");
						nome = scan.nextLine();
						scan.nextLine();
											
						System.out.println("Digite o Tipo da Uva: ");
						tipoUva = scan.nextLine();
						
						System.out.println("Digite a classificação do Vinho: ");
						classificacao = scan.nextLine();
						
						System.out.println("Vinho Tipo: ");
						tipo = scan.nextLine();
						
						System.out.println("Digite o ano Safra: ");
						while(!scan.hasNextInt()) {
							System.out.println("Por favor digite um valor númerico para o preço: ");
							scan.next();
						}
						anoSafra = scan.nextInt();
						scan.nextLine();
						
						System.out.println("Digite o tipo da Rolha: ");
						tipoRolha = scan.nextLine();
						
						emporioController.atualizarProdutos(new Vinho(id,categoria, paisOrigem, dataValidade, descricao, preco, nome, tipoUva, classificacao, tipo, anoSafra, tipoRolha));
						}	
							case 2 -> {					
										
							System.out.println("Digite a marca da Cerveja: ");
							nome = scan.nextLine();
													
							System.out.println("Digite o Volume em ml / l: ");
							while(!scan.hasNextInt()) {
								System.out.println("Por favor digite um valor númerico para o volume: ");
								scan.next();
							}
							volumeLitros = scan.nextInt();								
									
							System.out.println("Tipo da Fermentação: ");
							fermentacao = scan.nextLine();							
												
							emporioController.atualizarProdutos(new Cerveja(id,categoria, paisOrigem, dataValidade, descricao, preco, nome, volumeLitros, fermentacao));
						}
							case 3 -> {				
											
							System.out.println("Digite o tipo de material do Acessório: ");
							nome = scan.nextLine();
							
							
							emporioController.atualizarProdutos(new Acessorio(id,categoria, paisOrigem, dataValidade, descricao, preco, nome));
						}
							
							default ->
							System.out.println("Id do produto inválido");
					}
				} else {
							System.out.println("Produto não foi encontrado!");
						}
				
				keyPress();						
				break;
				
			case 5:			
				
				System.out.println("\n Excluir Produto");
				System.out.println("Digite o id do Produto: ");
				id = scan.nextInt();
				
				emporioController.excluir(id);
				
				keyPress();
				break;
				
			case 6:
				
				keyPress();
				System.out.println("\n Sair");
				
				break;
				
			default:
				System.out.println("\nOpção Inválida");
				keyPress();
				break;
				
			}
			
			
		}
	}
	public static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("Projeto Desenvolvido por: dev{a} Alexania Toma");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("***********************************************");
	
	}
	
	public static void keyPress() {
		try {
		
			System.out.println("Pressione Enter para Continuar...");
			System.in.read();
			
		}catch(IOException e ) {
		System.out.println("Você pressionou uma tecla diferente de enter!");
		}	
	
	}
	
}

