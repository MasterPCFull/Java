package TesteProjeto;
/**
 * Escreva a descrição da classe pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cliente
{  
    private String estado;
    private String cidade;
    private String endereco;
    private String cep;
    private long telefone;
     public Cliente(String estado,String cep,String cidade,String endereco,
    long telefone)
    {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.endereco = endereco;
        this.telefone = telefone;
    }
     public String getEstado()
    {
        return this.estado;
        
    }
     public String getCep()
    {
        return this.cep;
        
    }
     public String getEndereco()
    {
        return this.endereco;
        
    }
     public String getCidade()
    {
        return this.cidade;
        
    }
     public long getTelefone()
    {
        return this.telefone;
        
    }

    
}
