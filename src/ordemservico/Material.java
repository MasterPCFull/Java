package ordemservico;

/**
 * TODO verificar se iniciar a classe com id 0 e ir acrescentando +1 funciona
 */
public class Material {
	
    public int id = 0;
    public String descricao;
    public double valor;

    /**
     * TODO acrescentar o método setValor igual ao descrição
     */

    public Material() {
        this.id ++;
    }

    public int getId(){
        return this.id;
    }

    // Pegar o que está salvo na descrição
    public String getDescricao(){
        return  this.descricao;
    }

    public double getValor(){
        return this.valor;
    }

    // Acrescentar uma descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}