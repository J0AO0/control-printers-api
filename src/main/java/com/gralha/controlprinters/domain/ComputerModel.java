package com.gralha.controlprinters.domain;

import com.gralha.controlprinters.dtos.computer.ComputerDTO;
import com.gralha.controlprinters.dtos.computer.ComputerNewDTO;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_COMPUTADORES")
public class ComputerModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

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

    public ComputerModel(Integer id, String setor, String computador, String usuario, String so, String ip, String empresa) {
        this.id = id;
        this.setor = setor;
        this.computador = computador;
        this.usuario = usuario;
        this.so = so;
        this.ip = ip;
        this.empresa = empresa;
    }

    public ComputerModel() {
    }

    public ComputerModel(ComputerDTO obj) {
        this.id = null;
        this.setor = obj.getSetor();
        this.computador = obj.getComputador();
        this.usuario = obj.getUsuario();
        this.so = obj.getSo();
        this.ip = obj.getIp();
        this.empresa = obj.getEmpresa();
    }
    public ComputerModel(ComputerNewDTO obj) {
        this.id = null;
        this.setor = obj.getSetor();
        this.computador = obj.getComputador();
        this.usuario = obj.getUsuario();
        this.so = obj.getSo();
        this.ip = obj.getIp();
        this.empresa = obj.getEmpresa();
    }
}
