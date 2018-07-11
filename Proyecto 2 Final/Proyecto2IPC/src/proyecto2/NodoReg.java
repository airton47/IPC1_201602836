package proyecto2;

public class NodoReg {

	private int id;
	public NodoReg siguiente;
	
	public NodoReg() {
		this.siguiente = null;
	}

	public NodoReg(int id, NodoReg siguiente) {
		super();
		this.id = id;
		this.siguiente = siguiente;
	}
	
	public NodoReg(int id) {
		this.id = id;
		this.siguiente = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NodoReg getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoReg siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
