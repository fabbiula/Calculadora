package DivulgaTudo;
import java.util.Scanner;
	public class appDivulgaTudo {
		public static void main(String[] args) {
			try (Scanner entrada = new Scanner(System.in)) {
				int escSwitch;
				Calculadora cotacao = new Calculadora();
				Cadastro visualiza = new Cadastro(null, null, null, null, null);
				
				do {				
				System.out.println("");
				System.out.println("==========[AGÊNCIA DIVULGA TUDO]==========");
				System.out.println("");
				System.out.println("==> O que deseja fazer?");
				System.out.println("[1] Cadastrar Anúncio");
				System.out.println("[2] Visualizar Anúncios Cadastrados");				
				System.out.println("[3] Cotação de Visualizações");
				System.out.println("[4] Relatório por Cliente");
				System.out.println("[5] Relatório por Intervalo de Tempo");
				System.out.println("[0] Sair");
				System.out.print("===> ");
					escSwitch = entrada.nextInt();
					switch (escSwitch) {
						case 1:
							visualiza.CadastrarAnuncio();
							break;
						case 2:
							visualiza.ListarCadastrados();
							break;
						case 3:
							cotacao.Calcula();					
							break;
						case 4:
							visualiza.PesquisarCliente();
							break;
						case 5:
							visualiza.PesquisarData();
							break;
						case 0:
							System.out.println("");
							System.out.println("A Agência Divulga Tudo agradece, tenha um Ótimo dia.");
							break;
						default:
							System.out.println("");
							System.out.println("DIGITE UMA OPÇÃO VÁLIDA, TENTE NOVAMENTE!");
							break;
					}
				
				
				
				} while (escSwitch != 0);

			}
		}


	}
