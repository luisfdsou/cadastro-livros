package entity;

import java.util.List;

public class Autor {
    private String nome;
    private String nacionalidade;
    private List<String> profissao;

    public Autor(String nome, String nacionalidade, List<String> profissao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<String> getProfissao() {
        return profissao;
    }

    public void setProfissao(List<String> profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "entity.Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", profissao=" + profissao +
                '}';
    }
}
