package estudosCoffee;

import java.util.Scanner;

public class PassaportesTrad {
	
	public void passaportes() {
	
	Scanner in = new Scanner(System.in);
	
	double sanduichesTrad = 0;
	double passaportesTrad = 0;
	double batatasTrad = 0;
	
	double valorAtualPedidosTrad = 0;
	double totalPedidoTradicionais;
	
	
	int segundaEscolha = 0;
	int lancheExtra = 0;
	Lanchonete lanches = new Lanchonete();
	
	
	System.out.printf("PASSAPORTES/HOT DOGS:%n%n1 - Passaporte de queijo coalho R$ 6.00%n2 - Passaporte de misto R$ 7.00%n3 - Passaporte de frango R$ 8.50%n4 - Passaporte de carne R$ 9.00%n5 - Passaporte de coração R$ 10.00%n6 - Passaporte de camarão R$ 17.00%n%n");
	passaportesTrad = in.nextDouble();
	if(passaportesTrad == 1) {
		valorAtualPedidosTrad += 6.00;
	}else if(passaportesTrad == 2) {
		valorAtualPedidosTrad += 7.00;
	}else if(passaportesTrad == 3) {
		valorAtualPedidosTrad += 8.50;
	}else if(passaportesTrad == 4) {
		valorAtualPedidosTrad += 9.00;
	}else if(passaportesTrad == 5) {
		valorAtualPedidosTrad += 10.00;
	}else if(passaportesTrad == 6){
		valorAtualPedidosTrad += 17.00;
	}else {
	
	}
		System.out.println("Qual próximo item deseja escolher: 1 - sanduiches ou 2 - batatas, caso queira retornar ao menu principal digite 0");
		segundaEscolha = in.nextInt();
		
		switch(segundaEscolha){
			case 1:
				System.out.printf("SANDUICHES:%n%n1 - X-Salada R$ 5.00%n2 - Bauru R$ 7.00%n3 - Minuano R$ 8.50%n4 - X-Bacon R$ 10.50%n5 - X-Calabresa R$ 12.00%n6 - X-Tudo R$ 17.00%n%n");
				sanduichesTrad = in.nextDouble();
				if(sanduichesTrad == 1) {
					valorAtualPedidosTrad += 5.00;
				}else if(sanduichesTrad == 2) {
					valorAtualPedidosTrad += 7.00;
				}else if(sanduichesTrad == 3) {
					valorAtualPedidosTrad += 8.50;
				}else if(sanduichesTrad == 4) {
					valorAtualPedidosTrad += 10.50;
				}else if(sanduichesTrad == 5) {
					valorAtualPedidosTrad += 12.00;
				}else if(sanduichesTrad == 6){
					valorAtualPedidosTrad += 17.00;
				}else {
				}
					System.out.println("Deseja solicitar batatas? 1 - sim ou 2 - não");
					lancheExtra = in.nextInt();
					if(lancheExtra == 1) {
						System.out.printf("BATATAS:%n%n1 - Batata pequena R$ 5.00%n2 - Batata média R$ 7.00%n3 - Batata grande R$ 10.00%n4 - Batata pequena com bacon 7.50%n5 - Batata média com bacon R$ 9.50%n6 - Batata granda com bacon R$ 12.50%n%n");
						batatasTrad = in.nextDouble();
						if(batatasTrad == 1) {
							valorAtualPedidosTrad += 5.00;
						}else if(batatasTrad == 2) {
							valorAtualPedidosTrad += 7.00;
						}else if(batatasTrad == 3) {
							valorAtualPedidosTrad += 10.00;
						}else if(batatasTrad == 4) {
							valorAtualPedidosTrad += 7.50;
						}else if(batatasTrad == 5) {
							valorAtualPedidosTrad += 9.50;
						}else if(batatasTrad == 6){
							valorAtualPedidosTrad += 12.50;
						}
					}
		
					break;
					
		case 2:
				
			System.out.printf("BATATAS:%n%n1 - Batata pequena R$ 5.00%n2 - Batata média R$ 7.00%n3 - Batata grande R$ 10.00%n4 - Batata pequena com bacon 7.50%n5 - Batata média com bacon R$ 9.50%n6 - Batata granda com bacon R$ 12.50%n%n");
			batatasTrad = in.nextDouble();
			if(batatasTrad == 1) {
				valorAtualPedidosTrad += 5.00;
			}else if(batatasTrad == 2) {
				valorAtualPedidosTrad += 7.00;
			}else if(batatasTrad == 3) {
				valorAtualPedidosTrad += 10.00;
			}else if(batatasTrad == 4) {
				valorAtualPedidosTrad += 7.50;
			}else if(batatasTrad == 5) {
				valorAtualPedidosTrad += 9.50;
			}else if(batatasTrad == 6){
				valorAtualPedidosTrad += 12.50;
			}else {
			}
				System.out.println("Deseja solicitar sanduiches? 1 - sim ou 2 - não");
				lancheExtra = in.nextInt();
				if(lancheExtra == 1) {
					System.out.printf("SANDUICHES:%n%n1 - X-Salada R$ 5.00%n2 - Bauru R$ 7.00%n3 - Minuano R$ 8.50%n4 - X-Bacon R$ 10.50%n5 - X-Calabresa R$ 12.00%n6 - X-Tudo R$ 17.00%n%n");
					sanduichesTrad = in.nextDouble();
					if(sanduichesTrad == 1) {
						valorAtualPedidosTrad += 5.00;
					}else if(sanduichesTrad == 2) {
						valorAtualPedidosTrad += 7.00;
					}else if(sanduichesTrad == 3) {
						valorAtualPedidosTrad += 8.50;
					}else if(sanduichesTrad == 4) {
						valorAtualPedidosTrad += 10.50;
					}else if(sanduichesTrad == 5) {
						valorAtualPedidosTrad += 12.00;
					}else if(sanduichesTrad == 6){
						valorAtualPedidosTrad += 17.00;
					}else {		
					}
				}else {
					
				}
			break;
			
		case 0:
			
			lanches.lanches();
			
			break;
		}
				
				
		totalPedidoTradicionais = valorAtualPedidosTrad;

	System.out.println(totalPedidoTradicionais);
	
	in.close();
	
	}

}
