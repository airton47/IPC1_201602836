package proyecto2;



public class ColaPasajero {
	
public NodoPasajero primero;
	
	
	
	public void insertar(NodoPasajero nuevo) {
		NodoPasajero aux = primero;
		int n =1;
		if(primero==null) {
			primero = nuevo;
			nuevo.setId(n);
		}else {
			while(aux.siguiente!=null){
                aux=aux.siguiente;
       }
       aux.siguiente=nuevo;
       nuevo.setId(this.contar()/*+1*/);
		}
	}
	
	public void eliminar(Integer id) {
		NodoPasajero aux = primero;
		if(aux!=null) {
			aux.siguiente = primero;
			
		}else {
			verificar();
		}
	}
	
	public boolean verificar() {
		boolean aux = false;
		
		if(primero==null){
			return true;
		}
		return aux;
			
		
	}
	
	public String  recorrer() {
		String cadena = "";
    	StringBuffer s = new StringBuffer();
    	s.setLength(0);
    	s.append("\n");
        if(primero==null){
        	s.append("COLA VACIA"+"\n") ;
        	cadena = s.toString();
        }else{
            NodoPasajero aux=primero;
            while (aux!=null){
            	s.append("	ID DE PASAJERO "+aux.getId()+"\n"+"	  NUMERO DE MALETAS "+aux.getMaletas()+"\n"
            +"	  NUMERO DE DOCUMENTOS "+aux.getDocumentos()+"\n"+ "\n");
            	cadena = s.toString();
                aux=aux.siguiente;
            } 
        }
        return cadena;
	}
	
	public int contar() {
		int a = 0;
		NodoPasajero aux = primero;
		if(aux==null) {
			a=0;
		}else {
			while(aux.siguiente!=null) {
				aux = aux.siguiente;
				a++;
			}
			a = a+1;
		}
		return a;
	}
	
	public int contarMaletas() {
		int a = 0;
		NodoPasajero aux = primero;
		if(aux==null) {
			a=0;
		}else {
			while(aux.siguiente!=null) {
				aux = aux.siguiente;
				a = a + aux.getMaletas();
			}
			a = a +  aux.getMaletas();
		}
		return a;
	}
	
	public NodoPasajero buscar(int id) {
		NodoPasajero aux = primero;
    	if(aux==null) {
    		System.out.println("La lista esta vacia");
		}else {
			while(aux.getId()!=id) {
				aux = aux.siguiente;
			}
		}
    	return aux;
    }
	
}
