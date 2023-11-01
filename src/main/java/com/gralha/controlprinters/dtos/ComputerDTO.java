package com.gralha.controlprinters.dtos;

public class ComputerDTO {
    private Integer id ;
    private String setor;
    private String computador;
    private String usuario;
    private String so;
    private String ip;
    private String empresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ComputerDTO(Integer id, String setor, String computador, String usuario, String so, String ip, String empresa) {
        this.id = id;
        this.setor = setor;
        this.computador = computador;
        this.usuario = usuario;
        this.so = so;
        this.ip = ip;
        this.empresa = empresa;
    }
    public ComputerDTO() {
    }
}
