public class Componente {

	private int elemento;
	private Componente proximo;
	private Componente anterior;
	
	public void SetElemento(int elemento){
		this.elemento = elemento;
	}
	
	public int GetElemento() {
		return this.elemento;
	}
	
	public void SetProximo(Componente proximo) {
		this.proximo = proximo;
	}
	
	public Componente GetProximo(){
		return this.proximo;
	}
	
	public void SetAnterior(Componente anterior) {
		this.anterior = anterior;
	}
	
	public Componente GetAnterior(){
		return this.anterior;
	}
}
