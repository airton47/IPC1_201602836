package proyecto2;

public class NodoEstacion {
	
	private int id;
	NodoAvion avion;
	String estado;
	public NodoEstacion siguiente;
	
	public NodoEstacion() {
		
	}
	
	public NodoEstacion(int id) {
		this.id = id;
		this.avion = avion;
		this.siguiente = null;
		this.estado = "untaken";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NodoAvion getAvion() {
		return avion;
	}

	public void setAvion(NodoAvion avion) {
		this.avion = avion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public NodoEstacion getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoEstacion siguiente) {
		this.siguiente = siguiente;
	}
	
}
