package testes;

import modelo.AB;
import modelo.No;

public class TestaAB {

	public static void main(String[] args) {
		
		
		// criação dos nós do nível 3
		No no7 = new No(7, null, null);
		No no10 = new No(10, null, null);
		No no16 = new No(16, null, null);
		
		// criação dos nós do nível 2
		No no4 = new No(4, null, null);
		No no9 = new No(9, no7, no10);
		No no17 = new No(17, no16, null);

		// criação dos nós do nível 1
		No no6 = new No(6, no4, no9);
		No no13 = new No(13, null, no17);
		
		// criação do nó do nível 0
		No no11 = new No(11, no6, no13);
		
		AB ab = new AB();
		
		ab.raiz = no11;
		
		System.out.println("\n\n=== Percurso em Pré-Ordem ===");
		
		ab.preOrdem(ab.raiz);
		
		System.out.println("\n\n=== Percurso em Ordem ===");
		
		ab.ordem(ab.raiz);
		
		System.out.println("\n\n=== Percurso em Pós-Ordem ===");
		
		ab.posOrdem(ab.raiz);
		
		System.out.println("\n\n=== Percurso por Nível ===");
		
		ab.porNivel(ab.raiz);
		
		System.out.println("\n\n=== Percurso por Nível V2===");
		
		ab.porNivelComArrayDeque(ab.raiz);
		
		System.out.println("\n\n=== Percurso em Ordem Iterativo ===");
		
		ab.ordemIt(ab.raiz);
		
		System.out.println("\n\n=== Percurso em Ordem Iterativo V2===");
		
		ab.ordemItComDeque(ab.raiz);
		
	}

}
