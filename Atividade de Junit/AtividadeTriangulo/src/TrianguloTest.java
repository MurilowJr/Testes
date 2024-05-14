import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Triângulo escaleno", Triangulo.tipoTriangulo(3, 4, 5));
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals("Triângulo isósceles", Triangulo.tipoTriangulo(3, 3, 4));
    }

    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Triângulo equilátero", Triangulo.tipoTriangulo(2, 2, 2));
    }

    // Casos de teste para isósceles válido
    @Test
    public void testTrianguloIsoscelesValidoPermutacao1() {
        assertEquals("Triângulo isósceles", Triangulo.tipoTriangulo(3, 4, 3));
    }

    @Test
    public void testTrianguloIsoscelesValidoPermutacao2() {
        assertEquals("Triângulo isósceles", Triangulo.tipoTriangulo(4, 3, 3));
    }

    @Test
    public void testTrianguloIsoscelesValidoPermutacao3() {
        assertEquals("Triângulo isósceles", Triangulo.tipoTriangulo(3, 3, 4));
    }

    // Caso de teste para valor zero
    @Test
    public void testValorZero() {
        assertEquals("Os valores dos lados devem ser maiores que zero.", Triangulo.tipoTriangulo(0, 3, 4));
    }

    // Caso de teste para valor negativo
    @Test
    public void testValorNegativo() {
        assertEquals("Os valores dos lados devem ser maiores que zero.", Triangulo.tipoTriangulo(-2, 3, 4));
    }

    // Caso de teste em que a soma de 2 lados é igual ao terceiro lado
    @Test
    public void testSomaDoisLadosIgualTerceiro() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", Triangulo.tipoTriangulo(3, 4, 7));
    }

    // Casos de teste para a permutação de valores em que a soma de 2 lados é igual ao terceiro lado
    @Test
    public void testSomaDoisLadosIgualTerceiroPermutacao1() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", Triangulo.tipoTriangulo(4, 7, 3));
    }

    @Test
    public void testSomaDoisLadosIgualTerceiroPermutacao2() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", Triangulo.tipoTriangulo(7, 3, 4));
    }

    // Caso de teste em que a soma de 2 lados é menor que o terceiro lado
    @Test
    public void testSomaDoisLadosMenorTerceiro() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", Triangulo.tipoTriangulo(2, 2, 5));
    }

    // Casos de teste para a permutação de valores em que a soma de 2 lados é menor que o terceiro lado
    @Test
    public void testSomaDoisLadosMenorTerceiroPermutacao1() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", Triangulo.tipoTriangulo(2, 5, 2));
    }

    @Test
    public void testSomaDoisLadosMenorTerceiroPermutacao2() {
        assertEquals("Os valores dos lados não formam um triângulo válido.", Triangulo.tipoTriangulo(5, 2, 2));
    }

    // Caso de teste para os três valores iguais a zero
    @Test
    public void testTresValoresZero() {
        assertEquals("Os valores dos lados devem ser maiores que zero.", Triangulo.tipoTriangulo(0, 0, 0));
    }

}
