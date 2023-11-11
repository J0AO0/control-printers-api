package com.gralha.controlprinters.domain;

import com.gralha.controlprinters.dtos.userPrinter.UserPrinterDTO;
import com.gralha.controlprinters.dtos.userPrinter.UserPrinterNewDTO;
import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name= "TB_USUARIOS")
public class UserPrinterModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id ;
    private String nome;
    private String email;
    private String senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UserPrinterModel(Integer id, String nome, String email, String senha, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    public UserPrinterModel() {
    }

    public UserPrinterModel(UserPrinterDTO obj) {
        this.id = null;
        this.nome = obj.getNome();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.status = obj.getStatus();
    }
    public UserPrinterModel(UserPrinterNewDTO obj) {
        this.id = null;
        this.nome = obj.getNome();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.status = obj.getStatus();
    }
}
