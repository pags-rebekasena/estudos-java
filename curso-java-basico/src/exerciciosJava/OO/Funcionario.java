package exerciciosJava.OO;


import java.util.Objects;

public class Funcionario {
    private String nome;

    private String sobrenome;
    private String cpf;
    private String departamento;
    private Data dataEntrada;
    private String rg;
    private double salario;



    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public  String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void  setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public Data getDataEntrada(){
        return dataEntrada;
    }
    public void setDataEntrada(Data dataEntrada){
        this.dataEntrada = dataEntrada;
    }
    public String getRg(){

        return rg;
    }
    public void setRg(String rg){

        this.rg = rg;
    }
    public  double getSalario(){
        return salario;
    }
    public void  setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    void recebeAumento(double aumento) {
        salario += aumento;
    }

    double calculaGanhoAnual() {
        return salario * 12;
    }
    void mostra() {
        System.out.println("Nome: " + getNome());
        System.out.println(("Sobrenome: " + getSobrenome()));
        System.out.println("CPF: " + getCpf());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário R$:" + getSalario());
        System.out.println("Data de Entrada: " + getDataEntrada().getDataFormatada());
        System.out.println("RG: " + getRg());
    }

}