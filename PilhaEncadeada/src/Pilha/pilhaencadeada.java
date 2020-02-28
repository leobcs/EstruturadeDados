package Pilha;

public class pilhaencadeada {
	
	private Componente topo;
	
	public pilhaencadeada() {
		topo = null;
	}
	
	public void push(int elemento) {
		Componente nova = new Componente();
		nova.SetElemento(elemento);
		nova.SetProximo(topo);
		topo = nova;
	}
	
	public int pop() {
		if (topo!=null) {
			Componente aux = topo;
			int elemento = aux.GetElemento();
			topo = aux.GetProximo();
			return elemento;
		}
		else {
			throw new RuntimeException("Pilha Vazia");
		}		
	}
	
	public boolean IsEmpty() {
		return (topo == null);
	}
}