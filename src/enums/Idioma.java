package enums;

public enum Idioma {
    INGLES("inglês"),
    PORTUGUES("Português"),
    FRANCES("Francês"),
    ESPANHOL("Espanhol"),
    ARABE("Árabe");

    private final String idioma;

    Idioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }
}
