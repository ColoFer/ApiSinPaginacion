package com.example.Api.Sin.Paginacion.controllers;

import com.example.Api.Sin.Paginacion.entities.Localidad;
import com.example.Api.Sin.Paginacion.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")

public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
