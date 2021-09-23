package com.meli.desafiospringveterinaria.controller;

import com.meli.desafiospringveterinaria.persistence.Persistivel;
import com.meli.desafiospringveterinaria.services.DAOmedico;
import com.meli.desafiospringveterinaria.services.DAOproprietarioAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proprietario")
public class ProprietarioController   {

   // @Autowired
   // private DAOproprietarioAnimal daOproprietarioAnimal;


   @GetMapping("/consulta")
    public String obter() {

        return "teste";
        //return daOproprietarioAnimal.obeter();

    }


   @PostMapping("/cadastrar")
    public boolean cadastrarProprietario(ProprietarioController proprietarioController) {
     return  true;
    }
    

    @PutMapping("/editar")
    public void atualizarProprietario() {

       // daOproprietarioAnimal.editar();


    }
}
