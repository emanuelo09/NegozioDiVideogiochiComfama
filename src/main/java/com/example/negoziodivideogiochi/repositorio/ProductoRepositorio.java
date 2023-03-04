package com.example.negoziodivideogiochi.repositorio;

import com.example.negoziodivideogiochi.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
