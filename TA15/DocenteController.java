package TA15;

public class DocenteController {

    private Docente docente[];
    private int contador;

    public DocenteController(int size) {
        this.docente = new Docente[size];
        this.contador = 0;
    }
    public void agregar(String nombres, String apellidos, int dni, String fechaNacimiento, String grado, String titulo){
        this.docente[this.contador] = new Docente(nombres, apellidos, dni, fechaNacimiento, grado, titulo);
        this.contador++;
    }
    public Docente[] mostrar(){
        return this.docente;
    }

}
