package com.gralha.controlprinters.dtos;


public class PrinterNewDTO {
    private Integer id;
    private String codigo;
    private String setor;
    private String ip;
    private String toner;
    private String empresa;
    private Boolean status;
    private String fornToner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
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

    public String getToner() {
        return toner;
    }

    public void setToner(String toner) {
        this.toner = toner;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getFornToner() {
        return fornToner;
    }

    public void setFornToner(String fornToner) {
        this.fornToner = fornToner;
    }

    public PrinterNewDTO(Integer id, String codigo, String setor, String ip, Boolean status, String toner, String empresa,
    String fornToner ) {
        this.id = id;
        this.codigo = codigo;
        this.setor = setor;
        this.ip = ip;
        this.toner = toner;
        this.status = status;
        this.empresa = empresa;
        this.fornToner = fornToner;
    }

    public PrinterNewDTO() {
    }
}
