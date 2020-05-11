package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando ArraysList", 21);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamento lista de objetos", 15);
		Aula a4 = new Aula("Revisitando ArraysList menos tempo", 2);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		Collections.sort(aulas);
		
		aulas.forEach(a -> System.out.println(a));
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}
}
