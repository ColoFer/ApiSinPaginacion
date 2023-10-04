package com.example.Api.Sin.Paginacion.controllers;

import com.example.Api.Sin.Paginacion.entities.Autor;
import com.example.Api.Sin.Paginacion.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")

public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
