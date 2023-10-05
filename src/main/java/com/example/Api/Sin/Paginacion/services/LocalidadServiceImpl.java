package com.example.Api.Sin.Paginacion.services;

import com.example.Api.Sin.Paginacion.entities.Localidad;
import com.example.Api.Sin.Paginacion.repositories.BaseRepository;
import com.example.Api.Sin.Paginacion.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository,LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository=localidadRepository;
    }
}
