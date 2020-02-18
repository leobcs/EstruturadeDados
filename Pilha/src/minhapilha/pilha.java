package minhapilha;


public class pilha {
	int topo1, topo2, tamanho;
	Object[] componentes;
	
	
	public pilha() {
		componentes = new Object[10];
		tamanho = 10;
		topo1 = -1;
		topo2 = tamanho;
	}
	
	public Object topo1() throws xIsEmpty{
		try {
			return componentes[topo1];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new xIsEmpty();
		}
	}
	
	public Object topo2() throws xIsEmpty{
		try {
			return componentes[topo2];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new xIsEmpty();
		}
	}
	
	public boolean IsEmpty(){
		if (topo1 == -1 && topo2 == tamanho) {
			return true;
		}
		return false;	 
	}
	
	
	public boolean IsFull(){
		return (topo1==componentes.length - 1);	
	}
	
	public void push1(Object e){
		if(topo1+2 == topo2) {
			dobra();
		}
		topo1++;
		componentes[topo1] = e;
	}
	public void push2(Object e){
		if(topo1+2 == topo2) {
			dobra();
		}
		topo2--;
		componentes[topo2] = e;
	}
	
	public Object pop1() throws xIsEmpty{
	  try {
		  return componentes[topo1--];
	  }
	  catch (IndexOutOfBoundsException b) {
		  topo1++;
		  throw new xIsEmpty();
	  }
	}
	public Object pop2() throws xIsEmpty{
		  try {
			  return componentes[topo2--];
		  }
		  catch (IndexOutOfBoundsException b) {
			  topo2--;
			  throw new xIsEmpty();
		  }
	}
	
	private void dobra() {
		Object[] fugaz;
		fugaz = new Object[tamanho*2];
		for(int i = 0; i<topo1+1;i++) {
			fugaz[i] = componentes[i];
		}
		for(int i = tamanho; i>topo1+1;i--) {
			fugaz[i] = componentes[i];
		}
		topo2 += tamanho;
		tamanho *= 2;
		componentes = fugaz;
	}
	
	public int tamanho1() {
		return topo1+1;
	}
	public int tamanho2() {
		return tamanho-topo2;
	}
	public class xIsEmpty extends Exception{
		
		private static final long serialVersionUID = 1L;
		
		public xIsEmpty() {
			super("A pilha está vazia!");
		}
	}
	}
