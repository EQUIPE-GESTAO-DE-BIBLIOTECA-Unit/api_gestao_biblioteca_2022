package comGestaoExemplo.GestaoBibliotecaUNIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comGestaoExemplo.GestaoBibliotecaUNIT.model.Usuario;

public interface UserRepo extends JpaRepository<Usuario, Long> {
    
}
