package com.gralha.controlprinters.domain;

import com.gralha.controlprinters.dtos.wifi.WifiDTO;
import com.gralha.controlprinters.dtos.wifi.WifiNewDTO;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="TB_WIFI")
public class WifiModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public WifiModel(Integer id, String nome, String empresa, String senha, String equipamento) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.senha = senha;
        this.equipamento = equipamento;
    }

    public WifiModel() {
    }

    public WifiModel(WifiDTO obj) {
        this.id = null;
        this.nome = obj.getNome();
        this.senha = obj.getSenha();
        this.empresa = obj.getEmpresa();
        this.equipamento = obj.getEquipamento();
    }

    public WifiModel(WifiNewDTO obj) {
        this.id = null;
        this.nome = obj.getNome();
        this.senha = obj.getSenha();
        this.empresa = obj.getEmpresa();
        this.equipamento = obj.getEquipamento();
    }

}
