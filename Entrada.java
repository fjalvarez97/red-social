import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Una entrada a un muro de una red social tipo facebook
 *
 * @Fran Alvarez
 * @version 1.0
 */
public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class Entrad
     */
    public Entrada(String usuario)
    {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        comentarios = new ArrayList<>();
        cantidadMeGusta = 0;
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
     * Metodo usado para sumar "meGusta" a la entrada
     */
    public void meGusta()
    {
        cantidadMeGusta++;
    }

    /**
     * Devuelve los me gusta
     * @return la cantidad de megusta que tiene la entrada
     */
    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;
    }

    /**
     * Devuelve el usuario de la entrada
     * @return usuario de la entrada
     */
    public String getUsuario()
    {
        return usuario;
    }

    /**
     * @return devuelve el momento en el que se realizo la publicacion  
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    /**
     * Comprueba si la entrada tiene o no comentarios
     * @return si tiene o no comentarios
     */
    public boolean tieneComentarios()
    {
        boolean vacio = false;
        if (comentarios.size()==0)
            vacio = true;
        return vacio;
    }

    /**
     * Devuelve los comentarios de la entrada (1 por linea)
     * @return los comentarios de la entrada
     */
    public String comentarios()
    {
        String aDevolver = "";
        if (comentarios.size() == 0){
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
    
    /**
     * @return devuelve el tiempo que ha pasado desde que se ha realizado la entrada
     */
    public String tiempoEntrada()
    {
        String aDevolver = "";
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace "  ;      
        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        if(numeroSegundos > 59){
           aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }
        return aDevolver;
    }
    
    /**
     * Obtiene la informacion de la entrada
     * @return los comentarios y el tiempo que ha pasado desde que se publico
     * la entrada
     */
    public String getInfo()
    {
        String aDevolver ="";
        aDevolver += tiempoEntrada();
        aDevolver += "\n";
        aDevolver += comentarios();
        return aDevolver;
    }
}
