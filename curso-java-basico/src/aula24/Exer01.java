package aula24;

public class Exer01 {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarelo";
        lampada.tipoLuz = "Amarelo";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampiões";

        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
    }
}
