package ordemservico;

import ordemservico.Pessoa;

public class Cliente extends Pessoa {
	
    public String endereco;
    public String cidade;
    public String estado;
    public String cep;
    public String telefone;

    // Verificar se o nome é public, protected ou private, dependendo do que for, precisa ser tratado aqui dentro

    public String getEndereco(){
        return this.endereco
    }

    public String getCidade(){
        return this.cidade
    }

    public String getEstado(){
        return this.estado
    }

    public String getCep(){
        return this.cep
    }

    public String getTelefone(){
        return this.telefone
    }
}