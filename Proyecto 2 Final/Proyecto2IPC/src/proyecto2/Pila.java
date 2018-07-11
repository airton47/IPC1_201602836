package proyecto2;

public class Pila {
	
	public NodoPila cima;
	
	public void insertar(int x) {
		NodoPila nuevo = new NodoPila(x);
        //nuevo.getDocumentos() = x;
        if (cima==null)
        {
            nuevo.siguiente = null;
            cima = nuevo;
        }
        else
        {
            nuevo.siguiente = cima;
            cima = nuevo;
        }
	}
	
	public void eliminar() {
		if(cima!=null){
	         NodoPila aux=cima;
	         NodoPila ant=null;
	         cima=cima.siguiente;
	         aux=null;
        }else{
            System.out.println("La Lista de Pasajeros esta vacia Vacia");
        }
			
		
	}
	
	public String recorrer() {
		String cadena = "";
    	StringBuffer s = new StringBuffer();
    	s.setLength(0);
    	s.append("\n");
		 NodoPila reco=cima;
		 	//s.append("DOCUMENTOS EN PILA ");
	        //System.out.println("Listado de todos los elementos de la pila.");
	        while (reco!=null) {
	        	s.append("      Documentos "+"["+reco.getDocumentos()+"]"+"\n");
	            //System.out.print(reco.getDocumentos()+"\n");
	        	cadena = s.toString();
	            reco=reco.siguiente;
	        }
	        
	        System.out.println();	
	        return cadena;
	}
	
	public int contar() {
		int x =0;
		 NodoPila reco=cima;
	        System.out.println("Listado de todos los elementos de la pila.");
	        while (reco!=null) {
	            x = x +reco.getDocumentos();
	            reco=reco.siguiente;
	        }
	        return x;
		
	}

}
