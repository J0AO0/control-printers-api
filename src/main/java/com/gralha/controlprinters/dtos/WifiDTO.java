package com.gralha.controlprinters.dtos;

public class WifiDTO {
    private Integer id;
    private String nome;
    private String empresa;
    private String senha;
    private String equipamento;

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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public WifiDTO(Integer id, String nome, String empresa, String senha, String equipamento) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.senha = senha;
        this.equipamento = equipamento;
    }

    public WifiDTO() {
    }
}
