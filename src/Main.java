import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Pessoa>> pessoas = new HashMap<>();

        pessoas.put ("juridica", new ArrayList<>());
        pessoas.put ("fisica", new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("digite fisica para cadatrar pessoa fisica, juridica para pessoa juridica ou sair para terminar");
            String tipoPessoa = scanner.nextLine();

            if (tipoPessoa.equals("sair")){
                break;
            }

            if (tipoPessoa.equals("fisica") || tipoPessoa.equals("juridica")) {
                System.out.println("digite o nome e o numero do cpf/cnpj separado por virgula, exemplo 'nome,0123'");
                String input = scanner.nextLine();
                String [] dados =input.split(",");

                if(dados.length == 2){
                    String nome = dados[0].trim().toLowerCase();
                    String numeroDoDocumento =dados[1].trim();

                    if (tipoPessoa.equals("fisica")) {
                        PessoaFisica pessoaFisica = new PessoaFisica(nome, numeroDoDocumento);
                        pessoas.get(tipoPessoa).add((pessoaFisica));
                    }if (tipoPessoa.equals("juridica")) {
                        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, numeroDoDocumento);
                        pessoas.get(tipoPessoa).add((pessoaJuridica));
                    }else {
                        System.out.println("algo deu erro, tente novamente");
                    }
                    System.out.println("Pessoa cadastrada com sucesso!");
                }else {
                    System.out.println("Dados inválidos. Certifique-se de que o nome e o número estão separados por vírgula.");
                }
            } else {
                System.out.println("opção inválida");
            }
        }
        scanner.close();
        System.out.println("\nPessoas cadastradas:");
        for (String key : pessoas.keySet()) {
            System.out.println(key + ":");
            for (Pessoa p : pessoas.get(key)) {
                System.out.println(p);
            }
        }
    }
}