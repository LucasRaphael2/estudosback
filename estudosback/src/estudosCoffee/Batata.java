package estudosCoffee;



/*public class Batata extends ItemLanchonete{
	Scanner in = new Scanner(System.in);
	
	public Batata(String name, double price) {

		super(name, price);
		
	}
}*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Batata {
    private String name;
    private List<ItemLanchonete> itens;

    public Batata() {
        name = "Batatas";
        itens = new ArrayList<>();
        adicionarItem("X-Salada", 5.00);
        adicionarItem("Bauru", 7.00);
        // Adicione mais itens de batatas aqui
    }

    public void adicionarItem(String name, double price) {
        itens.add(new ItemLanchonete(name, price));
    }

    public double fazerPedido(Scanner in) {
        double totalPedido = 0;

        System.out.println("\n" + name + ":");
        escolherProdutos(itens, in);
        totalPedido = calcularTotalPedido(itens);

        return totalPedido;
    }

    private void escolherProdutos(List<ItemLanchonete> itens, Scanner in) {
        int escolha;

        do {
            int opcao = 1;
            for (ItemLanchonete item : itens) {
                System.out.println(opcao + " - " + item.getName() + " R$ " + item.getPrice());
                System.out.println("");
                opcao++;
            }
            System.out.println("0 - Voltar");
            System.out.printf("%nEscolha uma opção: ");
            escolha = in.nextInt();

            if (escolha >= 1 && escolha <= itens.size()) {
                ItemLanchonete itemEscolhido = itens.get(escolha - 1);
                itemEscolhido.incrementarQuantidade();
            } else if (escolha != 0) {
                System.out.println("Opção inválida.");
            }
        } while (escolha != 0);
    }

    private double calcularTotalPedido(List<ItemLanchonete> itens) {
        double totalPedido = 0;

        for (ItemLanchonete item : itens) {
            totalPedido += item.calcularTotal();
        }

        return totalPedido;
    }
}

