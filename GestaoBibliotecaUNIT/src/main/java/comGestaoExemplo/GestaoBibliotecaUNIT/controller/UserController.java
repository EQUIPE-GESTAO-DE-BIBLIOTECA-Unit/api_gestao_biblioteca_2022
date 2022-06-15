package comGestaoExemplo.GestaoBibliotecaUNIT.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comGestaoExemplo.model.user;
import comGestaoExemplo.repository.UserRepo;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping 
    public List<user> findAll(){
        return userRepo.findAll();
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario novoUsuario){
        return userRepo.save(novoUsuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuarioAtualizar){
        return userRepo.save(usuarioAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Usuario usuarioDeletar){
        userRepo.delete(usuarioDeletar);
        return "usuário deletado com sucesso!";
    }
}
