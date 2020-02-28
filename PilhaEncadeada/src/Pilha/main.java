package Pilha;


public class main {

	public static void main(String[] args) {
		pilhaencadeada p = new pilhaencadeada();
	
		p.push(5);
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);

		
	while (!p.IsEmpty()) {
		int componentes = p.pop();
		System.out.println("Desempilhei "+componentes);
	}
	
		
	}

}
