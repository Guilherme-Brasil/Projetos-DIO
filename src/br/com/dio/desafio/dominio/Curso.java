package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo; // Atributo encapsulado  (public -> private)
    private String descricao; // Atributo encapsulado (public -> private)
    private int cargaHoraria; // Atributo encapsulado (public -> private)

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
                "Nome = " + titulo + ", " +
                "Descrição = " + descricao + ", " +
                "Carga Horária = " + cargaHoraria + "h}";
    }
}
