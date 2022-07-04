package TA15;

public interface Crud {

    public void create(String nombres, String apellidos, int dni, String fechaNacimiento, int codigo);

    public Alumno[] listar();
    public Integer update(Integer dni);
    public Integer delete(Integer dni);
}
