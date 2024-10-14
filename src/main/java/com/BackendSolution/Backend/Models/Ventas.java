package com.BackendSolution.Backend.Models;

import jakarta.persistence.*;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter

public class Ventas {
    @Id
    private int id_venta;
    private int id_cliente;
    private Date fecha_venta;
    private float total;
 
    public Ventas(){}
 
    public Ventas(Date fecha_venta, float total){
         this.fecha_venta = fecha_venta;
         this.total = total;
 
    }
 
    public Ventas(int id_cliente, Date fecha_venta, float total){
         this.id_cliente = id_cliente;
         this.fecha_venta = fecha_venta;
         this.total = total;
 
    } 
}
