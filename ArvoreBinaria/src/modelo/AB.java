package modelo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AB {
	
	public No raiz;
	
	
	//operações
	
	public void preOrdem(No arv) {
		
		if(arv != null) {
			
			System.out.print(arv.conteudo + " ");
			preOrdem(arv.esq);
			preOrdem(arv.dir);
			
		}
		
	}

	public void ordem(No arv) {
		
		if(arv != null) {
			
			ordem(arv.esq);
			System.out.print(arv.conteudo + " ");
			ordem(arv.dir);
			
		}
		
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
	
	/**
	public void ordemItComDeque(No arv) {
		
		Deque<No> pilha = new ArrayDeque<>();
		
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
	*/
	
	public void posOrdem(No arv) {
		
		if(arv != null) {
			
			posOrdem(arv.esq);
			posOrdem(arv.dir);
			System.out.print(arv.conteudo + " ");
			
		}
		
	}
	
	public void porNivel(No arv) {
			
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
	
	public void porNivelComArrayDeque(No arv) {
		
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