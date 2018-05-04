import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Una entrada a un muro de una red social tipo facebook
 *
 * @Fran Alvarez
 * @version 1.0
 */
public  abstract class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String usuario)
    {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
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
        return aDevolver;
    }

    /**
     * @return la informacion completa de la entrada
     */
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";               
        aDevolver += getInfo();
        return aDevolver;
    }

    /**
     * 
     */
    public void mostrar()
    {

    }

    /**
     * Muestra por pantalla los datos exclusivos de la clase.
     */
    public void mostrarDatosExclusivos()
    { 
        
    }   
    
    /**
     * Devuelve los datos de la entradas como filas de una tabla html
     * @return los detalles de la entrada
     */
    public  String toHtml()
    {
        return "<p>Publicado por: " + usuario + "</p>"
             + "<p>Fecha publicacion: " + tiempoEntrada() + "</p>"
             + "<p> MeGusta: " + cantidadMeGusta + "</p>";            
    }
}
