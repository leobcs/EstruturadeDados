package lista_simples;

public class Componente {
	private int elemento;
	private Componente proximo;
	
	public void SetElemento(int elemento) {
		this.elemento = elemento;
	}
	
	public int GetElemento() {
		return this.elemento;
	}
	
	public void SetProximo(Componente proximo) {
		this.proximo = proximo;
	}
	
	public Componente GetProximo() {
		return this.proximo;
	}
}
