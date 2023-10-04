package com.example.Api.Sin.Paginacion.services;

import com.example.Api.Sin.Paginacion.entities.Persona;
import com.example.Api.Sin.Paginacion.repositories.BaseRepository;
import com.example.Api.Sin.Paginacion.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    protected PersonaRepository personaRepository;

    public PersonaServiceImpl (BaseRepository<Persona,Long> baseRepository,PersonaRepository personaRepository){
        super(baseRepository);
        this.personaRepository=personaRepository;
    }
}
