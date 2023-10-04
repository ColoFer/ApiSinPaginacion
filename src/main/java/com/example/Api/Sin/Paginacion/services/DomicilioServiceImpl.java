package com.example.Api.Sin.Paginacion.services;

import com.example.Api.Sin.Paginacion.entities.Domicilio;
import com.example.Api.Sin.Paginacion.repositories.BaseRepository;
import com.example.Api.Sin.Paginacion.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{

    @Autowired
    protected DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
