package proyecto2;



public class ListaAvion {
	
public NodoAvion primero;
	
	public void insertarInicio(int id){
        NodoAvion nuevo=new NodoAvion(id);
        if(primero==null){
            primero=nuevo;
        }else{
            nuevo.siguiente=primero;
            primero.anterior=nuevo;
            primero=nuevo;
        }
    }
    
    public void insertarFinal(int id){
        NodoAvion nuevo=new NodoAvion(id);
        if(primero==null){
            primero=nuevo;
        }else{
            NodoAvion aux=primero;
            while(aux.siguiente!=null){
                aux=aux.siguiente;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        }
    }
    
    public void eliminar(int id){
        if(primero!=null){
            NodoAvion aux=primero;
            NodoAvion auxanterior=null;
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
    
    
    public void vaciar(){
        if(primero!=null){
                NodoAvion aux=primero;
                NodoAvion ant=null;
                primero=primero.siguiente;
                aux=null;
       }else{
           System.out.println("La Lista de Pasajeros esta vacia Vacia");
       }
     }
    
    // TOMA LOS CAMPO DE InFORMACION DE LOS NODOS DE LA LISTA Y LOS DEVUELVE COMO UN STRING QUE FUE ALMACENADO EN UN STRINGBUFFER
    public String recorrer(){
    	String cadena = "";
    	StringBuffer s = new StringBuffer();
    	s.setLength(0);
    	s.append("\n");
        if(primero==null){
        	s.append("LISTA VACIA"+"\n") ;
        	cadena = s.toString();
        }else{
            NodoAvion aux=primero;
            while (aux!=null){
            	s.append("  AVION "+aux.getId()+"\n"+"	TIPO: ["+aux.getTipo()+" ]"+"\n"+"	DESABORDAJE "+aux.getNumberD()+"\n"
            +"	MANTENIMIENTO "+aux.getNumberM()+"\n"+"	NUMERO DE PASAJEROS "+aux.getNumberP()+"\n");
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
            NodoAvion aux=primero;
            while (aux!=null){
            	s.append("  AVION "+aux.getId()+"\n"+"	TIPO: ["+aux.getTipo()+" ]"+"\n"+"	DESABORDAJE "+aux.getNumberD()+"\n"
            +"	MANTENIMIENTO "+aux.getNumberM()+"\n"+"\n");
            	cadena = s.toString();
                aux=aux.siguiente;
            } 
        }
        return cadena;  
    }
    
    //CUENTA LA CANTIDAD DE NODOS DE AVIONES QUE TIENE LA LISTA
    public int contar() {
		int a = 0;
		NodoAvion aux = primero;
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
    //CUENTA EL TOTAL DE TURNOS DE DESABORDAJE TOTAL PARA TODOS LOS NODOS DE  LA LISTA
    public int totalDes() {
    	int a = 0;
		NodoAvion aux = primero;
		if(aux==null) {
			a=0;
		}else {
			while(aux.siguiente!=null) {
				a = a + aux.getNumberD();
				aux = aux.siguiente;
			}
			a = a + aux.getNumberD();
		}
		return a;
	}
    
    
    
    public NodoAvion buscar(int id) {
    	NodoAvion aux = primero;
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
