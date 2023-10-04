package com.example.Api.Sin.Paginacion.services;

import com.example.Api.Sin.Paginacion.entities.Libro;
import com.example.Api.Sin.Paginacion.repositories.BaseRepository;
import com.example.Api.Sin.Paginacion.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    protected LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository= libroRepository;
    }
}
