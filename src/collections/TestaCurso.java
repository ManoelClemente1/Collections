package collections;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("teste ArraysList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula ", 30));
		javaColecoes.adiciona(new Aula("Modelando colecoes ", 10));
		
		System.out.println(javaColecoes.getAulas());
		
		
	}
}
