package config;

import java.time.LocalDate;

/**
 *
 * @author Priscila
 * @Francisco Mariano
 * @Vinicius Henrique
 */
public class OrdemServico {

    private Integer id;
    private LocalDate dataCheck;
    private String tipoManutencao;
    private String kmPreventiva;
    private String produtoCorretiva;
    private String statusOrdem;
    private String data;
    private Double valorTotal;
    private String placa;
    private int kmManutencao;

    public int getKmManutencao() {
        return kmManutencao;
    }

    public void setKmManutencao(int kmManutencao) {
        this.kmManutencao = kmManutencao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataCheck() {
        return dataCheck;
    }

    public void setDataCheck(LocalDate dataCheck) {
        this.dataCheck = dataCheck;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getKmPreventiva() {
        return kmPreventiva;
    }

    public void setKmPreventiva(String kmPreventiva) {
        this.kmPreventiva = kmPreventiva;
    }

    public String getProdutoCorretiva() {
        return produtoCorretiva;
    }

    public void setProdutoCorretiva(String produtoCorretiva) {
        this.produtoCorretiva = produtoCorretiva;
    }

    public String getStatusOrdem() {
        return statusOrdem;
    }

    public void setStatusOrdem(String statusOrdem) {
        this.statusOrdem = statusOrdem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
