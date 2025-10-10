package com.gpantaJoyeria.JoyeriaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.gpantaJoyeria.JoyeriaApi.model.DetalleVenta;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{
    List<DetalleVenta> findByVentaIdVenta(Long idVenta);
}
