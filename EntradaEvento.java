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
    @Override
    public String toString()
    {
        return super.toString() + "Nombre del evento: " + titulo;
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
        System.out.println("Nombre del evento: " + titulo);
    }

    @Override
    public String toHtml()
    {
        return super.toHtml() + "<p>" + titulo + "</p>" + "\n";
    }
}