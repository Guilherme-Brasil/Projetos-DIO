package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria; // Atributo encapsulado (public -> private)

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
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
                "Nome = " + getTitulo() + ", " +
                "Descrição = " + getDescricao() + ", " +
                "Carga Horária = " + cargaHoraria + "h}";
    }


}
