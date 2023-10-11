package com.example.Api.Sin.Paginacion.services;

import com.example.Api.Sin.Paginacion.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base,ID extends Serializable> {
    public List<E> findAll() throws Exception;
    //lista de todas las personas que estan en la bd
    public Page<E> findAll(Pageable pageable) throws  Exception;
    //devuelve un page sublista con los datos
    public E findById(ID id) throws  Exception;
    //extrae una entidad de acuerdo a un id que le pasemos.
    public E save(E entity) throws  Exception;
    //crea una nueva entidad y para eso le enviamos una entidad al repositorio
    public  E update(ID id, E entity) throws Exception;
    //recibe la entidad realizada y el id de la entidad que se quiere actualizar
    public boolean delete(ID id) throws Exception;
    //se encarga de eliminar los registros de la bd
}
