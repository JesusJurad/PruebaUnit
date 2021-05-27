/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesús
 */
public class EjercicioTestValorBorde {
    
    public EjercicioTestValorBorde() {
    }

    
    
    
    /**
     * Test of IntroducirCadena method, of class Ejercicio1.
     */
    @Test
    public void testIntroducirCadenaCaso4_1() {
        System.out.println("Test Particiones 3_1");
        Ejercicio1 e1 = new Ejercicio1();
        String valor = "cinco";
        String resEsp = "Cadena incorrecta. La longuitud de la cadena es < 6";
        assertEquals(resEsp, e1.IntroducirCadena(valor));
    }
    
    @Test
    public void testIntroducirCadenaCaso4_2() {
        System.out.println("Test Particiones 3_2");
        Ejercicio1 e1 = new Ejercicio1();
        String valor = "dreqed2";
        String resEsp = "Cadena incorrecta. No es alfabética.";
        assertEquals(resEsp,e1.IntroducirCadena(valor));
    }
    
    @Test
    public void testIntroducirCadenaCaso4_3() {
        System.out.println("Test Particiones 3_3");
        Ejercicio1 e1 = new Ejercicio1();
        String valor = "cincoci";
        String resEsp = "Cadena correcta. La aplicación permite el ingreso.";
        assertEquals(resEsp,e1.IntroducirCadena(valor));
    }
    
    @Test
    public void testIntroducirCadenaCaso3_4() {
        System.out.println("Test Particiones 3_4");
        Ejercicio1 e1 = new Ejercicio1();
        String valor = "dreqedderls";
        String resEsp = "Cadena incorrecta. La longuitud de la cadena es > 10";
        assertEquals(resEsp,e1.IntroducirCadena(valor));
    }
    
}
