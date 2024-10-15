public class PessoaFisica extends Pessoa {
    private final String CPF;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.CPF = cpf;
    }

    public String getCpf() {
        return CPF;
    }


    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                CPF:  %s
                """
                , getNome(), getCpf());
    }
}

