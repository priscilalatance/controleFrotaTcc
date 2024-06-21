package config;

/**
 *
 * @author Priscila
 */
public class Manutencao {
    
    private Integer codProduto;
    private Integer kmManutencao;
    private String descricaoProduto;
    private Double valorProduto;
   // private Double setValorUnitario;

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getKmManutencao() {
        return kmManutencao;
    }

    public void setKmManutencao(Integer kmManutencao) {
        this.kmManutencao = kmManutencao;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    
}
