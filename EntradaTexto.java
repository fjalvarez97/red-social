import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Esta clase simula las entradas de texto de un muro en una red social tipo Facebook
 * @FranAlvarez
 * @Version 1.0
 */
public class EntradaTexto extends EntradaConComentarios
{
    private String mensaje;
    /**
     * Constructor for objects of class EntradaTexto
     * @param autor el autor de la entrada
     * @param texto el mensaje de la entrada
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;;
    }

    /**
     * Devuelve el mensaje de la entrada
     */
    public String getMensaje()
    {
        return mensaje;
    }

    /**
     * Muestra por pantalla el usuario junto al mensaje que ha publicado
     */
    public void mostrarAutorYMensaje()
    {
        System.out.println("Autor: " + getUsuario() + "\n");
        System.out.println("Mensaje: " + mensaje);
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
     * @return la informacion completa de la entrada
     */
    @Override
    public String toString()
    {
        return  super.toString() + "Texto del mensaje: " + mensaje + "\n" ;
    }

    @Override
    public void mostrarDatosExclusivos()
    {                
        System.out.println(mensaje + "\n");
    }
    
    @Override
    public String toHtml()
    {
        return  super.toHtml() + "<p>Mensaje: " + mensaje + "</p>" ;
    }
}
