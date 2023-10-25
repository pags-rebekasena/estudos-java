package aula24;

import java.util.Date;

public class Exer04 {
    public static  void main(String[] args){

        LivroBiblioteca livro = new LivroBiblioteca();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLançamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.empretadoA = "Rebeka";

        System.out.println("Nome do livro = " +  livro.nome);
        System.out.println("Livro emprestado a : " + livro.empretadoA);
    }
}
