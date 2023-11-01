package com.gralha.controlprinters.dtos;


import java.time.LocalDate;

public class SupportDTO {

    private Integer id;
    private String printers;
    private LocalDate idaManutencao;
    private LocalDate voltaManutencao;
    private Integer contadorInicial;
    private Integer contadorAtual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrinters() {
        return printers;
    }

    public void setPrinters(String printers) {
        this.printers = printers;
    }

    public LocalDate getIdaManutencao() {
        return idaManutencao;
    }

    public void setIdaManutencao(LocalDate idaManutencao) {
        this.idaManutencao = idaManutencao;
    }

    public LocalDate getVoltaManutencao() {
        return voltaManutencao;
    }

    public void setVoltaManutencao(LocalDate voltaManutencao) {
        this.voltaManutencao = voltaManutencao;
    }

    public Integer getContadorInicial() {
        return contadorInicial;
    }

    public void setContadorInicial(Integer contadorInicial) {
        this.contadorInicial = contadorInicial;
    }

    public Integer getContadorAtual() {
        return contadorAtual;
    }

    public void setContadorAtual(Integer contadorAtual) {
        this.contadorAtual = contadorAtual;
    }

    public SupportDTO(Integer id, String printers, LocalDate idaManutencao, LocalDate voltaManutencao,
                      Integer contadorInicial, Integer contadorAtual) {
        this.id = id;
        this.printers = printers;
        this.idaManutencao = idaManutencao;
        this.voltaManutencao = voltaManutencao;
        this.contadorInicial = contadorInicial;
        this.contadorAtual = contadorAtual;
    }

    public SupportDTO() {
    }
}
