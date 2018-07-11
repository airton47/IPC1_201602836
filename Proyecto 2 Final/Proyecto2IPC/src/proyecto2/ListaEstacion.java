package proyecto2;


public class ListaEstacion {
	
	public NodoEstacion primero;
	
	 public void insertarInicio(NodoEstacion nuevo){
        if(primero==null){
            primero=nuevo;
        }else{
           nuevo.siguiente=primero;
           primero=nuevo;
        }
      }
	 
	 public void insertarFinal(NodoEstacion nuevo){
        
        NodoEstacion aux=primero;
        if(primero==null){
            primero=nuevo;
        }else{
                  while(aux.siguiente!=null){
                           aux=aux.siguiente;
                  }
                  aux.siguiente=nuevo;
        }
     
      }
	 
	 public void eliminar(int id){
        if(primero!=null){
                  NodoEstacion aux=primero;
                  NodoEstacion ant=null;
                  //ubicamos a aux en el nodo que vamos a eliminar
                  while((aux!=null)&&(aux.getId()!=id)){
                           ant=aux;
                           aux=aux.siguiente;
                  } if(aux==null){
                           System.out.println("No existe el elemento en le lista de Estaciones");   
                  }
                  if(ant==null){
                           primero=primero.siguiente;
                           aux.siguiente=null;
                           aux=null;
                  }else{
                           ant.siguiente=aux.siguiente;
                           aux.siguiente=null;
                           aux=null;
                  }
        }else{
            System.out.println("Lista Vacia");
        }
      }
	 
	 public String recorrer(){
		String cadena = "";
		StringBuffer s = new StringBuffer();
		s.setLength(0);
		s.append("\n");
	        if(primero==null){
	        	s.append("LISTA VACIA"+"\n") ;
	        	//System.out.println("LISTA VACIA");
	        }else{
	            NodoEstacion aux=primero;
	            while (aux!=null){
	            	s.append("  ESTACION "+aux.getId()+" "+"["+aux.getEstado()+"]"+"\n");
	            	if(aux.avion!=null) {
	            		s.append("	AVION ID "+aux.avion.getId()+"\n"+"	TURNOS "+aux.avion.getNumberM()+"\n"+"\n");
	            	}
	            	cadena = s.toString();
	                //System.out.print("	ESTACION "+aux.getId()+" "+"\n"+"\n");
	                
	                aux=aux.siguiente;
	            }
	            System.out.println(" NULL");
	        }
	    return cadena;
	   }
	 
	 public NodoEstacion buscar(int id) {
			NodoEstacion aux = primero;
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
