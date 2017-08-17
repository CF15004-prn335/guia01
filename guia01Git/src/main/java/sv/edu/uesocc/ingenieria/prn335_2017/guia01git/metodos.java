package sv.edu.uesocc.ingenieria.prn335_2017.guia01git;

/**
 *
 * @author usuario
 */
public class metodos {
    /**
     * @param texto
     * @return Los primeros 30 caracteres del texto
     */
     public String getResume(String texto){
        return texto.substring(0, 29);
    }
   
     
    /**
     * 
     * @param texto
     * @return  El texto en mayusculas
     */
    public String capitalizar(String texto){
        
        return texto.toUpperCase();
    }
    
    
    /**
     * 
     * @param texto
     * @param frase
     * @return Compara texto y frase y devuelve el numero de coincidencias
     */
    public int contarCoincidencias(String texto, String frase){
        
        return texto.compareTo(frase);
    }
    
}
