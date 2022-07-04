package TA15;

public abstract class Persona {

    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected String fechaNacimiento;


    public Persona(String nombres, String apellidos, int dni, String fechaNacimiento) {
        this.nombres = nombres;
        this.dni = dni;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }
    public int getDni() {
        return dni;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public abstract long calcularEdad();

}
