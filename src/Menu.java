import java.util.Scanner;
import Produto.Modelo.Produto;

		public class Menu {
			public static void main(String[] args) {

				Scanner leia = new Scanner(System.in);

				int opcao;
			
					
					// Teste da Classe Conta
					Produto c1 = new Produto(1, 140.0, "BarbieGirl", "Barbie Passeio na Praia", 60);
					c1.visualizar();
					c1.retirar(70);
					c1.visualizar();
					c1.adicionar(10);
					c1.visualizar();
					c1.retirar(70);
					c1.visualizar();
					
				while (true) {

					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                  Loja das bonecas                   ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Adicionar Produto                    ");
					System.out.println("            2 - Retirar Produto                      ");
					System.out.println("            3 - Verificar tabela                     ");
					System.out.println("            4 - Verificar estoque	                 ");
					System.out.println("            5 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("			Entre com a opção desejada:              ");
					System.out.println("                                                     ");

					opcao = leia.nextInt();

					if (opcao == 5) {
						System.out.println("\nLoja das bonecas - Obrigada por vir em nosso reino!");
						sobre();
		                 leia.close();
						System.exit(0);
					}

					switch (opcao) {
						case 1:
							System.out.println("Adicionar um Produto");

							break;
						case 2:
							System.out.println("Retirar Produto");

							break;
						case 3:
							System.out.println("Verificar tabela de produtos");

							break;
						case 4:
							System.out.println("Verificar Estoque");

							break;
				
						}

				
				}
			}
		    
			public static void sobre() {
				System.out.println("\n*********************************************************");
				System.out.println("Projeto Desenvolvido por: Wendy Rose ");
				System.out.println("Generation Brasil - generation@generation.org");
				System.out.println("github.com/WendyRose-s2");
				System.out.println("*********************************************************");
			}
		
		
	}
	
