package estudosCoffee;

/*public class Sanduiche extends ItemLanchonete {
	
	public Sanduiche(String name, double price) {
		super(name, price);
	}
}*/

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche {
    private String nome;
    private List<ItemLanchonete> itens;

    public Sanduiche() {
        nome = "Sanduíches";
        itens = new ArrayList<>();
        adicionarItem("X-Salada", 5.00);
        adicionarItem("Bauru", 7.00);
        // Adicione mais itens de sanduíches aqui
    }

    public void adicionarItem(String nome, double preco) {
        itens.add(new ItemLanchonete(nome, preco));
    }

    public double fazerPedido(Scanner in) {
        double totalPedido = 0;
        int escolha;

        do {
            System.out.println("\n" + nome + ":");
            int opcao = 1;
            for (ItemLanchonete item : itens) {
                System.out.println(opcao + " - " + item.getName() + " R$ " + item.getPrice());
                opcao++;
            }
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = in.nextInt();

            if (escolha >= 1 && escolha <= itens.size()) {
                ItemLanchonete itemEscolhido = itens.get(escolha - 1);
                totalPedido += itemEscolhido.calcularValorTotal(1);
                System.out.println("Pedido: " + itemEscolhido.getName() + " - 1 unidade - Total: R$" + itemEscolhido.getPrice());
            } else if (escolha != 0) {
                System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        return totalPedido;
    }
}*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche {
    private String name;
    private List<ItemLanchonete> itens;

    public Sanduiche() {
        name = "Sanduíches";
        itens = new ArrayList<>();
        adicionarItem("X-Salada", 5.00);
        adicionarItem("Bauru", 7.00);
        adicionarItem("Minuano", 8.50);
        adicionarItem("X-Bacon", 10.50);
        adicionarItem("X-Calabresa", 12.00);
        adicionarItem("X-Tudo", 17.00);
        // Adicione mais itens de sanduíches aqui
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
                opcao++;
            }
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
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



