package br.com.rsimplicio.api.usuarios_pettech.repository;

import br.com.rsimplicio.api.usuarios_pettech.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
