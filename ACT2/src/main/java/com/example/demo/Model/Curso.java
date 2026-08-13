package com.example.demo.Model;

public class Curso {
    private Long id;
    private String nombre;
    private int horas;
    
public Curso(Long id, String nombre, int horas) {
    this.id = id;
    this.nombre = nombre;
    this.horas = horas;
}

public Long getId() { 
    return id; }

public String getNombre() { 
    return nombre; }

public int getHoras() { 
    return horas; }
}