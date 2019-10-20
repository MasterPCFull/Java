package ordemservico;

import ordemservico.Pessoa;

/**
 * TODO verificar se precisa atribuir ID
 */
public class Atendente extends Pessoa {

    public void setId(int id) {
        super.id = id;
    }

    public void setNome(String nome) {
        super.nome = nome;
    }

    public void setCpf(String cpf) {
        super.cpf = cpf;
    }
}