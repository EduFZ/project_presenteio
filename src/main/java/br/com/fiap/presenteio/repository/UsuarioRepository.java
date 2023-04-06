package br.com.fiap.presenteio.repository;

import br.com.fiap.presenteio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
