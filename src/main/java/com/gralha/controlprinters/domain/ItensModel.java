package com.gralha.controlprinters.domain;

import com.gralha.controlprinters.dtos.itens.ItensDTO;
import com.gralha.controlprinters.dtos.itens.ItensNewDTO;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "TB_ITENS")
public class ItensModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id ;
    private String nome;
    private Long quantidade;
    private String marca;
    private String fornecedor;
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

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ItensModel(Integer id, String nome, Long quantidade, String marca, String fornecedor, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.marca = marca;
        this.fornecedor = fornecedor;
        this.status = status;
    }

    public ItensModel() {
    }

    public ItensModel(ItensNewDTO obj){
        this.id = null;
        this.nome = obj.getNome();
        this.quantidade = obj.getQuantidade();
        this.marca = obj.getMarca();
        this.fornecedor = obj.getFornecedor();
        this.status = obj.getStatus();
    }

    public ItensModel(ItensDTO obj){
        this.id = null;
        this.nome = obj.getNome();
        this.quantidade = obj.getQuantidade();
        this.marca = obj.getMarca();
        this.fornecedor = obj.getFornecedor();
        this.status = obj.getStatus();
    }
}
