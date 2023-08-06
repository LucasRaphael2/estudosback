package poobasico;


//se for declarado - public final nomeDaClasse{ } - indicará que não poderá ser herdado por outras classes

public class Pessoa extends Object {
	
	String nome;
	int idade;
	
	Pessoa(String nome, int idade){
		this.nome = nome; 
		this.idade = idade;
	}
	
	String dizerNome() {
		return "Meu nome é "+ nome + " e possuo " + this.idade + " anos";
	}
	
	
	
}
