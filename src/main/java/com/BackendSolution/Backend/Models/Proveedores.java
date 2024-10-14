package com.BackendSolution.Backend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Proveedores {
    @Id
    private int id_proveedor;
    private String nombre_proveedor;
    private int telefono_proveedor;
    private String direccion_proveedor;

    public Proveedores(){}
    public Proveedores(String nombre_proveedor, int telefono_proveedor, String direccion_proveedor){
        
        this.nombre_proveedor = nombre_proveedor;
        this.telefono_proveedor = telefono_proveedor;
        this.direccion_proveedor = direccion_proveedor;
    }  
}
