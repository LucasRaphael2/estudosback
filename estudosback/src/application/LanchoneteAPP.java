package application;

/*public class LanchoneteAPP {

	public static void main(String[] args) {

		
		        Scanner in = new Scanner(System.in);
		        double totalPedidoTradicionais = 0;

		        Sanduiche sanduiche = new Sanduiche("X-Salada",5.00,"Bauru",7.00);
		        Passaporte passaporte = new Passaporte("Passaporte de queijo coalho", 6.00);
		        Batata batata = new Batata("Batata pequena", 5.00);

		        System.out.println("Bem-vindo à Lanchonete!");
		        int escolha;

		        do {
		            System.out.println("\nMENU:");
		            System.out.println("1 - Sanduíches");
		            System.out.println("2 - Passaportes");
		            System.out.println("3 - Batatas");
		            System.out.println("0 - Finalizar pedido");
		            System.out.print("Escolha uma opção: ");
		            escolha = in.nextInt();

		            switch (escolha) {
		                case 1:
		                    totalPedidoTradicionais += fazerPedido(sanduiche, in);
		                    break;
		                case 2:
		                    totalPedidoTradicionais += fazerPedido(passaporte, in);
		                    break;
		                case 3:
		                    totalPedidoTradicionais += fazerPedido(batata, in);
		                    break;
		                case 0:
		                    System.out.println("Pedido finalizado. Total a pagar: R$" + totalPedidoTradicionais);
		                    break;
		                default:
		                    System.out.println("Opção inválida.");
		            }
		        } while (escolha != 0);

		        in.close();
		    }

		    public static double fazerPedido(ItemLanchonete item, Scanner in) {
		        System.out.println("Quantidade desejada:");
		        int quantidade = in.nextInt();

		        double totalItem = item.calcularValorTotal(quantidade);
		        System.out.println("Pedido: " + item.getName() + " - " + quantidade + " unidades - Total: R$" + totalItem);
		        
		        return totalItem;
		    }

}*/
/*public class LanchoneteAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPedido = 0;

        Map<String, Double> itens = new HashMap<>();
        itens.put("X-Salada", 5.00);
        itens.put("Passaporte de queijo coalho", 6.00);
        itens.put("Batata pequena", 5.00);
        // Adicione mais itens aqui

        System.out.println("Bem-vindo à Lanchonete!");

        int escolha;
        do {
            System.out.println("\nMENU:");
            int opcao = 1;
            for (String item : itens.keySet()) {
                System.out.println(opcao + " - " + item + " R$ " + itens.get(item));
                opcao++;
            }
            System.out.println("0 - Finalizar pedido");
            System.out.print("Escolha uma opção: ");
            escolha = in.nextInt();

            if (escolha >= 1 && escolha <= itens.size()) {
                String nomeItem = (String) itens.keySet().toArray()[escolha - 1];
                totalPedido += fazerPedido(nomeItem, itens.get(nomeItem), in);
            } else if (escolha != 0) {
                System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        System.out.println("Pedido finalizado. Total a pagar: R$" + totalPedido);

        in.close();
    }

    public static double fazerPedido(String nomeItem, double preco, Scanner in) {
        System.out.println("Quantidade desejada:");
        int quantidade = in.nextInt();

        double totalItem = preco * quantidade;
        System.out.println("Pedido: " + nomeItem + " - " + quantidade + " unidades - Total: R$" + totalItem);

        return totalItem;
    }
}*/
import java.util.Scanner;

import estudosCoffee.Batata;
import estudosCoffee.Passaporte;
import estudosCoffee.Sanduiche;



/*public class LanchoneteAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPedido = 0;

        Categoria sanduiches = new Categoria("Sanduíches");
        sanduiches.adicionarItens(new ItemLanchonete("X-Salada", 5.00));
        sanduiches.adicionarItens(new ItemLanchonete("Bauru", 7.00));
        // Adicione mais sanduíches aqui

        Categoria passaportes = new Categoria("Passaportes");
        passaportes.adicionarItens(new ItemLanchonete("Passaporte de queijo coalho", 6.00));
        passaportes.adicionarItens(new ItemLanchonete("Passaporte de misto", 7.00));
        // Adicione mais passaportes aqui

        Categoria batatas = new Categoria("Batatas");
        batatas.adicionarItens(new ItemLanchonete("Batata pequena", 5.00));
        batatas.adicionarItens(new ItemLanchonete("Batata média", 7.00));
        // Adicione mais batatas aqui

        System.out.println("Bem-vindo à Lanchonete!");

        int escolha;
        do {
            System.out.println("\nMENU:");
            int opcao = 1;
            for (Categoria categoria : categoria) {
                System.out.println(categoria.getName() + ":");
                for (ItemLanchonete item : categoria.getItens()) {
                    System.out.println(opcao + " - " + item.getName() + " R$ " + item.getPrice());
                    opcao++;
                }
            }
            System.out.println("0 - Finalizar pedido");
            System.out.print("Escolha uma opção: ");
            escolha = in.nextInt();

            if (escolha >= 1 && escolha <= totalItens(categoria)) {
                ItemLanchonete itemEscolhido = (ItemLanchonete) itens.toArray()[escolha - 1];
                totalPedido += fazerPedido(itemEscolhido, in);
            } else if (escolha != 0) {
                System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        System.out.println("Pedido finalizado. Total a pagar: R$" + totalPedido);

        in.close();
    }

    public static double fazerPedido(ItemLanchonete item, Scanner in) {
        System.out.println("Quantidade desejada:");
        int quantidade = in.nextInt();

        double totalItem = item.calcularValorTotal(quantidade);
        System.out.println("Pedido: " + item.getName() + " - " + quantidade + " unidades - Total: R$" + totalItem);

        return totalItem;
    }
}*/



/*public class LanchoneteAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPedido = 0;

        Sanduiche sanduiches = new Sanduiche();
        Passaporte passaportes = new Passaporte();
        Batata batatas = new Batata();
        
        // Adicione mais sanduíches aqui
        Categoria sanduiches = new Categoria("Sanduíches");
        sanduiches.adicionarItens(new ItemLanchonete("X-Salada", 5.00));
        sanduiches.adicionarItens(new ItemLanchonete("Bauru", 7.00));
        sanduiches.adicionarItens(new ItemLanchonete("Minuano", 8.50));
        sanduiches.adicionarItens(new ItemLanchonete("X-Bacon", 10.50));
        sanduiches.adicionarItens(new ItemLanchonete("X-Calabresa", 12.00));
        sanduiches.adicionarItens(new ItemLanchonete("Minuano", 8.50));

        // Adicione mais passaportes aqui
        Categoria passaportes = new Categoria("Passaportes");
        passaportes.adicionarItens(new ItemLanchonete("Passaporte de queijo coalho", 6.00));
        passaportes.adicionarItens(new ItemLanchonete("Passaporte de misto", 7.00));

        // Adicione mais batatas aqui
        Categoria batatas = new Categoria("Batatas");
        batatas.adicionarItens(new ItemLanchonete("Batata pequena", 5.00));
        batatas.adicionarItens(new ItemLanchonete("Batata média", 7.00));

        
        
        
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(sanduiches);
        categorias.add(passaportes);
        categorias.add(batatas);

        System.out.println("Bem-vindo à Lanchonete!");

        int escolha;
        do {
            System.out.println("\nMENU:");
            int opcao = 1;
            for (Categoria categoria : categorias) {
                System.out.println(categoria.getName() + ":");
                for (ItemLanchonete item : categoria.getItens()) {
                    System.out.println(opcao + " - " + item.getName() + " R$ " + item.getPrice());
                    opcao++;
                }
            }
            System.out.println("0 - Finalizar pedido");
            System.out.print("Escolha uma opção: ");
            escolha = in.nextInt();

            if (escolha >= 1 && escolha <= totalItens(categorias)) {
                ItemLanchonete itemEscolhido = getItemEscolhido(categorias, escolha);
                totalPedido += fazerPedido(itemEscolhido, in);
            } else if (escolha != 0) {
                System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        System.out.println("Pedido finalizado. Total a pagar: R$" + totalPedido);

        in.close();
    }

    public static int totalItens(List<Categoria> categorias) {
        int total = 0;
        for (Categoria categoria : categorias) {
            total += categoria.getItens().size();
        }
        return total;
    }

    public static ItemLanchonete getItemEscolhido(List<Categoria> categorias, int escolha) {
        int count = 0;
        for (Categoria categoria : categorias) {
            for (ItemLanchonete item : categoria.getItens()) {
                count++;
                if (count == escolha) {
                    return item;
                }
            }
        }
        return null;
    }

    public static double fazerPedido(ItemLanchonete item, Scanner in) {
        System.out.println("Quantidade desejada:");
        int quantidade = in.nextInt();

        double totalItem = item.calcularValorTotal(quantidade);
        System.out.println("Pedido: " + item.getName() + " - " + quantidade + " unidades - Total: R$" + totalItem);

        return totalItem;
    }
}*/






public class LanchoneteAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPedido = 0;

        Sanduiche sanduiches = new Sanduiche();
        Passaporte passaportes = new Passaporte();
        Batata batatas = new Batata();

        System.out.println("Bem-vindo à Lanchonete!");

        int escolha;
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Sanduíches");
            System.out.println("2 - Passaportes");
            System.out.println("3 - Batatas");
            System.out.println("0 - Finalizar pedido");
            System.out.printf("%nEscolha uma opção: ");
            escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    totalPedido += sanduiches.fazerPedido(in);
                    break;
                case 2:
                    totalPedido += passaportes.fazerPedido(in);
                    break;
                case 3:
                    totalPedido += batatas.fazerPedido(in);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (escolha != 0);

        System.out.printf("%nPedido finalizado. Total a pagar: R$" + totalPedido);

        in.close();
    }
}


