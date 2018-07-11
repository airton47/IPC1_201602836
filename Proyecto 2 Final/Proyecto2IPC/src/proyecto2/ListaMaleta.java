package proyecto2;

public class ListaMaleta {
	
public NodoMaleta primero;
	
	public void insertarInicio(NodoMaleta nuevo){
        if(primero==null){
                  primero=nuevo;
                  primero.siguiente=nuevo;
                  primero.anterior=primero;
        }else{
                  NodoMaleta aux=primero;
                  while(aux.siguiente!=primero)
                           aux=aux.siguiente;
                           aux.siguiente=nuevo;
                           nuevo.anterior=aux;
                           nuevo.siguiente=primero;
                           primero.anterior=nuevo;
                           primero=nuevo;
                 
        }
      }
	
	 public void insertarFinal(NodoMaleta nuevo){
         if(primero==null){
                   primero=nuevo;
                   primero.siguiente=nuevo;
                   primero.anterior=primero;
        } else{
                   NodoMaleta aux=primero;
                   while(aux.siguiente!=primero)
                            aux=aux.siguiente;
                            aux.siguiente=nuevo;
                            nuevo.anterior=aux;
                            nuevo.siguiente=primero;
                            primero.anterior=nuevo;
         }
       }
	 
	 public void eliminar(Integer dpi){
         if(primero!=null){
                   NodoMaleta aux=primero;
                   NodoMaleta anterior=null;
                   while(aux.siguiente!=primero){
                            if(aux.getId()==dpi){
                                      if(anterior==null){
                                               if(aux.siguiente==primero)
                                                        primero=null;
                                               else{
                                                        anterior=aux.anterior;
                                                        anterior.siguiente=aux.siguiente;
                                                        aux=aux.siguiente;
                                                        aux.anterior=anterior;
                                                        primero=aux;
                                                        anterior=null;
                                               }
                                      }else{
                                               aux.anterior=null;
                                               anterior.siguiente=aux.siguiente;
                                               aux=aux.siguiente;
                                               aux.anterior=anterior;
                                      }
                   }else{
                            anterior=aux;
                            aux=aux.siguiente;
                   }
         }   
               if(aux.getId()==dpi){
                    anterior.siguiente=primero;
                    primero.anterior=anterior;
                    aux=null;
            }
                   
         }else
                   System.out.println("LISTA VACIA");
       }
	 
	 public String recorrer(){
		 String cadena = "";
	    	StringBuffer s = new StringBuffer();
	    	s.setLength(0);
		 
         if(primero==null) {
        	 s.append("LISTA DE MALETAS VACIA"+"\n") ;
        	 cadena = s.toString();
                   //System.out.println("<-->NULL<-->");
         }else{
                   NodoMaleta aux=primero;
                   //System.out.print("<--> Inicio");
                   do{
                	   s.append("	MALETA ID "+aux.getId()+"\n");
                	   cadena = s.toString();
                            aux=aux.siguiente;
                   }while(aux!=primero);
                   //System.out.println(" <-->NULL<-->");
         }
         return cadena;
      }
	 
	 public int contar() {
			int a = 0;
			
			if(primero==null) {
				a=0;
			}else {
				
				NodoMaleta aux=primero;
                //System.out.print("<--> Inicio");
                do{
                	aux=aux.siguiente;
                    a++;
                }while(aux!=primero);
                //System.out.println(" <-->NULL<-->");
				
			}
			return a;
		}
	
}
