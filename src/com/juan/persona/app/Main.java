package com.juan.persona.app;
import com.juan.persona.dominio.Profesor;
public class Main {
    public static void main(String[] args) {
        Profesor alejandro = new Profesor("Alejandro Matrín", "12031",36);
        Profesor saul = null;
        saul = alejandro;
        System.out.println("Jueves de "+alejandro.nombre+alejandro.cedula+alejandro.edad);
        System.out.println("Jueves de "+saul.nombre+saul.cedula+saul.edad);
        saul = new Profesor("Saul","123",31);
        System.out.println("Jueves de "+saul.nombre+saul.cedula+saul.edad);


    }
}