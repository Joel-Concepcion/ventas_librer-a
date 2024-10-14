package com.BackendSolution.Backend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Detalle_Venta {
    
    @Id
    private int id_detalle;
    private int id_venta;
    private int id_libro;
    private int cantidad;
    private float precio_unitario;
    private float subtotal;

    public Detalle_Venta(){}

    public Detalle_Venta(int id_venta, int id_libro, int cantidad, float precio_unitario, float subtotal){
        this.id_venta = id_venta;
        this.id_libro = id_libro;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }
    
}
