package com.gpantaJoyeria.JoyeriaApi.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

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
