package exerciciosJava.OO;



public class Funcionario {
    String nome;

    String sobrenome;
    String departamento;
    Data dataEntrada;
    String rg;
    double salario;

    void recebeAumento(double aumento) {
        salario += aumento;
    }

    double calculaGanhoAnual() {
        return salario * 12;
    }
    void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println(("Sobrenome: " + sobrenome));
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada: " + dataEntrada.getDataFormatada());
        System.out.println("RG: " + rg);
    }

}

