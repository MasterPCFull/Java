package ordemservico;

public class Pessoa {

    private int id;
    protected String nome;
    protected String cpf;

    protected String getNome() {
        return this.nome;
    }

    protected String getCpf() {
        return this.cpf;
    }
}