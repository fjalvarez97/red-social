import java.util.ArrayList;
/**
 * Write a description of class EntradaConComentarios here.
 *
 * @Fran Alvarez
 * @Version 1.0
 */
public class EntradaConComentarios extends Entrada
{
    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class EntradaConComentarios
     */
    public EntradaConComentarios(String usuario)
    {
        super(usuario);
        comentarios = new ArrayList<>();
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
     * @return la informacion completa de la entrada
     */
    public String toString()
    {
        return super.toString() + comentarios();
    }
}
