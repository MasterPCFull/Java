package TesteProjeto;


/**
 * Escreva a descrição da classe OndemServico aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class OrdemServico
{  
    private int id;
    private String datesolicitacao;
    private String dateinicio;
    private String datefim;
    private double valortotal;
     public OrdemServico(int id,String datesolicitacao,String dateincio,String datefim,
     double valortotal)
    {
        this.id = id;
        this.datesolicitacao = datesolicitacao;
        this.dateinicio = dateinicio;
        this.datefim = datefim;
        this.valortotal = valortotal;
    }
     public int getId()
    {
        return this.id;
        
    }
     public String getdateSolicitacao()
    {
        return this.datesolicitacao;
        
    }
     public String getdateInicio()
    {
        return this.dateinicio;
        
    }
     public String getdateFim()
    {
        return this.datefim;
        
    }
     public double getvalorTotal()
    {
        return this.valortotal;
        
    }

    
}
