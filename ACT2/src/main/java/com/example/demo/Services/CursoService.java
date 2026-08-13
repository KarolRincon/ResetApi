package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Curso;

@Service
public class CursoService {

    public List<Curso> listar() {
        return List.of(
            new Curso(1L, "Programacion IV", 64),
            new Curso(2L, "Spring MVC", 32)
        );
    }
}