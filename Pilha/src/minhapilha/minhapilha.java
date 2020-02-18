
package minhapilha;


public class minhapilha {

	public static void main(String[] args) {
		pilha p = new pilha();
		
		p.push1(5);
		p.push1(4);
		p.push1(3);
		p.push1(2);
		p.push1(1);
		
		p.push2(5);
		p.push2(4);
		p.push2(3);
		p.push2(2);
		p.push2(1);
		

	while (!p.IsEmpty()) {
		Object componentes = p.pop1();
		System.out.println("Desempilhei "+componentes);
	}
	
		
	}

}
