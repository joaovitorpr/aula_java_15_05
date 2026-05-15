package br.com.fiap.bean;
//Implementando implements para chamar a interface Funcionario na classe Vigia.
public class VigiaNoturno implements Funcionario{
    //Criando atributos
    private String nome;
    private float valorHoraTrabalho;
    private float adicionalNoturno;

    //Criando Construtores
    public VigiaNoturno(){}

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.adicionalNoturno = adicionalNoturno;
    }

    //Criando getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    /**
     * Metodo para calcular o salário do Vigia Noturno
     * @return retorna valor do salario calculado
     */
    //Implementando metodo
    public float calcularSalario() {
        return ((valorHoraTrabalho * 40) * 4 + adicionalNoturno);
    }
}
