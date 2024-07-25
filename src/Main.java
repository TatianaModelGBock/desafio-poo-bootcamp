import br.com.bootcamp.desafio.dominio.Bootcamp;
import br.com.bootcamp.desafio.dominio.Curso;
import br.com.bootcamp.desafio.dominio.Dev;
import br.com.bootcamp.desafio.dominio.Metoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("curso java", "descrição curso java", 8);


        Curso curso2 = new Curso("curso js", "descrição curso js", 4);


        Metoria mentoria = new Metoria("mentoria de java", "descrição mentoria java", LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");

        bootcamp.getConteudoMaes().add(curso1);
        bootcamp.getConteudoMaes().add(curso2);
        bootcamp.getConteudoMaes().add(mentoria);

        Dev devTatiana = new Dev("Tatiana");
        devTatiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tatiana:" + devTatiana.getConteudoMaesInscritos());
        devTatiana.progredir();
        devTatiana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tatiana:" + devTatiana.getConteudoMaesInscritos());
        System.out.println("Conteúdos Concluídos Tatiana:" + devTatiana.getConteudoMaesConcluidos());
        System.out.println("XP:" + devTatiana.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoMaesInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoMaesInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoMaesConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

    }

