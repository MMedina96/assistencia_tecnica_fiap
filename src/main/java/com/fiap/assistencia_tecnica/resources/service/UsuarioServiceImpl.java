package com.fiap.assistencia_tecnica.resources.service;

import com.fiap.assistencia_tecnica.core.domain.Usuario;
import com.fiap.assistencia_tecnica.core.service.UsuarioService;
import com.fiap.assistencia_tecnica.resources.repository.UsuarioRepository;
import com.fiap.assistencia_tecnica.resources.repository.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario criarUsuario(Usuario usuario) {

//        UsuarioEntity entity = new UsuarioEntity();
//        entity.setUsuario(usuario.getUsuario());
//        entity.setSenha(usuario.getSenha());
//
//        UsuarioEntity newEntity = usuarioRepository.save(entity);
//
//        Usuario newUsuario = new Usuario();
//        newUsuario.setUsuario(newEntity.getUsuario());
//        newUsuario.setSenha(newEntity.getSenha());


        return new Usuario
                (usuarioRepository.save
                        (new UsuarioEntity(usuario)));
    }
}
