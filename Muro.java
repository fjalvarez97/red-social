import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;
/**
 * Esta clase simula un muro de publicaciones de texto y fotos
 * 
 * @FranAlvarez 
 * @Version 1.0
 */
public class Muro
{
    private ArrayList<Entrada> entradas;
    private static final String RUTA = "web.html";
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
        for (Entrada entrada : entradas){
            entrada.mostrar();
        }
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

    /**
     * Muestra los datos de las entradas que le digamos
     * @param el tipo de entrada que quieras imprimir
     */
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada)
    {
        for (Entrada entrada : entradas) {
            if (entrada.getClass().getSimpleName().equals(tipoEntrada) || tipoEntrada == null) {
                entrada.mostrarDatosExclusivos();
            }
        }
    }

    /**
     * Escribimos
     */
    public void escribirArchivo()
    {
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get(RUTA);
        // Abrimos el archivo, escribimos en él y lo cerramos.
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html><head><meta charset=\"UTF-8\"/><link rel=\"stylesheet\" href=\"estilos.css\">" 
            + "</head><body><h1>Feisbus</h1><div>");
            for (Entrada entrada : entradas){ 
                archivo.write(entrada.toHtml()+ "</br></br>");
            }
            archivo.write("</div></body></html>");
            archivo.close();
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + RUTA);
        }
        catch (IOException excepcion) {
            System.out.println(excepcion);
        }
    }
}
