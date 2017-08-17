package sv.edu.uesocc.ingenieria.prn335_2017.guia01git;

/**
 *
 * @author usuario
 */
public class metodos {
    
     public String getResume(String texto){
        return texto.substring(0, 29);
    }
   
     
     
    public String capitalizar(String texto){
        
        return texto.toUpperCase();
    }
    
    public int contarCoincidencias(String texto, String frase){
        
        return texto.compareTo(frase);
    }
    
}
