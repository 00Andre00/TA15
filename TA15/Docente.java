package TA15;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Docente extends Persona{

    private String grado;
    private  String titulo;
    public Docente(String nombres, String apellidos, int dni, String fechaNacimiento, String grado, String titulo) {
        super(nombres, apellidos, dni, fechaNacimiento);
        this.grado = grado;
        this.titulo = titulo;
    }
    public String getGrado() {
        return grado;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public long calcularEdad() {

        LocalDate fHoy= LocalDate.now();
        LocalDate cumple= LocalDate.of(1965, Month.MARCH, 17);
        long edad = ChronoUnit.YEARS.between(cumple, fHoy);
        System.out.println("Edad actual "+edad+" años");
        return edad;
    }
}
