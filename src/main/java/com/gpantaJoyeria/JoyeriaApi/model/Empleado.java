package com.gpantaJoyeria.JoyeriaApi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private long id;

    @NotBlank
    @Column(length = 100)
    private String nombre;

    @NotBlank
    @Column(length = 100)
    private String apellido;

    @NotBlank
    @Column(length = 50)
    private String cargo;

    @NotBlank
    @Column(length = 50, unique = true)
    private String usuario;

    @NotBlank
    @Column(length = 255)
    private String contrasena;
}
