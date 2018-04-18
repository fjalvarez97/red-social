import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
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
        String aDevolver = "";
        aDevolver += "Usuario: " + usuario + "\n";
        aDevolver += "Likes: " + cantidadMeGusta + "\n";        
        aDevolver += "Url: " + urlImagen + "\n";
        aDevolver += "Titulo: " + titulo + "\n";
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace ";
        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        if(numeroSegundos > 59){
            aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }
        aDevolver += "\n";
        // Comprobamos si hay comentarios. Si hay los mostramos, si no, mostramos un mensaje indicandolo.
        if (comentarios.size() == 0)         {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for(String comentarioActual : comentarios){
                aDevolver += comentarioActual + "\n";
            }
        } 
        return aDevolver;
    }
}
