package br.com.bootcamp.desafio.dominio;

import java.time.LocalDate;

public class Metoria extends ConteudoMae {

    private LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Metoria(String titulo, String descricao, LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Metoria{" +
                "data=" + data +
                '}';
    }
}
