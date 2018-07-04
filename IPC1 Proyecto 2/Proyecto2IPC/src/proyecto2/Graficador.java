package proyecto2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graficador {
	
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
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+primero.getTipo()+":"+primero.getId()+"\"];\n";
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
		            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+primero.getId()+":"+primero.getMaletas()+"\"];\n";
		            if(primero.siguiente!=null){
		                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
		                //cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
		                cadena+=generarDot(primero.siguiente);
		            }
		        }
		        return cadena;
		    }
	
	public void crearDot(String nombre, NodoMaleta primero) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph listaMaleta{");
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
    
    public String generarDot(NodoMaleta primero){
    	String cadena = "";
        if(primero==null){
            System.out.println("vacio");
            return "";
        }else{
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+primero.getId()+"\"];\n";
            if(primero.siguiente!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
                cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
                cadena+=generarDot(primero.siguiente);
            }
        }
        return cadena;
    }
    
    
	public void crearDot(String nombre, NodoEscritorio primero) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre+".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph listaMaleta{");
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
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"ESCRITORIO "+(primero.getLetter())+"\"];\n";
            if(primero.siguiente!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
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
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\"ESTACION "+(primero.getId())+"\"];\n";
            if(primero.siguiente!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.hashCode())+";\n";
                //cadena+="nodo"+reemplazar(primero.siguiente.hashCode())+"->"+"nodo"+reemplazar(primero.siguiente.anterior.hashCode())+";\n";
                cadena+=generarDot(primero.siguiente);
            }
        }
        return cadena;
    }
    
    
    
    public String reemplazar(int posmemoria){
        String cad = Integer.toString(posmemoria);
        return cad.replace("-", "_");
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
