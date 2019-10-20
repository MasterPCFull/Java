package ordemservico;

import ordemservico.Pessoa;

public class Tecnico extends Pessoa {

    private String telefone;

    public void setNome(String nome) {
        super.nome = nome;
    }

    public void setCpf(String cpf) {
        super.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }
}