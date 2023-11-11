package com.gralha.controlprinters.domain;

import com.gralha.controlprinters.dtos.printer.PrinterDTO;
import com.gralha.controlprinters.dtos.printer.PrinterNewDTO;
import jakarta.persistence.*;


import java.io.Serializable;


@Entity
@Table(name= "TB_IMPRESSORAS")
public class PrintersModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id ;
    private String codigo;
    private String setor;
    private String ip;
    private String toner;
    private String empresa;
    private String fornToner;

    private Boolean status = Boolean.TRUE;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getToner() {
        return toner;
    }

    public void setToner(String toner) {
        this.toner = toner;
    }

    public String getFornToner() {
        return fornToner;
    }

    public void setFornToner(String fornToner) {
        this.fornToner = fornToner;
    }

    public PrintersModel(Integer id, String codigo, String setor, String ip, Boolean status, String toner, String empresa,
                         String fornToner) {
        this.id = id;
        this.codigo = codigo;
        this.setor = setor;
        this.ip = ip;
        this.status = status;
        this.toner = toner;
        this.empresa = empresa;
        this.fornToner = fornToner;
    }

    public PrintersModel() {
    }

    public PrintersModel(PrinterDTO obj) {
        this.id = null;
        this.codigo = obj.getCodigo();
        this.setor = obj.getSetor();
        this.ip = obj.getIp();
        this.status = obj.getStatus();
        this.toner = obj.getToner();
        this.empresa = obj.getEmpresa();
        this.fornToner = obj.getFornToner();
    }
    public PrintersModel(PrinterNewDTO obj) {
        this.id = null;
        this.codigo = obj.getCodigo();
        this.setor = obj.getSetor();
        this.ip = obj.getIp();
        this.status = obj.getStatus();
        this.toner = obj.getToner();
        this.empresa = obj.getEmpresa();
        this.fornToner = obj.getFornToner();
    }
}
