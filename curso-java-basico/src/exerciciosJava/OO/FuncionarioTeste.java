package exerciciosJava.OO;

public class FuncionarioTeste {
        public static void main(String[] args) {
            Funcionario funcionario1 = new Funcionario();
            funcionario1.setNome("Rebeka");
            funcionario1.setSobrenome("Sena");
            funcionario1.setCpf("123456789-10");
            funcionario1.setDepartamento("TI");
            funcionario1.setSalario(1445.0);

            Data data1 = new Data();
            data1.setDia(3);
            data1.setMes(10);
            data1.setAno(2022);
            funcionario1.setDataEntrada(data1);
            funcionario1.setRg("191219976");


            Funcionario funcionario2 = new Funcionario();
            funcionario2.setNome("Lucas");
            funcionario2.setSobrenome("Sena");
            funcionario2.setCpf("109876541-23");
            funcionario2.setDepartamento("Jurídico");
            funcionario2.setSalario(6500.0);

            Data data2 = new Data();
            data2.setDia(27);
            data2.setMes(6);
            data2.setAno(2017);
            funcionario2.setDataEntrada(data2);
            funcionario2.setRg("270620176");

            Funcionario funcionario3 = new Funcionario();
            funcionario3.setNome("Lucas2");
            funcionario3.setSobrenome("Sena");
            funcionario3.setCpf("109876541-23");
            funcionario3.setDepartamento("Jurídico");
            funcionario3.setSalario(6500.0);

            Data data3 = new Data();
            data3.setDia(27);
            data3.setMes(6);
            data3.setAno(2017);
            funcionario3.setDataEntrada(data2);
            funcionario3.setRg("270620176");




            if (funcionario1.equals(funcionario2)) {
                System.out.println("funcionario1 e funcionario2 são a mesma referência.");
            } else {
                System.out.println("funcionario1 e funcionario2 são referências diferentes.");
            }


            if (funcionario2.equals(funcionario3)) {
                System.out.println("funcionario1 e funcionario2 são a mesma referência.");
            } else {
                System.out.println("funcionario1 e funcionario2 são referências diferentes.");
            }

            System.out.println("\nDetalhes da Funcionária " + funcionario1.getNome());
            funcionario1.mostra();

            double aumentoFuncionario1 = 2000.0;
            funcionario1.recebeAumento(aumentoFuncionario1);

            System.out.println("Salário anual da Funcionária " + funcionario1.getNome() + " É R$: " + funcionario1.calculaGanhoAnual());
            System.out.println("A Funcionária " + funcionario1.getNome() + " recebeu um aumento de salário de R$ " + aumentoFuncionario1);


            System.out.println("\nDetalhes do Funcionário " + funcionario2.getNome());
            funcionario2.mostra();

            double aumentoFuncionario2 = 1000.0;
            funcionario2.recebeAumento(aumentoFuncionario2);
            System.out.println("Salário anual do Funcionário " + funcionario2.getNome() + " É R$: " + funcionario2.calculaGanhoAnual());
            System.out.println("O Funcionário " + funcionario2.getNome() + " recebeu um aumento de salário de R$ " + aumentoFuncionario2);
        }
    }