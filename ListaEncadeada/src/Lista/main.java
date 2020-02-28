package Lista;


public class main {

	public static void main(String[] args) {
		Filaencadeada p = new Filaencadeada();
	
		p.inserir(5);
		p.inserir(4);
		p.inserir(3);
		p.inserir(2);
		p.inserir(1);

		
	while (!p.vazia()) {
		int componentes = p.retirar();
		System.out.println("Retirei "+componentes);
	}
	
		
	}

}
