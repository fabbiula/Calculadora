package DivulgaTudo;
import java.util.Scanner;
	public class Calculadora implements Controlador {
			Scanner entrada = new Scanner(System.in);
		    private int visOriginal = 30;
		    private int visuCompart = 40;
		    private int geraCompart;
		    private int clique;
		    private int visuTot;
		    private String escolha;
			  private float invest = 0.0f;
		    private int resCompart;
		    private int resultadoFinal;
		    private int geraClique;


		    public void Calcula(){
		    	do {
		    	System.out.println("");
				System.out.println("========[ CALCULADORA DE VISUALIZAÇÕES ]======");
				System.out.println("");
				System.out.print("Digite o valor a ser investido: ");
					this.setInvest(entrada.nextFloat());
					
				if (this.getInvest() % 1 == 0) {
						this.setVisuTot((int)(this.getInvest() * this.getVisOriginal()));
										
					if (this.getVisuTot() <= 100) {
						this.setGeraClique(this.getVisuTot() / 8);
						this.setGeraCompart(0);
		            	this.setResCompart(0);
		            	this.setResultadoFinal((this.getVisuTot() + this.getResCompart()));
					} else if (this.getVisuTot() > 100) {
						this.setClique(8);
						this.setGeraClique((this.getVisuTot() / getClique()));
					}
		        	if (this.getGeraClique() < 20) {
		        		this.setGeraCompart(0);
		        		this.setResCompart(0);
		        	} else if (this.getGeraClique() > 20) {
		        		this.setGeraCompart((this.getGeraClique() / 6));
		        		this.setResCompart((this.getGeraCompart() * this.getVisuCompart()));
		        		this.setResultadoFinal((this.getVisuTot() + this.getResCompart()));
		        	}
		        		MostraCalc();
		        		System.out.println("");
		        		System.out.println("Se deseja realizar uma nova cotação?");
		        		System.out.println("Se deseja sair, digite [N] ou [n]");
		        		System.out.print("==> ");
						this.setEscolha(entrada.next());
				} else {
						System.out.println("Valor digitado não é multiplo de R$1,00, TENTE NOVAMENTE!!!");
				}
		    	} while (this.getEscolha().equalsIgnoreCase("S") || this.getEscolha().equalsIgnoreCase("s"));
		    }
		    
		    public void MostraCalc(){
		        System.out.println("");
		        System.out.println("Valor investido: " + this.getInvest());
				System.out.println("Visualizaões por valor investido: "  + this.getVisuTot());
				System.out.println("Quantidade de cliques: "  + this.getGeraClique());
		        System.out.println("Compartilhamento nas redes sociais: "  + this.getGeraCompart());
				System.out.println("Visualizações por compartilhamentos nas redes sociais: " + this.getResCompart());
				System.out.println("Visualizações totais aproximadas: " + this.getResultadoFinal());
		        System.out.println("");
		    }

		    public int getVisOriginal() {
		        return visOriginal;
		    }
		    public void setVisOriginal(int visOriginal) {
		        this.visOriginal = visOriginal;
		    }  
		    public int getVisuCompart() {
		        return visuCompart;
		    }
		    public void setVisuCompart(int visuCompart) {
		        this.visuCompart = visuCompart;
		    }
		    public int getGeraCompart() {
		        return geraCompart;
		    }
		    public void setGeraCompart(int geraCompart) {
		        this.geraCompart = geraCompart;
		    }
		    public int getClique() {
		        return clique;
		    }public void setClique(int clique) {
		        this.clique = clique;
		    }
		    public int getVisuTot() {
		        return visuTot;
		    }
		    public void setVisuTot(int visuTot) {
		        this.visuTot = visuTot;
		    }
		    public String getEscolha() {
		        return escolha;
		    }
		    public void setEscolha(String escolha) {
		        this.escolha = escolha;
		    }
		    public float getInvest() {
		        return invest;
		    }
		    public void setInvest(float invest) {
		        this.invest = invest;
		    }
		    public int getResCompart() {
		        return resCompart;
		    }
		    public void setResCompart(int resCompart) {
		        this.resCompart = resCompart;
		    }
		    public int getResultadoFinal() {
		        return resultadoFinal;
		    }
		    public void setResultadoFinal(int resultadoFinal) {
		        this.resultadoFinal = resultadoFinal;
		    }
		    public int getGeraClique() {
				return geraClique;
			}
			public void setGeraClique(int geraClique) {
				this.geraClique = geraClique;
			}				
	}
