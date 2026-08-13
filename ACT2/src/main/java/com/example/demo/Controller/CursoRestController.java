package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Curso;
import com.example.demo.Services.CursoService;

@RestController
@RequestMapping("/api")

public class CursoRestController {
    private final CursoService cursoService;
    public CursoRestController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
 
@GetMapping("/saludo")

public String saludo() {
    return "Proyecto Spring funcionando";
}

@GetMapping("/cursos")
public List<Curso> cursos() {
    return cursoService.listar();
}
}
