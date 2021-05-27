/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Jesús
 */
public class EjercicioTestParticionesBAClass {
    
    private static Ejercicio1 e1;
    
    public EjercicioTestParticionesBAClass() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("SetUpClass => BeforeClass");
        e1 = new Ejercicio1();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("TearDownClass => AfterClass");
        e1 = null;
    }
    
    @Before
    public void setUp() {
        System.out.println("SetUp => Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("TearDown => After");
    }
    
    
    /**
     * Test of IntroducirCadena method, of class Ejercicio1.
     */
    @Test
    public void testIntroducirCadenaCaso3_1() {
        System.out.println("Test Particiones 3_1");
        String valor = "cinco";
        String resEsp = "Cadena incorrecta. La longuitud de la cadena es < 6";
        assertEquals(resEsp, e1.IntroducirCadena(valor));
    }
    
    @Test
    public void testIntroducirCadenaCaso3_2() {
        System.out.println("Test Particiones 3_2");
        String valor = "dreqed2";
        String resEsp = "Cadena incorrecta. No es alfabética.";
        assertEquals(resEsp,e1.IntroducirCadena(valor));
    }
    
    @Test
    public void testIntroducirCadenaCaso3_3() {
        System.out.println("Test Particiones 3_3");
        String valor = "cincoci";
        String resEsp = "Cadena correcta. La aplicación permite el ingreso.";
        assertEquals(resEsp,e1.IntroducirCadena(valor));
    }
    
    @Test
    public void testIntroducirCadenaCaso3_4() {
        System.out.println("Test Particiones 3_4");
        String valor = "dreqedderls";
        String resEsp = "Cadena incorrecta. La longuitud de la cadena es > 10";
        assertEquals(resEsp,e1.IntroducirCadena(valor));
    }
    
}
