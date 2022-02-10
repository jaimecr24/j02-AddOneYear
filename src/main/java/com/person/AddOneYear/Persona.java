package com.person.AddOneYear;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Persona {
    private String nombre, poblacion;
    private int edad;
}
