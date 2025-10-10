package com.gpantaJoyeria.JoyeriaApi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private long id;

    @NotBlank
    @Column(length = 150)
    private String nombre_empresa;

    @NotBlank
    @Column(length = 20, unique = true)
    private String ruc;

    @NotBlank
    @Column(length = 20)
    private String telefono;

    @NotBlank
    @Column(length = 100)
    private String correo;

    @NotBlank
    @Column(length = 200)
    private String direccion;
    
}
