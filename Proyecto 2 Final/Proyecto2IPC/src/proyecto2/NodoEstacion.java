package proyecto2;

public class NodoEstacion {
	
	private int id;
	NodoAvion avion;
	String estado;
	public NodoEstacion siguiente;
	
	public NodoEstacion() {
		this.avion = null;
		this.siguiente = null;
		setEstado(estado);
	}
	
	public NodoEstacion(int id) {
		this.id = id;
		this.avion = null;
		this.siguiente = null;
		setEstado(estado);
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
		if(avion!=null) {
			this.estado = "OCUPADO";
		}else {
			this.estado ="LIBRE";
		}
		this.avion = avion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		NodoAvion aux = this.avion;
		if(aux==null) {
			estado = "LIBRE";
		}else {
			estado = "OCUPADO";
		}
		this.estado = estado;
	}

	public NodoEstacion getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoEstacion siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
