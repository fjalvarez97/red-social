import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Esta clase simula una entrada a un muro de una red social tipo facebook de imagenes.
 * 
 * @FranAlvarez
 * @1.0
 */
public class EntradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
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
     * @return devuelve la url de la imagen de la entrada
     */
    public String getUrlImagen()
    {
        return urlImagen;
    }

    /**
     * @return devuelve el titulo de la imagen
     */
    public String getTituloImagen()
    {
        return titulo;
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
        textoADevolver = "Imagen de " + usuario + ": " + titulo + " url de la imagen: " + urlImagen + " , publicad hace " + ((ahora.getMinute()) - (momentoPublicacion.getMinute()))  + " minutos," 
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
