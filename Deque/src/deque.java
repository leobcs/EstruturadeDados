public class deque {
		
	private Componente inicio;
	private Componente topo;
		
		
	public deque() {
		this.inicio = null;
		this.topo = null;
	}
    public Componente GetInicio() {
        return inicio;
    }

    public void setInicio(Componente inicio) {
        this.inicio = inicio;
    }

    public Componente GetTopo() {
        return topo;
    }

    public void SetTopo(Componente topo) {
        this.topo = topo;
    }
	
	public void inserirI(int elemento) {
		Componente nova = new Componente();
		nova.SetElemento(elemento);
		if (inicio == null) {
            inicio = nova;
            topo = nova;
		}
		else {
            nova.SetProximo(inicio);
            inicio = nova;
		}
	}
	
	public void inserirF(int elemento) {
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
			throw new RuntimeException("Deque Vazio");
		}		
	}
	
	
	public Object retirar2() {
		if (topo!=null) {
			Object x = topo.GetElemento();
			Componente aux = topo;
			topo = aux.GetAnterior();
			topo.SetProximo(null);
			aux.SetAnterior(null);
			return x;
		}
		else {
			throw new RuntimeException("Deque Vazio");
		}		
	}
		
		public boolean vazia() {
			return (this.inicio == null);
		}
	}
