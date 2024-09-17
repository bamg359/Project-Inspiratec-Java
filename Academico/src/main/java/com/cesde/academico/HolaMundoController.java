package com.cesde.academico;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("HolaMundo")
@RequestMapping("/hola_mundo")
public class HolaMundoController {

    @GetMapping
    public String imprimirHolaMundo(){

        return "Hola Mundo";

    }

}
