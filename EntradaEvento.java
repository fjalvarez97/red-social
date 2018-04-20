
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
}