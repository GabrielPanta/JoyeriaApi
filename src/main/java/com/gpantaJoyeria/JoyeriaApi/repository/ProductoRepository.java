package com.gpantaJoyeria.JoyeriaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.gpantaJoyeria.JoyeriaApi.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    List<Producto> findByTipo(String tipo);
    List<Producto> findByMaterial(String material);
}
