package proyecto2;



public class ListaEscritorio {
	
public NodoEscritorio primero;

	
public void insertarInicio(int id){
    NodoEscritorio nuevo=new NodoEscritorio(id);
    if(primero==null){
        primero=nuevo;
    }else{
        nuevo.siguiente=primero;
        primero.anterior=nuevo;
        primero=nuevo;
    }
}

public void insertarFinal(int id, char letter){
    NodoEscritorio nuevo=new NodoEscritorio(id, letter);
    if(primero==null){
        primero=nuevo;
    }else{
        NodoEscritorio aux=primero;
        while(aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente=nuevo;
        nuevo.anterior=aux;
    }
}

public void eliminar(int id){
    if(primero!=null){
        NodoEscritorio aux=primero;
        NodoEscritorio auxanterior=null;
        while(aux.siguiente!=null){
            if(aux.getId()==id){
                if(auxanterior==null){
                    primero=primero.siguiente;
                    aux.siguiente=null;
                    aux=primero;
                    return;
                }else{
                    auxanterior.siguiente=aux.siguiente;
                    aux.siguiente=null;
                    aux=auxanterior.siguiente;
                    aux.anterior=auxanterior;
                    return;
                }
            }else{
                auxanterior=aux;
                aux=aux.siguiente;
            }
        }
        if(aux.getId()==id){
            auxanterior.siguiente=null;
            aux=null;
        }  
    }
}
// TOMA LOS CAMPO DE InFORMACION DE LOS NODOS DE LA LISTA Y LOS DEVUELVE COMO UN STRING QUE FUE ALMACENADO EN UN STRINGBUFFER
public String recorrer(){
	String cadena = "";
	StringBuffer s = new StringBuffer();
	s.setLength(0);
	s.append("\n");
    if(primero==null){
    	s.append("LA LISTA DE ESCRITORIOS ESTA VACIA"+"\n") ;
    	cadena = s.toString();
    }else{
        NodoEscritorio aux=primero;
        while (aux!=null){
        	s.append("  ESCRITORIO "+aux.getLetter()+" "+"["+aux.getEstado()+"]"+"\n"/**/);
        	if(aux.getPasajero()!=null) {
        		s.append("	PASAJERO ID "+aux.getPasajero().getId()+"\n"+"	DOCUMENTOS "+aux.getPasajero().getDocumentos()+"\n"
        	+"	TURNOS "+aux.getPasajero().getTurnos()+"\n"+"	 DOCUMENTOS EN PILA"+"    "+aux.pila.recorrer()+"\n");
        	}
        	if(aux.cola!=null) {
        		s.append(aux.cola.recorrer());
        	}
        	cadena = s.toString();
            aux=aux.siguiente;
        }
    }
    return cadena;  
}
//RECORRE LA LISTA PERO NO MUESTRA LOS MISMO DATOS QUE EN EL PRIMER METODO
public String recorrer2(){
	String cadena = "";
	StringBuffer s = new StringBuffer();
	s.setLength(0);
	s.append("\n");
    if(primero==null){
    	s.append("LISTA VACIA"+"\n") ;
    	cadena = s.toString();
    }else{
        NodoEscritorio aux=primero;
        while (aux!=null){
        	s.append("  AVION "+aux.getId()+"\n"+"	TIPO: ["+aux.getLetter()+" ]"+"\n"+"	DESABORDAJE "+"\n"+"\n");
        	cadena = s.toString();
            aux=aux.siguiente;
        } 
    }
    return cadena;  
}

//CUENTA LA CANTIDAD DE NODOS QUE TIENE LA LISTA
public int contar() {
	int a = 0;
	NodoEscritorio aux = primero;
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





public NodoEscritorio buscar(int id) {
	NodoEscritorio aux = primero;
	if(aux==null) {
		System.out.println("La lista esta vacia");
	}else {
		while(aux.getId()!=id) {
			aux = aux.siguiente;
		}
	}
	return aux;
}

public NodoEscritorio getPrimero() {
	return primero;
}

public void setPrimero(NodoEscritorio primero) {
	this.primero = primero;
}

public NodoEscritorio last() {
	if(primero.siguiente == null) {
		return primero;
	}else {
		NodoEscritorio aux = primero;
		while(aux.siguiente!=null) {
			aux = aux.siguiente;
		}
		return aux;
	}
}
	
}
