package comGestaoExemplo.GestaoBibliotecaUNIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comGestaoExemplo.GestaoBibliotecaUNIT.repository.ObraRepo;
import comGestaoExemplo.GestaoBibliotecaUNIT.model.Obra;

@RestController
@RequestMapping(value="/obras")
public class ObraController {
    @Autowired
    private ObraRepo obraRepo;

    @GetMapping
    public List<Obra> findAll(){
        return obraRepo.findAll();
    }

    @PostMapping
    public Obra save(@RequestBody Obra novaObra){
        return obraRepo.save(novaObra);
    }
}
