package TA15;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {

    private int cod;
    public Alumno(String nombres, String apellidos, int dni, String fechaNacimiento, int cod) {
        super(nombres, apellidos, dni, fechaNacimiento);
        this.cod = cod;
    }
    public int getCod() {
        return cod;
    }

    @Override
    public long calcularEdad() {

        LocalDate fHoy= LocalDate.now();
        LocalDate cumple= LocalDate.of(2000, Month.SEPTEMBER, 17);
        long edad = ChronoUnit.YEARS.between(cumple, fHoy);
        System.out.println("Edad: "+edad);
        return edad;
    }
}
