package com.LuisPalencia.flowers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlowersController {
@GetMapping("/flores")
    public String paginaFlores() {
        // Spring buscará un archivo llamado "flores.html" en src/main/resources/templates
        return "flores"; 
    }
}
