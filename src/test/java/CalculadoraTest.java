import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    Calculadora calc;
    @Before
    public void iniciotest(){
        System.out.println("Incio Test de Calculadora");
        calc =new Calculadora();
    }

    @Test
    public void TestSuma(){
        // Resultado esperado del test

        System.out.println("Probando suma");
        double resultado = calc.sumar(2, 3);
        assertEquals(5, resultado, 0.01);
        assertEquals(10.0, calc.sumar(5, 5), 0.001);
        System.out.println("La suma es: "+resultado);
    }
    @Test
    public void TestResta(){
        // Resultado esperado del Test
       System.out.println("Probando resta");
       double resultado = calc.restar(15, 5);
        assertEquals(10.0, resultado, 0.001);
        System.out.println("La resta es: "+resultado);
    }
    @Test
    public void TestMulti(){
        System.out.println("Prueba multiplicacion ");
        double resultado = calc.multiplicar(2, 2);
        assertTrue(resultado == 4);
        System.out.println("La multiplicacion es: "+resultado);
        assertTrue(calc.multiplicar(5, 5)==25);
    }
    @Test
    public void TestDividir(){
        System.out.println("Prueba division");
        double resultado = calc.dividir(2, 2);
        assertTrue(resultado == 1);
        System.out.println("La division es: "+resultado);
        assertTrue(calc.dividir(25, 5)==5);
    }
    @After
    public void fintest(){
        System.out.println("Fin del test");
    }
}