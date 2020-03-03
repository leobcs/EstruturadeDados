public class main {

	public static void main(String[] args) {
		deque p = new deque();
		
		p.inserirF(1);
		p.inserirF(2);
		p.inserirF(3);
		p.inserirF(4);
		p.inserirF(5);
		
		while (!p.vazia()) {
		int componentes = p.retirar();
		System.out.println("Retirei "+componentes);
		}
		
		System.out.println("\n");
		deque q = new deque();
		
		q.inserirI(5);
		q.inserirI(4);
		q.inserirI(3);
		q.inserirI(2);
		q.inserirI(1);
		
		while (!q.vazia()) {
		Object componentes = q.retirar2();
		System.out.println("Retirei "+componentes);
		}
	
	}
}
