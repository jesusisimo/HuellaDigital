/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BD;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesus
 */
public class ConexionBDTest {

    public ConexionBDTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class ConexionBD.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        ConexionBD instance = new ConexionBD();
        Connection expResult = null;
        Connection result = instance.conectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class ConexionBD.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        ConexionBD instance = new ConexionBD();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}