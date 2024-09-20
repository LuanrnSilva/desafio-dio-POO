package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{"
                + "titulo= "
                + getTitulo()
                + " descrição= "
                + getDescricao()
                + " carga horaria= "
                + cargaHoraria
                + '}';
    }
}
