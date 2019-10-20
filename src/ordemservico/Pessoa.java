package ordemservico;

/**
 * TODO testar se o getId funciona fora da classe
 */
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