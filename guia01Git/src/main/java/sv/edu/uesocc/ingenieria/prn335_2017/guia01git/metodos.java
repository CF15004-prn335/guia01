package sv.edu.uesocc.ingenieria.prn335_2017.guia01git;

/**
 *
 * @author usuario
 */
public class metodos {
    //Este método toma los primeros 30 caracteres de una cadena de texto
     public String getResume(String texto){
        return texto.substring(0, 29);
    }
   
     
    //Este metodo convierte a mayúscula el texto que recibe
    public String capitalizar(String texto){
        
        return texto.toUpperCase();
    }
    
    
    //Se compara un texto con otro(frase) y se devuelve la cantidad de coincidencias
    public int contarCoincidencias(String texto, String frase){
        
        return texto.compareTo(frase);
    }
    
}
