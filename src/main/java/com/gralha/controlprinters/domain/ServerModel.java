package com.gralha.controlprinters.domain;

import com.gralha.controlprinters.dtos.PrinterDTO;
import com.gralha.controlprinters.dtos.ServerDTO;
import com.gralha.controlprinters.dtos.ServerNewDTO;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="TB_SERVER")
public class ServerModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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

    public ServerModel(Integer id, String ip, String nome, String empresa, String so) {
        this.id = id;
        this.ip = ip;
        this.nome = nome;
        this.empresa = empresa;
        this.so = so;
    }

    public ServerModel() {
    }

    public ServerModel(ServerDTO obj) {
        this.id = null;
        this.ip = obj.getIp();
        this.nome = obj.getNome();
        this.empresa = obj.getEmpresa();
        this.so = obj.getSo();
    }

    public ServerModel(ServerNewDTO obj) {
        this.id = null;
        this.ip = obj.getIp();
        this.nome = obj.getNome();
        this.empresa = obj.getEmpresa();
        this.so = obj.getSo();
    }
}
