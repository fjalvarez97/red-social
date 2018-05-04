import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Esta clase simula una entrada a un muro de una red social tipo facebook de imagenes.
 * 
 * @FranAlvarez
 * @1.0
 */
public class EntradaFoto extends EntradaConComentarios
{
    private String urlImagen;
    private String titulo;
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
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
     * @return la informacion completa de la entrada
     */
    @Override
    public String toString()
    {
        return super.toString() + "Url: " + urlImagen + "\n"
        + "Titulo: " + titulo + "\n";
    }

    /**
     * Imprime por pantalla la entrada con sus detalles
     */
    @Override
    public void mostrar()
    {
        System.out.println(this);
    }

    /**
     * Devuelve los datos particulares de este tipo de entrada
     */
    public void mostrarDatosExclusivos()
    {
        System.out.println("Url: " + urlImagen + "\n"
            + "Titulo: " + titulo + "\n");
    }

    @Override
    public String toHtml()
    {
        return super.toHtml() + "<p><img src=\""+ urlImagen + "\"></p>"
                + "<p>" + titulo + "</p>";
    }
}
