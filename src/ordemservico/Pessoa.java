package ordemservico;

public class Pessoa {

    private int id;
    protected String nome;
    protected String cpf;

    private int getId() {
        return this.id
    }

    protected String getNome() {
        return this.nome;
    }

    protected String getCpf() {
        return this.cpf;
    }
}