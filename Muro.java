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
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
    }

    /**
     * Este metodo anade una entrada de texto al muro
     * @param la entrada de texto que vas a anadir
     */
    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }

    /**
     * Este metodo anade una entrade de foto/imagen al muro
     * @param la entrada de imagen que vas a anadir
     */
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }

    /**
     * @return la informacion completa de la entrada
     */
    public String toString()
    {
        String textoADevolver = "";
        if (mensajes.size()>0){
            System.out.println("Entradas de texto:");
            for (EntradaTexto entradaTexto : mensajes)
            {
                textoADevolver += entradaTexto;
                System.out.println(entradaTexto);
            }
        }
        else{
            System.out.println("No hay ninguna entrada de texto\n");
            textoADevolver += "No hay ninguna entrada de texto";
        }
        System.out.println("-------------------------------------\n");
        if (fotos.size()>0){
            System.out.println("Entradas de imagen:");
            for (EntradaFoto entradaFoto : fotos)
            {
                textoADevolver += entradaFoto;
                System.out.println(entradaFoto);
            }
        }
        else{
            System.out.println("No hay ninguna entrada de imagen");
            textoADevolver += "No hay ninguna entrada de imagen";
        }
        return textoADevolver;
    }
}
