package proyecto2;



public class NodoAvion {
	
	private int id;
	private  String tipo;
	int numberP;
	int numberD;
	int numberM;
	
	public NodoAvion siguiente;
	public NodoAvion anterior;
	
	
	
	public NodoAvion(int id){
		this.id = id;
		setTipo();
		setNumberP();
		setNumberD();
		setNumberM();
		this.siguiente = null;
		this.anterior = null;
	}
	
	

	public NodoAvion(int id, String tipo, int numberP, int numberD, int numberM) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numberP = numberP;
		this.numberD = numberD;
		this.numberM = numberM;
		this.siguiente = null;
		this.anterior = null;
	}



	public NodoAvion() {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numberP = numberP;
		this.numberD = numberD;
		this.numberM = numberM;
		this.siguiente = null;
		this.anterior = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo() {
		String tipo = "";
		int rn = (int)(Math.random()*3)+1;
		switch(rn){
		case 1:
			tipo = "PEQUENIO";
			break;
		case 2:
			tipo = "MEDIANO";
			break;
		case 3:
			tipo = "GRANDE";
			break;
		}
		this.tipo = tipo;
	}

	public int getNumberP() {
		return numberP;
	}

	public void setNumberP() {
		int numberP = 0;
		String s = this.getTipo();
		if(s=="PEQUENIO") {
			numberP = (int)(Math.random()*6+5);
		}
		if(s=="MEDIANO") {
			numberP = (int)(Math.random()*11+15);
		}
		if(s=="GRANDE") {
			numberP = (int)(Math.random()*11+30);
		}
		
		this.numberP = numberP;
	}

	public int getNumberD() {
		return numberD;
	}

	public void setNumberD() {
		int numberD = 0;
		String s = this.getTipo();
		if(s=="PEQUENIO") {
			numberD = 1;
		}
		if(s=="MEDIANO") {
			numberD = 2;
		}
		if(s=="GRANDE") {
			numberD = 3;
		}
		
		this.numberD = numberD;
	}

	public int getNumberM() {
		return numberM;
	}

	public void setNumberM() {
		int numberM = 0;
		String s = this.getTipo();
		if(s=="PEQUENIO") {
			numberM = (int)(Math.random()*3)+1;
		}
		if(s=="MEDIANO") {
			numberM = (int)(Math.random()*3+2);
		}
		if(s=="GRANDE") {
			numberM = (int)(Math.random()*4+3);
		}
		
		this.numberM = numberM;
	}

	public NodoAvion getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoAvion siguiente) {
		this.siguiente = siguiente;
	}

	public NodoAvion getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoAvion anterior) {
		this.anterior = anterior;
	}
	
	public void setNumberD(int numberD) {
		this.numberD = numberD;
	}
	
	public void setNumberP(int numberP) {
		this.numberP=numberP;
	}
	
	public void setNumberM(int numberM) {
		this.numberM = numberM;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
