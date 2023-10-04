package com.example.Api.Sin.Paginacion.controllers;

import com.example.Api.Sin.Paginacion.entities.Persona;
import com.example.Api.Sin.Paginacion.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")

public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
