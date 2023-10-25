package aula24;

public class Exer03 {
    public static  void main(String[] args){

        LivroLivraria livro = new LivroLivraria();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLançamento = 2015;
        livro.preço = 63.39;

        System.out.println("Nome do livro = " +  livro.nome);
        System.out.println("Preçp do livro = " +  livro.preço);
    }
}
