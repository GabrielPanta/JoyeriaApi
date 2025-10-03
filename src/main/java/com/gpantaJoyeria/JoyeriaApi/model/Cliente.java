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
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    @NotBlank
    @Column(length = 100)
    private String nombre;

    @NotBlank
    @Column(length = 100)
    private String apellido;

    @NotBlank
    @Column(unique = true,length = 15)
    private String dni;

    @NotBlank
    @Column(length = 20)
    private String telefono;

    @NotBlank
    @Column(unique = true,length = 100)
    private String correo;

    @NotBlank
    @Column(length = 200)
    private String direccion;
}
