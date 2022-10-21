package main;

import entity.Persona;
import registro.Registrable;
import registro.impl.RegistroVacunaProxy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, 6, 5);

        Persona persona = new Persona("Tomi", "Nuñez", "41.000.111", "Coctel", date);

        Registrable registro = new RegistroVacunaProxy();
        registro.registrar(persona.datos());

    }

}
