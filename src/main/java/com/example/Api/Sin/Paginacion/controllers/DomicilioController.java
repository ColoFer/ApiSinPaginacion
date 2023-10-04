package com.example.Api.Sin.Paginacion.controllers;


import com.example.Api.Sin.Paginacion.entities.Domicilio;
import com.example.Api.Sin.Paginacion.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")

public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
