package exerciciosJava;

public class Repeticao {
    public static void main(String [] args){
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }
        System.out.println("A soma de 1 até 1000 é : " + soma);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
