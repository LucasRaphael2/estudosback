package estudosCoffee;

/*public class ItemLanchonete {

	
		
		public String name;
		public double price;
		
		public ItemLanchonete(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		public double getPrice() {
			return price;
		}
		
		public double calcularValorTotal(int quantity) {
			return price * quantity;
		}

		public void incrementarQuantidade() {
			return quantity;
			
		}
	}*/

public class ItemLanchonete {
    private String name;
    private double price;
    private int quantity;

    public ItemLanchonete(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void incrementarQuantidade() {
    	quantity++;
    }

    public int getQuantity() {
    	
    	return quantity;
    }
    
    public double calcularTotal() {
        return price * quantity;
    }

}






	
	

