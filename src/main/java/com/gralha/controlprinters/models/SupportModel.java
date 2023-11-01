package com.gralha.controlprinters.models;


import com.gralha.controlprinters.dtos.PrinterDTO;
import com.gralha.controlprinters.dtos.PrinterNewDTO;
import com.gralha.controlprinters.dtos.SupportDTO;
import com.gralha.controlprinters.dtos.SupportNewDTO;
import jakarta.persistence.*;


import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "TB_MANUTENCAO")
public class SupportModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

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

    public SupportModel(Integer id, String printers, LocalDate idaManutencao, LocalDate voltaManutencao,
                        Integer contadorInicial, Integer contadorAtual) {
        this.id = id;
        this.printers = printers;
        this.idaManutencao = idaManutencao;
        this.voltaManutencao = voltaManutencao;
        this.contadorInicial = contadorInicial;
        this.contadorAtual = contadorAtual;
    }

    public SupportModel() {
    }

    public SupportModel(SupportDTO obj) {
        this.id = null;
        this.contadorAtual = obj.getContadorAtual();
        this.contadorInicial = obj.getContadorInicial();
        this.idaManutencao = obj.getIdaManutencao();
        this.voltaManutencao = obj.getVoltaManutencao();
        this.printers = obj.getPrinters();
    }
    public SupportModel(SupportNewDTO obj) {
        this.id = null;
        this.contadorAtual = obj.getContadorAtual();
        this.contadorInicial = obj.getContadorInicial();
        this.idaManutencao = obj.getIdaManutencao();
        this.voltaManutencao = obj.getVoltaManutencao();
        this.printers = obj.getPrinters();
    }
}
