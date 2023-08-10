package categories;

import java.util.ArrayList;
import java.util.List;

import estudosCoffee.ItemLanchonete;

public class Categoria {
	
	private String name;
	
	private List<ItemLanchonete> itens;
	
	public Categoria(String name) {
		this.name = name;
		this.itens = new ArrayList<>(); 
	}

	public String getName() {
		return name;
	}
	
	
	public void adicionarItens(ItemLanchonete item) {
		itens.add(item);
	}
	
	public List<ItemLanchonete> getItens(){
		return itens;
		
	}
	
}
