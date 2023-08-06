package estudosCoffee;

import java.util.Scanner;

public class LanchesTradicionais {

	
	public void Tradicionais() {
		Scanner in = new Scanner(System.in);
		
		double sanduiches = 0;
		double passaportes = 0;
		double batatas = 0;
		
		double totalTradicionais = 0;
		
		System.out.printf("LANCHES TRADICIONAIS: %n%n");
		
		System.out.printf("SANDUICHES:%n%n1 - X-Salada R$ 5.00%n2 - Bauru R$ 7.00%n3 - Minuano R$ 8.50%n4 - X-Bacon R$ 10.50%n5 - X-Calabresa R$ 12.00%n6 - X-Tudo R$ 17.00%n%n");

		System.out.printf("PASSAPORTES/HOT DOGS:%n%n1 - Passaporte de queijo coalho R$ 6.00%n2 - Passaporte de misto R$ 7.00%n3 - Passaporte de frango R$ 8.50%n4 - Passaporte de carne R$ 9.00%n5 - Passaporte de coração R$ 10.00%n6 - Passaporte de camarão R$ 12.00%n%n");
		System.out.printf("BATATAS:%n%n1 - Batata pequena R$ 5.00%n2 - Batata média R$ 7.00%n3 - Batata grande R$ 10.00%n4 - Batata pequena com bacon 7.50%n5 - Batata média com bacon R$ 9.50%n6 - Batata granda com bacon R$ 12.50%n%n");
		
		int valor = 0;
		System.out.printf("Por onde deseja começar seu lanche:%n 1 - Sanduiches, 2 - Passaportes ou 3 - Batatas: ");
		
		switch (valor){
		case 1:
				System.out.printf("SANDUICHES:%n%n1 - X-Salada R$ 5.00%n2 - Bauru R$ 7.00%n3 - Minuano R$ 8.50%n4 - X-Bacon R$ 10.50%n5 - X-Calabresa R$ 12.00%n6 - X-Tudo R$ 17.00%n%n");
				System.out.println("Escolha sua opção: ");
				sanduiches = in.nextDouble();
				if(sanduiches == 1) {
					totalTradicionais += 5.00;
				}else if(sanduiches == 2) {
					totalTradicionais += 7.00;
				}else if(sanduiches == 3) {
					totalTradicionais += 8.50;
				}else if(sanduiches == 4) {
					totalTradicionais += 10.50;
				}else if(sanduiches == 5) {
					totalTradicionais += 12.00;
				}else if(sanduiches == 6){
					totalTradicionais += 17.00;
				}else {
					
				}
				break;
		case 2:
			System.out.printf("PASSAPORTES/HOT DOGS:%n%n1 - Passaporte de queijo coalho R$ 6.00%n2 - Passaporte de misto R$ 7.00%n3 - Passaporte de frango R$ 8.50%n4 - Passaporte de carne R$ 9.00%n5 - Passaporte de coração R$ 10.00%n6 - Passaporte de camarão R$ 17.00%n%n");
			passaportes = in.nextDouble();
			if(passaportes == 1) {
				totalTradicionais += 6.00;
			}else if(passaportes == 2) {
				totalTradicionais += 7.00;
			}else if(passaportes == 3) {
				totalTradicionais += 8.50;
			}else if(passaportes == 4) {
				totalTradicionais += 9.00;
			}else if(passaportes == 5) {
				totalTradicionais += 10.00;
			}else if(passaportes == 6){
				totalTradicionais += 17.00;
			}else {
				
			}
			
			break;
			
		case 3:
			System.out.printf("BATATAS:%n%n1 - Batata pequena R$ 5.00%n2 - Batata média R$ 7.00%n3 - Batata grande R$ 10.00%n4 - Batata pequena com bacon 7.50%n5 - Batata média com bacon R$ 9.50%n6 - Batata granda com bacon R$ 12.50%n%n");
			batatas = in.nextDouble();
			if(batatas == 1) {
				totalTradicionais += 5.00;
			}else if(batatas == 2) {
				totalTradicionais += 7.00;
			}else if(batatas == 3) {
				totalTradicionais += 10.00;
			}else if(batatas == 4) {
				totalTradicionais += 7.50;
			}else if(batatas == 5) {
				totalTradicionais += 9.50;
			}else if(batatas == 6){
				totalTradicionais += 12.50;
			}else {
				
			}
			
			break;
		}
		in.close();
	
	}
	
	
	
}
