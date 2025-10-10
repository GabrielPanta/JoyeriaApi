package com.gpantaJoyeria.JoyeriaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpantaJoyeria.JoyeriaApi.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
     Empleado findByUsuario(String usuario);
}
