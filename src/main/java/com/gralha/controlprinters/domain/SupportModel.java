package com.gralha.controlprinters.domain;


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
    private String obs;

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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public SupportModel(Integer id, String printers, LocalDate idaManutencao, LocalDate voltaManutencao,
                        Integer contadorInicial, Integer contadorAtual, String obs) {
        this.id = id;
        this.printers = printers;
        this.idaManutencao = idaManutencao;
        this.voltaManutencao = voltaManutencao;
        this.contadorInicial = contadorInicial;
        this.contadorAtual = contadorAtual;
        this.obs = obs;
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
        this.obs = obj.getObs();
    }
    public SupportModel(SupportNewDTO obj) {
        this.id = null;
        this.contadorAtual = obj.getContadorAtual();
        this.contadorInicial = obj.getContadorInicial();
        this.idaManutencao = obj.getIdaManutencao();
        this.voltaManutencao = obj.getVoltaManutencao();
        this.printers = obj.getPrinters();
        this.obs = obj.getObs();
    }
}
