package entity;

public class Editora {
    private String nome;

    public Editora(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "entity.Editora{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
