package dio.desafio.POO.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(4);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("javaScript");
        curso2.setDescricao("curso javaScript");
        curso2.setCargaHoraria(5);
        System.out.println(curso2);

        //  Conteudo conteudo = new Curso();
            Conteudo conteudo = new Mentoria();
        // List<String> palavras = new ArrayList<>();

        conteudo.setTitulo("conteudo da mentoria java");
        System.out.println(conteudo);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição bootcmap Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("///////////////////////////////////////////////////////////");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Lucas" + devLucas.getConteudoInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println(""
                +"Pesquisar novamente... " +
                "");
        System.out.println("Conteudo inscritos Lucas" + devLucas.getConteudoInscritos());
        System.out.println("Conteudo concluidos Lucas" + devLucas.getConteudoConcluidos());
        System.out.println("XP Lucas = " + devLucas.calcularTotalXp());

        System.out.println("/////////////////////////////////////////////////////");

        Dev devMarina = new Dev();
        devMarina.setNome("Marina");
        devMarina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Marina" + devMarina.getConteudoInscritos());
        devMarina.progredir();
        devMarina.progredir();
        devMarina.progredir();
        System.out.println("" +
                "Pesquisar novamente... "
        +"");
        System.out.println("Conteudo inscritos Marina" + devMarina.getConteudoInscritos());
        System.out.println("Conteudos concluidos Marina" + devMarina.getConteudoConcluidos());
        System.out.println("XP Marina = " + devMarina.calcularTotalXp());




    }
}
