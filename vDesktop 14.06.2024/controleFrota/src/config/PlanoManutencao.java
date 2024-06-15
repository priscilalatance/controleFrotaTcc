package config;

/**
 *
 * @author Priscila
 */
public class PlanoManutencao {
    private Integer idPlano;
    private String marca;
    private String modelo;
    private String motor;
    private Integer anoModelo;
    private Integer anoFabricacao;
    private Integer kmManutencao;

    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getKmManutencao() {
        return kmManutencao;
    }

    public void setKmManutencao(Integer kmManutencao) {
        this.kmManutencao = kmManutencao;
    }
        
}
