package com.fiap.assistencia_tecnica.core.business.impl;

import com.fiap.assistencia_tecnica.core.business.UsuarioBusiness;
import com.fiap.assistencia_tecnica.core.domain.Usuario;
import com.fiap.assistencia_tecnica.core.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioBusinessImpl implements UsuarioBusiness {
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public Usuario criarUsuario(Usuario usuario) {
        //Validar se usuario ja existe
        return usuarioService.criarUsuario(usuario);
    }
}
