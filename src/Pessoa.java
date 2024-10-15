public abstract class Pessoa {

    private final String NOME;

    public Pessoa(String nome) {
        this.NOME = nome;
    }

    public String getNome() {
        return NOME;
    }
}
