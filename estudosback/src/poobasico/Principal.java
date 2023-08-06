package poobasico;

public class Principal {

	public static void main(String[] args) {
	  //Utlizando o construtor
		Aluno aluno = new Aluno("Lucas", 23, 10);
		Coordenador coordenador = new Coordenador("Lucas", 23, " e sou coordenador do curso de Java");
	  /*Metodo de herança mais comum
		Aluno aluno = new Aluno();
		aluno.nome = "Lucas";
		aluno.idade = 23;
		aluno.matricula = 10;*/
		System.out.println(aluno.dizerNome());
		System.out.println(coordenador.CursoCoordenado());
		
	}

}
