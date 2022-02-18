package entity;

import entity.Autor;
import entity.Editora;

import java.util.List;

public class Livro {
    private String nome;
    private List<String> tema;
    private Autor autor;
    private Integer dataLancamento;
    private Editora editora;
    private List<String> idiomas;

    public Livro(String nome, List<String> tema, Autor autor, Integer dataLancamento, Editora editora, List<String> idiomas) {
        this.nome = nome;
        this.tema = tema;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.editora = editora;
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "============================\n" +
                "entity.Livro{" +
                "nome='" + nome + '\'' +
                ", tema=" + tema +
                ", autor='" + autor + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", editora='" + editora + '\'' +
                ", idiomas=" + idiomas +
                "}";
    }
}
