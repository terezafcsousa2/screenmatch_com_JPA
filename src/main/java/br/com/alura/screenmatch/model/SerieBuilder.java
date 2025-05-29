package br.com.alura.screenmatch.model;

public class SerieBuilder {
    private DadosSerie dadosSerie;

    public SerieBuilder setDadosSerie(DadosSerie dadosSerie) {
        this.dadosSerie = dadosSerie;
        return this;
    }

    public Serie createSerie() {
        return new Serie(dadosSerie);
    }
}