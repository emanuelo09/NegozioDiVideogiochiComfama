package com.example.negoziodivideogiochi.servicios;

import com.example.negoziodivideogiochi.entidades.Producto;
import com.example.negoziodivideogiochi.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioProducto implements ServicioComun<Producto> {

     @Autowired
    ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> buscarTodos() {
        return null;
    }

    @Override
    public Producto buscarPorId(Integer id) {

        try{

            Optional<Producto> producto = productoRepositorio.findById(id);
            return producto.get();

        }catch (Exception error){

            return null;
            //throw new Exception(error.getMessage());

        }

    }

    @Override
    public Producto agregar(Producto datos) {
        return null;
    }
}
