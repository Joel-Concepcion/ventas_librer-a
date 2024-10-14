package com.BackendSolution.Backend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Clientes {
    @Id
    private int id_cliente;
    private String nombre_cliente;
    private String  telefono_cliente;
    private String email_cliente;

    public Clientes(){}

    public Clientes(String nombre_cliente, String  telefono_cliente, String email_cliente){
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
        this.email_cliente = email_cliente;

    }
}
