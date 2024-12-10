package com.fiap.assistencia_tecnica.core.domain;

import com.fiap.assistencia_tecnica.entrypoint.dto.UsuarioRequestDto;
import com.fiap.assistencia_tecnica.resources.repository.entity.UsuarioEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Usuario {
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario (UsuarioRequestDto request) {
        this.usuario = request.getUsuario();
        this.senha = request.getSenha();
    }


    //Constroi um usuario a partir de uma entidade
    public Usuario (UsuarioEntity usuarioEntity){
        this.usuario = usuarioEntity.getUsuario();
        this.senha = usuarioEntity.getSenha();
    }
}
