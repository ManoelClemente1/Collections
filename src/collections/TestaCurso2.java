package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("teste ArraysList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula ", 30));
		javaColecoes.adiciona(new Aula("Modelando colecoes ", 10));
		

		List<Aula> aulasImutaveis = javaColecoes.getAulas();		
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);		
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
	}
}
