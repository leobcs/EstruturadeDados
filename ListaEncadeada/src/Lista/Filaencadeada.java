
package Lista;

public class Filaencadeada {
	
	private Componente inicio;
	
	
	public Filaencadeada() {
		this.inicio = null;
	}
	
	public void inserir(int elemento) {
		Componente nova = new Componente();
		nova.SetElemento(elemento);
		nova.SetProximo(null);
		if (inicio == null) {
			inicio = nova;
		}
		else {
			Componente aux = new Componente();
			aux = inicio;
			while (aux.GetProximo() != null) {
				aux = aux.GetProximo();
			}
			aux.SetProximo(nova);
		}
	}
	
	public int retirar() {
		if (inicio!=null) {
			Componente aux = inicio;
			int elemento = aux.GetElemento();
			inicio = aux.GetProximo();
			return elemento;
		}
		else {
			throw new RuntimeException("Pilha Vazia");
		}		
	}
	
	public void listar() {
		if (inicio == null) {
			System.out.println("Pilha está vazia");
		}
		else {
			Componente aux = inicio;
			while (aux.GetProximo() != null) {
				System.out.println("Elemento visto"+aux.GetElemento());
				aux.GetProximo();
			}
		}
	}
	
	public boolean vazia() {
		return (this.inicio == null);
	}
}