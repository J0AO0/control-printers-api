package com.gralha.controlprinters.dtos;

public class ServerNewDTO {
    private Integer id ;
    private String ip;
    private String nome;
    private String empresa;
    private String so;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public ServerNewDTO(Integer id, String ip, String nome, String empresa, String so) {
        this.id = id;
        this.ip = ip;
        this.nome = nome;
        this.empresa = empresa;
        this.so = so;
    }

    public ServerNewDTO() {
    }
}
