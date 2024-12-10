package com.fiap.assistencia_tecnica.resources.repository;

import com.fiap.assistencia_tecnica.resources.repository.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
