import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Triangulo {

    public static String tipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return "Os valores dos lados devem ser maiores que zero.";
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return "Os valores dos lados não formam um triângulo válido.";
        }
        if (lado1 == lado2 && lado2 == lado3) {
            return "Triângulo equilátero";
        }
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triângulo isósceles";
        }
        return "Triângulo escaleno";
    }

    // Teste para triângulo escaleno válido
    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Triângulo escaleno", tipoTriangulo(3, 4, 5));
    }

    // Teste para triângulo isósceles válido
    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals("Triângulo isósceles", tipoTriangulo(3, 3, 4));
    }

    // Teste para triângulo equilátero válido
    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Triângulo equilátero", tipoTriangulo(2, 2, 2));
    }

    // Casos de teste para isósceles válido contendo permutação dos mesmos valores
    @Test
    public void testTrianguloIsoscelesValidoPermutacao1() {
        assertEquals("Triângulo isósceles", tipoTriangulo(3, 4, 3));
    }

    @Test
    public void testTrianguloIsoscelesValidoPermutacao2() {
        assertEquals("Triângulo isósceles", tipoTriangulo(4, 3, 3));
    }

    @Test
    public void testTrianguloIsoscelesValidoPermutacao3() {
        assertEquals("Triângulo isósceles", tipoTriangulo(3, 3, 4));
    }

    // Teste para valor zero
    @Test
    public void testValorZero() {
        assertEquals("Os valores dos lados devem ser maiores que zero.", tipoTriangulo(0, 3, 4));
    }

    // Teste para valor negativo
    @Test
    public void testValorNegativo() {
        assertEquals("Os valores dos lados devem ser maiores que zero.", tipoTriangulo(-2, 3, 4));
    }

    // Teste para soma de 2 lados igual ao terceiro lado
    @Test
    public void testSomaDoisLadosIgualTerceiro() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", tipoTriangulo(3, 4, 7));
    }

    // Teste para soma de 2 lados menor que o terceiro lado
    @Test
    public void testSomaDoisLadosMenorTerceiro() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", tipoTriangulo(2, 2, 5));
    }

    // Teste para os três valores iguais a zero
    @Test
    public void testTresValoresZero() {
        assertEquals("Os valores dos lados devem ser maiores que zero.", tipoTriangulo(0, 0, 0));
    }
}
