package exerciciosJava.OO;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Rebeka";
        funcionario1.sobrenome = "Sena";
        funcionario1.departamento = "TI";
        funcionario1.salario = 1445.0;
        funcionario1.dataEntrada = new Data();
        funcionario1.dataEntrada.dia = 3;
        funcionario1.dataEntrada.mes = 10;
        funcionario1.dataEntrada.ano = 2022;
        funcionario1.rg = "191219976";

        double aumentoFuncionario1 = 2000.0;
        funcionario1.recebeAumento(aumentoFuncionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Lucas";
        funcionario2.sobrenome = "Sena";
        funcionario2.departamento = "Jurídico";
        funcionario2.salario = 6500.0;
        funcionario2.dataEntrada = new Data();
        funcionario2.dataEntrada.dia = 27;
        funcionario2.dataEntrada.mes = 6;
        funcionario2.dataEntrada.ano = 2017;
        funcionario2.rg = "270620176";

        double aumentoFuncionario2 = 1000.0;
        funcionario2.recebeAumento(aumentoFuncionario2);

        if (funcionario1 == funcionario2) {
            System.out.println("funcionario1 e funcionario2 são a mesma referência.");
        } else {
            System.out.println("funcionario1 e funcionario2 são referências diferentes.");
        }

        Funcionario funcionario3 = funcionario1;
        if (funcionario1 == funcionario3) {
            System.out.println("funcionario1 e funcionario3 são a mesma referência.");
        } else {
            System.out.println("funcionario1 e funcionario3 são referências diferentes.");
        }

        System.out.println("\nDetalhes da Funcionária "  + funcionario1.nome);
        funcionario1.mostra();

        System.out.println("Salário anual da Funcionária " + funcionario1.nome + " É R$: " +  funcionario1.calculaGanhoAnual());
        System.out.println("A Funcionária " + funcionario1.nome + " recebeu um aumento de salário de R$ " + aumentoFuncionario1);


        System.out.println("\nDetalhes do Funcionário " + funcionario2.nome);
        funcionario2.mostra();

        System.out.println("Salário anual do Funcionário " + funcionario2.nome + " É R$: " +  funcionario2.calculaGanhoAnual());
        System.out.println("O Funcionário " + funcionario2.nome + " recebeu um aumento de salário de R$ " + aumentoFuncionario2);
    }
    }