package com.gralha.controlprinters.dtos.userPrinter;


public class UserPrinterDTO {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UserPrinterDTO(Integer id, String nome, String email, String senha, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    public UserPrinterDTO() {
    }
}
