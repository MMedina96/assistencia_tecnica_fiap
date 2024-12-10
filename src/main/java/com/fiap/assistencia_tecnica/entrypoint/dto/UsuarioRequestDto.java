package com.fiap.assistencia_tecnica.entrypoint.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequestDto {

    @NotBlank
    @Size(min = 3, max = 20)
    private String usuario;

    @NotBlank
    @Size(min = 6, max = 20)
    private String senha;

    public @NotBlank @Size(min = 3, max = 20) String getUsuario() {
        return usuario;
    }

    public void setUsuario(@NotBlank @Size(min = 3, max = 20) String usuario) {
        this.usuario = usuario;
    }

    public @NotBlank @Size(min = 6, max = 20) String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank @Size(min = 6, max = 20) String senha) {
        this.senha = senha;
    }
}
