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
	 
	 public void eliminar(Integer id){
        if(primero!=null){
                  NodoEstacion aux=primero;
                  NodoEstacion ant=null;
                  //ubicamos a aux en el nodo que vamos a eliminar
                  while((aux!=null)&&(aux.getId()!=id)){
                           ant=aux;
                           aux=aux.siguiente;
                  } if(aux==null){
                           System.out.println("No existe el elemento");   
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
	 
	 public void recorrer(){
	        if(primero==null){
	            System.out.println("LISTA VACIA");
	        }else{
	            NodoEstacion aux=primero;
	            while (aux!=null){
	                System.out.print("	ESTACION "+aux.getId()+" "+"\n"+"\n");
	                aux=aux.siguiente;
	            }
	            System.out.println(" NULL");
	        }
	    
	       }
	
}
