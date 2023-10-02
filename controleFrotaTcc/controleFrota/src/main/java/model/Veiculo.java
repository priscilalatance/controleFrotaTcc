package model;

import java.util.Date;

public class Veiculo {
	
	private Integer codVeiculo;
	private String placa;
	private String marca;
	private Date dataCadastro;
	private String tipoVeiculo;
	private Integer anoFabricacao;
	private String modelo;
	private Date dataCompra;
	private String chassi;
	private String anoModelo;
	private String cor;
	private Integer kmInicial;
	private Integer kmAtual;
	private String motor;
	private String crv;
	private String renavam;
	private String combustivel;
	private String vencimentoGarantia;
	private Boolean inativarVeiculo;
	
	public Veiculo(Integer codVeiculo, String placa, String marca, Date dataCadastro, String tipoVeiculo,
			Integer anoFabricacao, String modelo, Date dataCompra, String chassi, String anoModelo, String cor,
			Integer kmInicial, Integer kmAtual, String motor, String crv, String renavam, String combustivel,
			String vencimentoGarantia, Boolean inativarVeiculo) {
		super();
		this.codVeiculo = codVeiculo;
		this.placa = placa;
		this.marca = marca;
		this.dataCadastro = dataCadastro;
		this.tipoVeiculo = tipoVeiculo;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.dataCompra = dataCompra;
		this.chassi = chassi;
		this.anoModelo = anoModelo;
		this.cor = cor;
		this.kmInicial = kmInicial;
		this.kmAtual = kmAtual;
		this.motor = motor;
		this.crv = crv;
		this.renavam = renavam;
		this.combustivel = combustivel;
		this.vencimentoGarantia = vencimentoGarantia;
		this.inativarVeiculo = inativarVeiculo;
	}

	public Integer getCodVeiculo() {
		return codVeiculo;
	}

	public void setCodVeiculo(Integer codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(Integer kmInicial) {
		this.kmInicial = kmInicial;
	}

	public Integer getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual(Integer kmAtual) {
		this.kmAtual = kmAtual;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCrv() {
		return crv;
	}

	public void setCrv(String crv) {
		this.crv = crv;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getVencimentoGarantia() {
		return vencimentoGarantia;
	}

	public void setVencimentoGarantia(String vencimentoGarantia) {
		this.vencimentoGarantia = vencimentoGarantia;
	}

	public Boolean getInativarVeiculo() {
		return inativarVeiculo;
	}

	public void setInativarVeiculo(Boolean inativarVeiculo) {
		this.inativarVeiculo = inativarVeiculo;
	}
	

}
