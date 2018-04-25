

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaEvento entradaE1;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("AutorEntradaTexto", "TextoEntradaTexto");
        entradaF1 = new EntradaFoto("AutorEntradaFoto", "URLEntradaFoto", "TituloEntradaFoto");
        entradaE1 = new EntradaEvento("UsuarioEntradaEvento", "TItuloEntradaEvento");
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaE1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
