public class PessoaJuridica extends Pessoa {
    private final String CNPJ;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.CNPJ = cnpj;
    }

    public String getCnpj() {
        return CNPJ;
    }

    @Override
    public String getTipo() {
        return "Pessoa Jurídica";
    }

    @Override
    public String toString() {
        return String.format("""
                        Nome: %s
                        CNPJ: %s
                        """,
                getNome(), getCnpj());
    }
}
