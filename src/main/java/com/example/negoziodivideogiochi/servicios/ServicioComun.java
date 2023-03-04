package com.example.negoziodivideogiochi.servicios;

import java.util.List;

public interface ServicioComun<E> {

    public List<E> buscarTodos();
    public E buscarPorId(Integer id);
    public E agregar(E datos);

//LastKey
}
