package com.fiap.assistencia_tecnica.resources.repository.entity;

import com.fiap.assistencia_tecnica.core.domain.Usuario;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "USUARIO")
@Data
@Entity
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String usuario;

    @Column
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //Constroi uma nova entidade a partir de um usuario
    public UsuarioEntity(Usuario usuario){
        this.usuario = usuario.getUsuario();
        this.senha = usuario.getSenha();
    }
}
