import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Esta clase simula un muro de publicaciones de texto y fotos
 * 
 * @FranAlvarez 
 * @Version 1.0
 */
public class Muro
{
    private ArrayList<Entrada> entradas;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<>();
    }

    /**
     * Este metodo anade una entrada al muro
     * @param la entrada que vas a anadir
     */
    public void addEntrada(Entrada entrada)
    {
        entradas.add(entrada);
    }
    
    /**
     * Imprime por pantalla las entradas
     */
    public void print()
    {
        System.out.println(this);
    }
    
    /**
     * @return la informacion completa de las entradas
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += "Entradas:\n";
        if (entradas.size()>0){
            for (Entrada entrada : entradas)
            {
                textoADevolver += entrada;
            }
        }
        else{
            textoADevolver += "No hay ninguna entrada";
        }
        return textoADevolver;
    }
}
