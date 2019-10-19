package TesteProjeto;
/**
 * Escreva a descrição da classe pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Servico
{  
    private int id;
    private String descricao;
    private double valor;
    public Servico(int id,String descricao,double valor)
    {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getId()
    {
        return this.id;
        
    }
    
    public String setDescricao()
    {
        return this.descricao;
        
    }
    
    public double getValor()
    {
        return this.valor;
        
    }

    

}

    