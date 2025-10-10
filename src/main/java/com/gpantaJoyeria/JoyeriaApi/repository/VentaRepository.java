package com.gpantaJoyeria.JoyeriaApi.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.gpantaJoyeria.JoyeriaApi.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    List<Venta> findByFecha(LocalDate fecha);
    List<Venta> findByClienteIdCliente(Long idCliente);
}
