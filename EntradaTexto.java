import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Esta clase simula las entradas de texto de un muro en una red social tipo Facebook
 * @FranAlvarez
 * @Version 1.0
 */
public class EntradaTexto
{
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class EntradaTexto
     * @param autor el autor de la entrada
     * @param texto el mensaje de la entrada
     */
    public EntradaTexto(String autor, String texto)
    {
        usuario = autor;
        mensaje = texto;
        momentoPublicacion = momentoPublicacion.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }
    
    /**
     * Metodo usado para sumar "meGusta" a la entrada
     */
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    /**
     * Este metodo anade un comentario a los comentarios de la entrada
     * @param texto el texto que va a tener el comentario
     */
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    /**
     * Devuelve el mensaje de la entrada
     */
    public String getMensaje()
    {
        return mensaje;
    }
    
    /**
     * @return devuelve el momento en el que se realizo la publicacion  
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    /**
     * @return la informacion completa de la entrada
     */
    public String toString()
    {
        String textoADevolver ="";
        LocalDateTime ahora = momentoPublicacion.now();
        textoADevolver = "Mensaje de " + usuario + ": " + mensaje + " , publicado hace " + ((ahora.getMinute()) - (momentoPublicacion.getMinute()))  + " minutos," 
        + "tiene " + cantidadMeGusta + " MeGusta(s)";
        if (comentarios.size()>0){
            textoADevolver += " y " + comentarios.size() + " comentarios.";
        }
        else {
            textoADevolver += " y no tiene ningun comentario.";
        }
        return textoADevolver;
    }
}
