package ordemservico;

import java.util.Date;

/**
 * TODO verificar como PASSAR date
 */
public class OrdemServico {
    
    public int id;
    public Date dateSolicitacao;
    public Date dateInico;
    public Date dateFim;
    public double valorTotal;

    public int getId() {
        return this.id;
    }

    public Date getdateSolicitacao() {
        return this.dateSolicitacao;
    }

    public Date getdateInicio() {
        return this.dateInico;
    }

    public Date getdateFim() {
        return this.dateFim;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }
}