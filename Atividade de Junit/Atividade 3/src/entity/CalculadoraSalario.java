package entity;

public class CalculadoraSalario {

    public static double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        double desconto;

        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR:
                if (salarioBase >= 3000.00) {
                    desconto = 0.2;
                } else {
                    desconto = 0.1;
                }
                break;
            case DBA:
            case TESTADOR:
                if (salarioBase >= 2000.00) {
                    desconto = 0.25;
                } else {
                    desconto = 0.15;
                }
                break;
            case GERENTE:
                if (salarioBase >= 5000.00) {
                    desconto = 0.3;
                } else {
                    desconto = 0.2;
                }
                break;
            default:
                throw new IllegalArgumentException("Cargo inválido.");
        }

        return salarioBase - (salarioBase * desconto);
    }
}


