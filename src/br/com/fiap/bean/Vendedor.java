package br.com.fiap.bean;

public  class Vendedor implements Funcionario{
    //Criando atributos
    private String nome;
    private float valorHoraTrabalho;
    private float comissao;

    //Criando Construtores
    public Vendedor() {}
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.comissao = comissao;
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
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    /**
     * Metodo para calcular o salário do Vendedor
     * @return retorna valor do salario calculado
     */
    //Implementando metodo
    public float calcularSalario() {
        return (((valorHoraTrabalho * 40) * 4) * (1 + comissao/100));
    }
}
