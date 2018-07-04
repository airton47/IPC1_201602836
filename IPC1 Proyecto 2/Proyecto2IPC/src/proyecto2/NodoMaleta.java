package proyecto2;

public class NodoMaleta {
	
	private int id;

	public NodoMaleta siguiente;
	public NodoMaleta anterior;
	
	public NodoMaleta() {
		
	}
	
	public NodoMaleta(int id) {
		this.id = id;
		this.siguiente = null;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NodoMaleta getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoMaleta siguiente) {
		this.siguiente = siguiente;
	}

	public NodoMaleta getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoMaleta anterior) {
		this.anterior = anterior;
	}
	
}
