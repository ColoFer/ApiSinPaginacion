package com.example.Api.Sin.Paginacion.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Domicilio extends Base{

    @NotNull
    @Column(name = "calle")
    private String calle;

    @NotNull
    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)//localidad no puede ser nula a la hora de crear un domicilio
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
