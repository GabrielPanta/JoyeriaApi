package com.gpantaJoyeria.JoyeriaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gpantaJoyeria.JoyeriaApi.model.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
Proveedor findByRuc(String ruc);
}
