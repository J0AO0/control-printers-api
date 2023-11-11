package com.gralha.controlprinters.dtos.itens;

public class ItensDTO {
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

    public ItensDTO(Integer id, String nome, Long quantidade, String marca, String fornecedor, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.marca = marca;
        this.fornecedor = fornecedor;
        this.status = status;
    }

    public ItensDTO() {
    }
}
