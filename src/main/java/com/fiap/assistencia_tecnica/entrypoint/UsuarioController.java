package com.fiap.assistencia_tecnica.entrypoint;

import com.fiap.assistencia_tecnica.core.business.UsuarioBusiness;
import com.fiap.assistencia_tecnica.core.domain.Usuario;
import com.fiap.assistencia_tecnica.entrypoint.dto.UsuarioRequestDto;
import com.fiap.assistencia_tecnica.entrypoint.dto.UsuarioResponseDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioBusiness usuarioBusiness;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponseDto cadastrarUsuario(@Valid @RequestBody UsuarioRequestDto request) {

        return new UsuarioResponseDto(
                usuarioBusiness.criarUsuario(
                        new Usuario(request)));

//        return new UsuarioResponseDto(
//                usuarioBusiness.criarUsuario(
//                        Usuario.builder()
//                                .usuario(request.getUsuario())
//                                .senha(request.getSenha())
//                                .build())
//        );


    }


}
