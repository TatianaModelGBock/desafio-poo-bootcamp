package br.com.bootcamp.desafio.dominio;

import java.util.*;

public class Dev {

    private String  nome;
    private Set<ConteudoMae> conteudoMaesInscritos = new LinkedHashSet<>();
    private Set<ConteudoMae> conteudoMaesConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoMaesInscritos.addAll(bootcamp.getConteudoMaes());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<ConteudoMae> conteudoMae = this.conteudoMaesInscritos.stream().findFirst();
        if (conteudoMae.isPresent()) {
            this.conteudoMaesConcluidos.add(conteudoMae.get());
            this.conteudoMaesInscritos.remove(conteudoMae.get());
        } else {
            System.err.println("Vocẽ não esta matriculado em nenhhum conteudo! ");
        }
    }

    public double calcularTotalXp() {
        Iterator<ConteudoMae> iterator = this.conteudoMaesConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /*return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }

    public Set<ConteudoMae> getConteudoMaesConcluidos() {
        return conteudoMaesConcluidos;
    }

    public void setConteudoMaesConcluidos(Set<ConteudoMae> conteudoMaesConcluidos) {
        this.conteudoMaesConcluidos = conteudoMaesConcluidos;
    }

    public Set<ConteudoMae> getConteudoMaesInscritos() {
        return conteudoMaesInscritos;
    }

    public void setConteudoMaesInscritos(Set<ConteudoMae> conteudoMaesInscritos) {
        this.conteudoMaesInscritos = conteudoMaesInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoMaesInscritos, dev.conteudoMaesInscritos) && Objects.equals(conteudoMaesConcluidos, dev.conteudoMaesConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoMaesInscritos, conteudoMaesConcluidos);
    }
}
