package test;

import static org.junit.Assert.assertEquals;

import entity.CalculadoraSalario;
import entity.Funcionario;
import enums.Cargo;
import org.junit.Test;

public class CalculadoraSalarioTest {

    //testes para desenvolvedor (maior e menor que 3000)
    @Test
    public void testDesenvolvedorSalarioMaior() {
        Funcionario desenvolvedor = new Funcionario("João", "joao@example.com", 3500.00, Cargo.DESENVOLVEDOR);
        assertEquals(2800.00, CalculadoraSalario.calcularSalarioLiquido(desenvolvedor), 0.001);
    }

    @Test
    public void testDesenvolvedorSalarioMenor() {
        Funcionario desenvolvedor = new Funcionario("Maria", "maria@example.com", 2500.00, Cargo.DESENVOLVEDOR);
        assertEquals(2250.00, CalculadoraSalario.calcularSalarioLiquido(desenvolvedor), 0.001);
    }


    //testes para DBA (maior e menor que 2000)
    @Test
    public void testDBASalarioMaior() {
        Funcionario dba = new Funcionario("José", "jose@example.com", 2200.00, Cargo.DBA);
        assertEquals(1650.00, CalculadoraSalario.calcularSalarioLiquido(dba), 0.001);
    }

    @Test
    public void testDBASalarioMenor() {
        Funcionario dba = new Funcionario("Ana", "ana@example.com", 1800.00, Cargo.DBA);
        assertEquals(1530.00, CalculadoraSalario.calcularSalarioLiquido(dba), 0.001);
    }

    //testes para testador (maior e menor que 2000)
    @Test
    public void testTestadorSalarioMaior() {
        Funcionario testador = new Funcionario("Carlos", "carlos@example.com", 2200.00, Cargo.TESTADOR);
        assertEquals(1650.00, CalculadoraSalario.calcularSalarioLiquido(testador), 0.001);
    }

    @Test
    public void testTestadorSalarioMenor() {
        Funcionario testador = new Funcionario("Julia", "julia@example.com", 1800.00, Cargo.TESTADOR);
        assertEquals(1530.00, CalculadoraSalario.calcularSalarioLiquido(testador), 0.001);
    }

    //testes para gerente (maior e menor que 5000)
    @Test
    public void testGerenteSalarioMaior() {
        Funcionario gerente = new Funcionario("Pedro", "pedro@example.com", 6000.00, Cargo.GERENTE);
        assertEquals(4200.00, CalculadoraSalario.calcularSalarioLiquido(gerente), 0.001);
    }

    @Test
    public void testGerenteSalarioMenor() {
        Funcionario gerente = new Funcionario("Mariana", "mariana@example.com", 4500.00, Cargo.GERENTE);
        assertEquals(3600.00, CalculadoraSalario.calcularSalarioLiquido(gerente), 0.001);
    }
}

