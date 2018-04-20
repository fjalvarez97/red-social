import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Esta clase simula las entradas de texto de un muro en una red social tipo Facebook
 * @FranAlvarez
 * @Version 1.0
 */
public class EntradaTexto extends Entrada
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
     * @return la informacion completa de la entrada
     */
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";        
        aDevolver += mensaje + "\n";        
        aDevolver += getInfo();
        return aDevolver;
    }
    
    /**
     * Muestra por pantalla el usuario junto al mensaje que ha publicado
     */
    public void mostrarAutorYMensaje()
    {
        System.out.println("Autor: " + getUsuario() + "\n");
        System.out.println("Mensaje: " + mensaje);
    }
}
