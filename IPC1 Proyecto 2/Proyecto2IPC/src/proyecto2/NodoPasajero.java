package proyecto2;



public class NodoPasajero {
	
	private int id;
	private int maletas;
	private int documentos;
	private int turnos;
	
	public NodoPasajero siguiente;
	
	public NodoPasajero() {
		this.siguiente = null;
		this.id = id;
		setMaletas();
		setDocumentos();
		setTurnos();
	}
	
	public NodoPasajero(int id) {
		this.siguiente = null;
		this.id = id;
		setMaletas();
		setDocumentos();
		setTurnos();
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

	public void setMaletas() {
		this.maletas = (int)(Math.random()*4+1);
	}

	public int getDocumentos() {
		return documentos;
	}

	public void setDocumentos() {
		this.documentos = (int)(Math.random()*10+1);
	}

	public NodoPasajero getSiguiente() {
		return siguiente;
	}

	public void setsiguiente(NodoPasajero siguiente) {
		this.siguiente = siguiente;
	}
	
	public void setTurnos() {
		this.turnos = (int)(Math.random()*3+1);
	}
	
	public int getTurnos() {
		return turnos;
	}
	
}
