package comGestaoExemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comGestaoExemplo.model.Usuario;

public interface UserRepo extends JpaRepository<Usuario, Long> {
    
}
