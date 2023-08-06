package poobasico;

public class Coordenador extends Pessoa{
	
	
	String cursoCoordenado;
	
	Coordenador(String nome, int idade, String cursoCoordenado){
		super(nome, idade);
		this.cursoCoordenado = cursoCoordenado;
	}
	String CursoCoordenado() {
		return "Meu nome é " + nome + " tenho " + idade + this.cursoCoordenado;
	}

}
