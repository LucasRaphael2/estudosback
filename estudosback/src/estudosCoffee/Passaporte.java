package estudosCoffee;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passaporte {
    private String name;
    private List<ItemLanchonete> itens;

    public Passaporte() {
        name = "Passaportes";
        itens = new ArrayList<>();
        adicionarItem("Passaporte de Queijo Coalho", 6.00);
        adicionarItem("Passaporte de Misto", 7.00);
        adicionarItem("Passaporte de Frango", 9.50);
        adicionarItem("Passaporte de carne", 10.00);
        adicionarItem("Passaporte de Coração", 13.00);
        adicionarItem("Passaporte de Camarão", 17.00);
        // Adicione mais itens de passaportes aqui
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

public void gerarCupom() {
    	
    	double porcentagemAtendimento = calcularTotalPedido(itens)*0.10;
    	double totalCategoria = calcularTotalPedido(itens)+porcentagemAtendimento;
        System.out.println(name.toUpperCase());
        for (ItemLanchonete item : itens) {
            if (item.getQuantity() > 0) {
                System.out.println(item.getName() + " \n" + item.getQuantity() + " - unidade(s) \nR$" + item.getPrice() + " cada  \nTotal item: R$" + item.calcularTotal());
                System.out.println("=============================");
            }
        }
        System.out.println("Porcentagem: "+ 0.10*100+"%");
        System.out.println("Total a pagar: R$"+totalCategoria+"\n");
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