package com.BackendSolution.Backend.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Libros {
    @Id
    private int id_libro;
    private String titulo;
    private String autor;
    private float precio;
    private int stock;

    public Libros(){}

    public Libros(String titulo, String autor, float precio, int stock){

        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }
}
