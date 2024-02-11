package config;

/**
 * @author Francisco Mariano
 */
public class Usuarios {

    private String re;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String cpf;
    private String senha;
    private String confirmarSenha;
    private Boolean inativarUsuario;

    public String getRe() {
        return re;
    }

    public void setRe(String re) {
        this.re = re;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public Boolean getInativarUsuario() {
        return inativarUsuario;
    }

    public void setInativarUsuario(Boolean inativarUsuario) {
        this.inativarUsuario = inativarUsuario;
    }

}
