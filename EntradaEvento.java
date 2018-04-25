/**
 * Write a description of class EntradaEvento here.
 *
 * @FranAlvarez
 * @Version 1.0
 */
public class EntradaEvento extends Entrada
{
    private String titulo;
    /**
     * Constructor for objects of class EntradaEvento
     */
    public EntradaEvento(String usuario,String titulo)
    {
        super(usuario);
        this.titulo = titulo;
    }

    /**
     * @return devuelve el titulo de la entrada
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * @return la informacion completa de la entrada
     */
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";        
        aDevolver += "Titulo: " + titulo + "\n";
        return aDevolver;
    }

    /**
     * Imprime por pantalla la entrada con sus detalles
     */
    public void mostrar()
    {
        System.out.println(this);
    }
}