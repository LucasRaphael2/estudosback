package estudosCoffee;

import java.util.Scanner;

public class LanchesTradicionais extends Object {

	
	public void Tradicionais() {
		Scanner in = new Scanner(System.in);
		
		
		int primeiraEscolha = 0;
		
		SanduichesTrad sanduiches = new SanduichesTrad();
		PassaportesTrad hotdog = new PassaportesTrad();
		BatatasTrad batata = new BatatasTrad();
		Lanchonete lanches = new Lanchonete();
		
		System.out.printf("LANCHES TRADICIONAIS: %n%n");
		
		System.out.printf("SANDUICHES:%n%n1 - X-Salada R$ 5.00%n2 - Bauru R$ 7.00%n3 - Minuano R$ 8.50%n4 - X-Bacon R$ 10.50%n5 - X-Calabresa R$ 12.00%n6 - X-Tudo R$ 17.00%n%n");

		System.out.printf("PASSAPORTES/HOT DOGS:%n%n1 - Passaporte de queijo coalho R$ 6.00%n2 - Passaporte de misto R$ 7.00%n3 - Passaporte de frango R$ 8.50%n4 - Passaporte de carne R$ 9.00%n5 - Passaporte de coração R$ 10.00%n6 - Passaporte de camarão R$ 12.00%n%n");
		
		System.out.printf("BATATAS:%n%n1 - Batata pequena R$ 5.00%n2 - Batata média R$ 7.00%n3 - Batata grande R$ 10.00%n4 - Batata pequena com bacon 7.50%n5 - Batata média com bacon R$ 9.50%n6 - Batata granda com bacon R$ 12.50%n%n");
		
		System.out.println("Se decidir não escolher nenhum  item apresentado no cardápio escolhido digite 0 para seguirmos o atendimento");
		
		System.out.printf("Por onde deseja começar seu lanche:%n 1 - Sanduiches, 2 - Passaportes ou 3 - Batatas: %n");
		primeiraEscolha = in.nextInt();
		switch (primeiraEscolha){
		case 1:
			
			sanduiches.sanduiches();
			
			break;
		case 2:
			
			hotdog.passaportes();
			
			break;
		case 3:
			
			batata.batatas();
			
			break;
		
		case 0:
			
			lanches.lanches();
			
			break;
		
		}
		
		
		in.close();
	
	}
	
	
	
}
