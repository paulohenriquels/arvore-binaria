package modelo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AB {
	
	public No raiz;
	
	
	//operações
	
	public void preOrdem(AB arv) {
		preOrdem(arv.raiz);
	}
	
	private void preOrdem(No arv) {
		
		if(arv != null) {
			
			System.out.print(arv.conteudo + " ");
			preOrdem(arv.esq);
			preOrdem(arv.dir);
			
		}
		
	}
	
	public void ordem(AB arv) {
		ordem(arv.raiz);
	}

	private void ordem(No arv) {
		
		if(arv != null) {
			
			ordem(arv.esq);
			System.out.print(arv.conteudo + " ");
			ordem(arv.dir);
			
		}
		
	}
	
	public void ordemIt(AB arv) {
		ordemIt(arv.raiz);
	}
	
	public void ordemIt(No arv) {
		
		Stack<No> pilha = new Stack<>();
		
		pilha.push(arv);
		
		No corrente = null;
		
		while(true) {
			
			corrente = pilha.pop();
			
			if(corrente != null) {
				
				pilha.push(corrente);
				pilha.push(corrente.esq);
				
			}else {
				
				if(pilha.isEmpty())
					break;
				
				corrente = pilha.pop();
				System.out.print(corrente.conteudo + " ");
				pilha.push(corrente.dir);
			}
				
		}
		
		pilha = null;
	}
	
	
	public void ordemItComDeque(AB arv) {
		ordemItComDeque(arv.raiz);
	}
	
	private void ordemItComDeque(No arv) {
		
		if(arv != null) {
		
			Deque<No> pilha = new ArrayDeque<>();
		
			No corrente = arv;
			
			/**
			 * Se o nó corrente for null e a pilha está vazia, já encerra.
			 */
			
			while(pilha.isEmpty() == false || corrente != null) {
			
				/**
				 * O nó corrente vai pra pilha se for diferente de null.
				 * Após isso, movemos a ação para o filho esquerdo.
				 */
				
				if(corrente != null) {
				
					pilha.push(corrente);
					corrente = corrente.esq;
				
				}else {
					
					/**
					 * Se o nó corrente não existir, retiramos um elemento da pilha, 
					 * imprimimos e movemos a ação para o filho direito deste novo nó
					 * corrente.
					 */
				
					corrente = pilha.pop();
					System.out.print(corrente.conteudo + " ");
					corrente = corrente.dir;
				}
				
			}
			
			pilha = null;
		
		}
	}
	
	
	public void posOrdem(AB arv) {
		posOrdem(arv.raiz);
	}
	
	private void posOrdem(No arv) {
		
		if(arv != null) {
			
			posOrdem(arv.esq);
			posOrdem(arv.dir);
			System.out.print(arv.conteudo + " ");
			
		}
		
	}
	
	public void porNivel(AB arv) {
		porNivel(arv.raiz);
	}
	
	private void porNivel(No arv) {
			
		No corrente = null;
		
		if(arv != null) {
			
			Queue<No> fila = new LinkedList<>();
			fila.add(arv);
			
			while(fila.isEmpty() == false) {
				
				corrente = fila.remove();
				System.out.print(corrente.conteudo + " ");
				
				if(corrente.esq != null)
					fila.add(corrente.esq);
				
				if(corrente.dir != null)
					fila.add(corrente.dir);
			}
			
		}
		
	}
	
	public void porNivelComArrayDeque(AB arv) {
		porNivelComArrayDeque(arv.raiz);
	}
	
	private void porNivelComArrayDeque(No arv) {
		
		No corrente = null;
		
		if(arv != null) {
			
			Queue<No> fila = new ArrayDeque<>();
			fila.add(arv);
			
			while(fila.isEmpty() == false) {
				
				corrente = fila.remove();
				System.out.print(corrente.conteudo + " ");
				
				if(corrente.esq != null)
					fila.add(corrente.esq);
				
				if(corrente.dir != null)
					fila.add(corrente.dir);
			}
			
		}
		
	}
}
