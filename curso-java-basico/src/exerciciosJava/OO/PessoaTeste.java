package exerciciosJava.OO;

import java.util.ArrayList;
import java.util.List;

public class PessoaTeste {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Lucas", 6));
        pessoas.add(new Pessoa("Harry", 2));
        pessoas.add(new Pessoa("Rebeka", 25));
        pessoas.add(new Pessoa("Jeremais", 28));


        calcularMediaIdade(pessoas);
        encontrarMaiorIdade(pessoas);
        encontrarMenorIdade(pessoas);
        contarNomesComA(pessoas);
    }

    public static void calcularMediaIdade(List<Pessoa> pessoas) {
        int totalIdade = 0;
        for (Pessoa pessoa : pessoas) {
            totalIdade += pessoa.getIdade();
        }

        int quantidadePessoas = pessoas.size();
        double mediaIdade = (double) totalIdade / pessoas.size();
        System.out.println("Quantidade de pessoas Foram: " + quantidadePessoas);
        System.out.println("Média de idades das pessoas foi: " + mediaIdade);
    }

    public static void encontrarMaiorIdade(List<Pessoa> pessoas) {
        Pessoa pessoaMaisVelha = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoaMaisVelha == null || pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = pessoa;
            }
        }

        System.out.println("Pessoa mais velha: " + pessoaMaisVelha.getNome() + " - Idade: " + pessoaMaisVelha.getIdade());
    }

    public static void encontrarMenorIdade(List<Pessoa> pessoas) {
        Pessoa pessoaMaisNova = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoaMaisNova == null || pessoa.getIdade() < pessoaMaisNova.getIdade()) {
                pessoaMaisNova = pessoa;
            }
        }

        System.out.println("Pessoa mais nova: " + pessoaMaisNova.getNome() + " - Idade: " + pessoaMaisNova.getIdade());
    }

    public static void contarNomesComA(List<Pessoa> pessoas) {
        int count = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().contains("a") || pessoa.getNome().contains("A")) {
                count++;
            }
        }

        System.out.println("Quantidade de pessoas com 'a' ou 'A' no nome: " + count);
    }
}
