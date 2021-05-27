/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Jesús
 */
@RunWith(value = Parameterized.class)
public class Ejercicio1TestParticionesParametros {
    
    private String valor;
    private String resEsp;
    
    public Ejercicio1TestParticionesParametros(String valor, String resEsp) {
        this.valor = valor;
        this.resEsp = resEsp;
    }
    
    @Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{"cinco","Cadena incorrecta. La longuitud de la cadena es < 6"});
        obj.add(new Object[]{"dreqed2","Cadena incorrecta. No es alfabética."});
        obj.add(new Object[]{"cincoci","Cadena correcta. La aplicación permite el ingreso."});
        obj.add(new Object[]{"dreqedderls","Cadena incorrecta. La longuitud de la cadena es > 10"});
        return obj;
    }
    
    @Test
    public void insertarCadena(){
        System.out.println("Test Parametro");
        Ejercicio1 e1 = new Ejercicio1();
        String resultEsp = this.resEsp;
        assertEquals(resultEsp, e1.IntroducirCadena(this.valor));
    }
    
}
