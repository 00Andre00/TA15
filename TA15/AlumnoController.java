package TA15;

public class AlumnoController implements Crud{

    private Alumno[] alumno;
    private int contador;

    public AlumnoController(int size) {
        this.alumno = new Alumno[size];
        this.contador = 0;
    }
    public void create(String nombres, String apellidos, int dni, String fechaNacimiento, int cod) {
        this.alumno[this.contador] = new Alumno(nombres, apellidos, dni, fechaNacimiento, cod);
        this.contador++;
    }
    public Alumno[] listar() {
        return this.alumno;
    }
    public Integer update(Integer dni) {
        return 0;
    }
    public Integer delete(Integer dni) {
        return 0;
    }
}
