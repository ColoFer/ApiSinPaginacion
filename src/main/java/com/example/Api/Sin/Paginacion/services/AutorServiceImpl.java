package com.example.Api.Sin.Paginacion.services;

import com.example.Api.Sin.Paginacion.entities.Autor;
import com.example.Api.Sin.Paginacion.repositories.AutorRepository;
import com.example.Api.Sin.Paginacion.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    protected AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}

