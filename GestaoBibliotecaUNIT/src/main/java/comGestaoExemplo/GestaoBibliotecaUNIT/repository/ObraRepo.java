package comGestaoExemplo.GestaoBibliotecaUNIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comGestaoExemplo.GestaoBibliotecaUNIT.model.Obra;

public interface ObraRepo extends JpaRepository<Obra, Long> {
    
}
