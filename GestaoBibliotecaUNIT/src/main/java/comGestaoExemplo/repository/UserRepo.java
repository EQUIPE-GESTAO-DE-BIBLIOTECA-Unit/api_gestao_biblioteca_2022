package comGestaoExemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comGestaoExemplo.model.user;

public interface UserRepo extends JpaRepository<user, Long> {
    
}
