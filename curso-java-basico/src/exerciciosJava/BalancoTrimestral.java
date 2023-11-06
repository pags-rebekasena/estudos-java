package exerciciosJava;

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gastos do trimestre foi : " + gastosTrimestral);

        int mediaMensal = gastosTrimestral/3;
        System.out.println("A média salarial é : " + mediaMensal);
    }
}