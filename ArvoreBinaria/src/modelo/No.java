package modelo;

public class No {
	
	public int conteudo;
	public No esq, dir;
	
	public No(int valor, No se, No sd) {
		
		conteudo = valor;
		esq = se;
		dir = sd;
		
	} 

}
