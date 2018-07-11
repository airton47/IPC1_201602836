package proyecto2;

public class NodoPila {
	
	private int documentos;
	public NodoPila siguiente;
	
	public NodoPila(int documentos) {
		this.documentos = documentos;
		this.siguiente = null;
	}

	public int getDocumentos() {
		return documentos;
	}

	public void setDocumentos(int documentos) {
		this.documentos = documentos;
	}

	public NodoPila getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoPila siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
