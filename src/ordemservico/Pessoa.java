package ordemservico;

public class Pessoa {

    protected int id;
    protected String nome;
    protected String cpf;

    protected int getId() {
        return this.id;
    }

    protected String getNome() {
        return this.nome;
    }

    protected String getCpf() {
        return this.cpf;
    }
}