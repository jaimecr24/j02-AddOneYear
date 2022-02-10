package com.person.AddOneYear;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @GetMapping("/user/{name}")
    public String greeting(@PathVariable String name) {
        return "Hola "+name;
    }

    @PostMapping("/useradd")
    public Persona addPerson(@RequestBody Persona newPerson){
        return new Persona(newPerson.getNombre(), newPerson.getPoblacion(), newPerson.getEdad()+1);
    }
}
