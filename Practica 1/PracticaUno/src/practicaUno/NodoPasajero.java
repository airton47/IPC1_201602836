package practicaUno;



public class NodoPasajero {
	
	private int id;
	private int maletas;
	private int documentos;
	
	public NodoPasajero siguiente;
	
	public NodoPasajero() {
		this.siguiente = null;
		this.id = id;
		setMaletas(maletas);
		setDocumentos(documentos);
	}
	
	public NodoPasajero(int id) {
		this.siguiente = null;
		this.id = id;
		setMaletas(maletas);
		setDocumentos(documentos);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaletas() {
		return maletas;
	}

	public void setMaletas(int maletas) {
		int rn = (int)(Math.random()*4+1);
		maletas = rn;
		this.maletas = maletas;
	}

	public int getDocumentos() {
		return documentos;
	}

	public void setDocumentos(int documentos) {
		int rn = (int)(Math.random()*10+1);
		documentos = rn;
		this.documentos = documentos;
	}

	public NodoPasajero getSiguiente() {
		return siguiente;
	}

	public void setsiguiente(NodoPasajero siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
