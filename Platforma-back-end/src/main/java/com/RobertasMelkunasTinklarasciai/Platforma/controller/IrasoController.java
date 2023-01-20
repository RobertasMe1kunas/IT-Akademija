package com.RobertasMelkunasTinklarasciai.Platforma.controller;

import com.RobertasMelkunasTinklarasciai.Platforma.model.Irasas;
import com.RobertasMelkunasTinklarasciai.Platforma.repository.IrasoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class IrasoController {


    @Autowired
    private IrasoRepository irasoRepository;

    @PostMapping("/irasas")
    public Irasas newIrasas(@RequestBody Irasas newIrasas) {
        return irasoRepository.save(newIrasas);
    }

    @GetMapping("/irasai")
    public List<Irasas> getAllIrasai() {
        return irasoRepository.findAll();
    }

    /*@DeleteMapping("/irasas/{id}")
    String deleteUser(@PathVariable Long id){
        if(!IrasoRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        IrasoRepository.deleteById(id);
        return "User with id " + id + " has been deleted success.";
    }*/
}
   /* @GetMapping("/irasas/{id}")
    public Irasas getIrasasById(@PathVariable Long id){
        return irasoRepository.findById(id)
                .orElseThrow(()->new IrasasNotFoundException(id));
    }

    }
*/