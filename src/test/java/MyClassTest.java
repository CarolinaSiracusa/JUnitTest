import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    private MyClass miClase = new MyClass();

    private int [] arreglo = new int[] {1, 5, 3, 7};
    private int [] arregloConCero = new int[] {0, 5, 16, 7, 1, 4};

    @Test
    public void productoriaTest() {
        int result = miClase.productoria(arreglo);
        assertEquals(105, result);
    }

    @Test
    public void productoriaConCeroTest() {
        int result = miClase.productoria(arregloConCero);
        assertEquals(0, result);
    }

    @Test
    public void cantidadDeParesTest() {
        int result = miClase.cantidadDePares(arregloConCero);
        assertEquals(3, result);
    }

    @Test
    public void cantidadDeParesEqualsZeroTest() {
        int result = miClase.cantidadDePares(arreglo);
        assertEquals(0, result);
    }

    @Test
    public void esCapicuaTest() {
        boolean result = miClase.capicua("neuquen");
        assertTrue(result);
    }

    @Test
    public void noEsCapicuaTest() {
        boolean result = miClase.capicua("dinosaurio");
        assertFalse(result);
    }

    @Test
    public void tieneEspacioCapicuaTest() {
        boolean result = miClase.capicua("hola mundo");
        assertFalse(result);
    }
}
