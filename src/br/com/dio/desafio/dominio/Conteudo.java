package br.com.dio.desafio.dominio;

//Para evitar repetição de código, criaremos a classe abstrata Conteudo.
//Estamos implementando o conceito de herança.
//Conteudo será a classe mãe, enquanto Curso e Mentoria serão suas filhas.

public abstract class Conteudo { // Não iremos criar objetos do tipo Conteudo. Ou seja, essa classe não pode ser estanciada.
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
