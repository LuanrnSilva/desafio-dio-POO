import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Spring boot");
        curso.setCargaHoraria(8);
        curso.setDescricao("Curso do framework java");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("mentoria com descrição");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp("Bootcamp Java Developer Claro",
                "Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Luan");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        Dev dev2 = new Dev("João");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());
    }
}