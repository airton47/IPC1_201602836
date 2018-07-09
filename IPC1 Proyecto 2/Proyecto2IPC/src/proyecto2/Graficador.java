package proyecto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graficador {
	
	public String reemplazar(int posmemoria){
		String cad = Integer.toString(posmemoria);
        return cad.replace("-", "_");
	}
	
	public void crearDot(String nombre, NodoAvion primero){
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph listadoble{");
        pw.println(generarDot(primero));
        pw.println("}");
        pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
	
	public String generarDot(NodoAvion primero){
        String cadena = "";
        if(primero==null){
            System.out.println("vacio");
            return "";
        }else{
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"AVION "+primero.getId()+" ["+primero.getTipo()+"]"+"\n"+"DESABORDAJE "
            +primero.getNumberD()+"\n"+"PASAJEROS "+primero.getNumberP()+"\n"+"MANTENIMIENTO "+primero.getNumberM()+"\"];\n";
            if(primero.siguiente!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
                cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
                cadena+=generarDot(primero.siguiente);
            }
        }
        return cadena;
    }
	
	public void crearDot(String nombre, NodoPasajero primero) {
		FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph cola{");
        pw.println(generarDot(primero));
        pw.println("}");
        pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }		
	}
	
	public String generarDot(NodoPasajero primero) {
		String cadena = "";
		        if(primero==null){
		            System.out.println("vacio");
		            return "";
		        }else{
		            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"PASAJERO "+primero.getId()+"\n"+"MALETAS "+primero.getMaletas()
		            +"\n"+"TURNOS "+primero.getTurnos()+"\n"+"DOCUMENTOS "+primero.getDocumentos()+"\"];\n";
		            if(primero.siguiente!=null){
		                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
		                //cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
		                cadena+=generarDot(primero.siguiente);
		            }
		        }
		        return cadena;
		    }
	
	public void crearDot(String nombre, NodoEscritorio primero){
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph listaEscritorio{");
        pw.println(generarDot(primero));
        pw.println("}");
        pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    public String generarDot(NodoEscritorio primero){
    	String cadena = "";
        if(primero==null){
            System.out.println("vacio");
            return "";
        }else{
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"ESCRITORIO "+(primero.getLetter())+" "+"["+primero.getEstado()+"]"+"\"];\n";
            //cadena+=generarDot(primero.cola.primero)+"nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.cola.primero.hashCode())+";\n";
            if(primero.siguiente!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
                if(primero.cola!=null&&primero.cola.primero!=null) {
                	cadena+=generarDot(primero.cola.primero)+"nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.cola.primero.hashCode())+";\n";
                }
                if(primero.siguiente==null && primero.cola!=null && primero.cola.primero!=null) {
                	cadena+=generarDot(primero.cola.primero)+"nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.cola.primero.hashCode())+";\n";
                }
                	cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
                cadena+=generarDot(primero.siguiente);
            }
        }
        return cadena;
    }
    
    
    public void crearDot(String nombre, NodoEstacion primero) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph listaEstacion{");
        pw.println(generarDot(primero));
        pw.println("}");
        pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }		
	} 
    
    public String generarDot(NodoEstacion primero){
    	String cadena = "";
        if(primero==null){
            System.out.println("vacio");
            return "";
        }else{
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"ESTACION "+(primero.getId())+" "+"["+primero.getEstado()+"]"+"\"];\n";
            if(primero.siguiente!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
                //cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
                cadena+=generarDot(primero.siguiente);
            }
        }
        return cadena;
    }
    
    
    
    public void crearDot(String nombre, NodoMaleta primero, int num){
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph listaMaleta{");
        pw.println(generarDot(primero, num));
        pw.println("}");
        pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
	
	public String generarDot(NodoMaleta primero, int num){
        String cadena = "";
        if(primero==null){
            System.out.println("vacio");
            return "";
        }else{
        	NodoMaleta  aux = primero;
            
            for(int a = 1;a<=(num);a++){
            	cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"MALETA ID "+" ["+primero.getId()+"]"+"\"];\n";
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
                cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
                primero=primero.siguiente;
                //cadena+=generarDot(primero.siguiente);
                if(a==num) {
                	//cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"AVION "+primero.getId()+" ["+primero.getId()+"]"+"\"];\n";
                	//cadena+="nodo"+reemplazar(primero.hashCode())+"->"+reemplazar(primero.siguiente.hashCode())+";\n";
                	//cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+reemplazar(aux.anterior.hashCode())+";\n";
                }
            }
        }
        return cadena;
    }
	
	
	public void crearDot(String nombre, NodoPasajero pasajero,NodoAvion avion,NodoEscritorio escritorio, NodoEstacion estacion,NodoMaleta maleta,int n) {
		FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph graficoGeneral{");
        pw.println(generarDot(pasajero,avion,escritorio,estacion,maleta,n));
        pw.println("}");
        pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }		
	}
	
	public String generarDot(NodoPasajero pasajero,NodoAvion avion,NodoEscritorio escritorio, NodoEstacion estacion,NodoMaleta maleta,int n) {
		String cadena = "";
		        if(pasajero==null&&avion==null&&escritorio==null&&maleta==null&&estacion==null){
		            System.out.println("vacio");
		            return "";
		        }else{
		            cadena+=generarDot(pasajero)+generarDot(avion)+generarDot(escritorio)+generarDot(maleta,n)+generarDot(estacion);
		            }
		        
		        return cadena;
		    }
    
    	public void generarImagen(String archivo,String imagen){
    		String doPath = "\"C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe\"";
            String cmd = doPath + " -Tjpg "+archivo+" -o "+imagen;
            try {
                Runtime.getRuntime().exec(cmd);
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
    	}
	
}
