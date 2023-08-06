package estudosCoffee;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Olá eu sou max, sejam muito bem-vindos a lanchonete do GORDÃO.%n%n");
		
		System.out.printf(" Aqui está o cardapio para você dar uma olhada%n%n");
		
		System.out.println("-----------------CARDÁPIO-----------------");
		
		System.out.printf("%nBEBIDAS:%n%nNATURAIS:                          LATA:                     LITRO:%n%n1 - Água R$ 2.00               1 - Sprite R$ 4.00          1 - Sprite R$ 5.00%n2 - Suco de Maracujá R$ 3.00   2 - Pepsi R$ 4.00           2 - Coca-Cola R$ 6.00%n3 - Suco de Goiaba R$ 3.00     3 - Guaraná R$ 4.50         3 - Guaraná R$ 5.00%n4 - Suco de Acerola R$ 3.00    4 - Fanta R$ 4.50           4 - Pepsi R$ 4.50%n5 - Suco de Cajá R$ 3.00       5 - Coca-Cola R$ 5.00       5 - Fanta R$ 5.00%n6 - Suco de Graviola R$ 3.00%n7 - Suco de Limão R$ 3.00%n%n");
		
		System.out.printf("LANCHES TRADICIONAIS: %n%n");
		
		System.out.printf("SANDUICHES:%n%n1 - X-Salada R$ 5.00%n2 - Bauru R$ 7.00%n3 - Minuano R$ 8.50%n4 - X-Bacon R$ 10.50%n5 - X-Calabresa R$ 12.00%n6 - X-Tudo R$ 17.00%n%n");
		
		System.out.printf("PASSAPORTES/HOT DOGS:%n%n1 - Passaporte de queijo coalho R$ 6.00%n2 - Passaporte de misto R$ 7.00%n3 - Passaporte de frango R$ 8.50%n4 - Passaporte de carne R$ 9.00%n5 - Passaporte de coração R$ 10.00%n6 - Passaporte de camarão R$ 12.00%n%n");
		
		System.out.printf("BATATAS:%n%n1 - Batata pequena R$ 5.00%n2 - Batata média R$ 7.00%n3 - Batata grande R$ 10.00%n4 - Batata pequena com bacon 7.50%n5 - Batata média com bacon R$ 9.50%n6 - Batata granda com bacon R$ 12.50%n%n");
		
		System.out.printf("LANCHES MONTAVEIS: %n%n");
		
		System.out.printf("PÃES:%n%n1 - Seda R$ 1.50%n2 - Bola R$ 1.50%n3 - Italiano R$ 2.50%n4 - 9 grãos R$ 2.50%n5 - Baguete R$ 3.00%n6 - Brioche R$ 2.50%n%n");
		
		System.out.printf("CARNES:%n%n1 - Carne em tiras%n2 - Frango em tiras%n3 - Carne em cubos%n4 - Frango em cubos%n5 - Hambuguer smash%n6 - Hamburguer artesanal (O blend quem monta é o cliente)%n(OBS: todas as carnes contém 150g, exceto o hamburguer smash%n%n");
		
		System.out.println("");
		
		
		
		System.out.printf("ACOMPANHAMENTOS EXTRAS:%n%n1 - Bacon R$ 2.50%n2 - Cheddar R$ 2.00%n3 - Cream Cheese R$ 2.00%n4 - Catupiry R$ 2.00%n%n");
		in.close();

	}

}