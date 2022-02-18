
import entity.Autor;
import entity.Editora;
import entity.Livro;
import enums.Idioma;

import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Renata Ventura","Brasileira",List.of("Jornalista","Escritora"));
        Editora editora1 = new Editora("Novo Século");

        Livro livro1 = new Livro(
                "A Arma Escarlate",
                List.of("Ficção","Fantasia"),
                autor1,
                2012,
                editora1,
                List.of(Idioma.PORTUGUES.getIdioma()));

        Livro livro2 = new Livro(
                "A Comissão Chapeleira",
                List.of("Ficção","Fantasia"),
                autor1,
                2016,
                editora1,
                List.of(Idioma.PORTUGUES.getIdioma()));

        Livro livro3 = new Livro(
                "Capitães de Areia",
                List.of("Romance"),
                new Autor("Jorge Amado","Brasileiro",List.of("Escritor")),
                1937,
                new Editora("Companhia das Letras"),
                List.of(Idioma.PORTUGUES.getIdioma()));

        List<Livro> livros = List.of(livro1,livro2,livro3);
        livros.forEach(System.out::println);
    }
}