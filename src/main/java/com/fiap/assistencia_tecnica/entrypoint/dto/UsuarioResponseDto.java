package com.fiap.assistencia_tecnica.entrypoint.dto;

import com.fiap.assistencia_tecnica.core.domain.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDto {
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

    public UsuarioResponseDto(Usuario usuario){
        this.senha = usuario.getSenha();
        this.usuario = usuario.getUsuario();
    }
}
