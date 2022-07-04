package TA15;

public class Main {

    public static void main(String[] args){

        AlumnoController alumnoCo = new AlumnoController(1);

        alumnoCo.create("Renzo", "Panduro", 77777777,"17/05/2003", 2020160000);
        System.out.println("--Alumno--");

        for (Alumno d: alumnoCo.listar()) {
            System.out.println("Nombres y Apellidos: "+d.getNombres()+" "+d.getApellidos());
            System.out.println("Dni: "+d.getDni());
            System.out.println("Fecha de Nacimiento: "+d.getFechaNacimiento());
            d.calcularEdad();
            System.out.println("Codigo de alumno: "+d.getCod());
            System.out.println();
        }

        DocenteController docenteCo = new DocenteController(4);

        docenteCo.agregar("Roberto","Arriaga",777777778, "20/03/1985","Magister","Ingeniero");
        docenteCo.agregar("Luis","Aratea",8888888, "25/01/1980","Magister","Obstetra");
        docenteCo.agregar("Marco","Alvarez",5555677, "12/08/1999","Doctor","Ingeniero");
        docenteCo.agregar("Leonardo","Rodriguez",34536778, "25/12/2000","Licenciado","Licenciado");
        System.out.println("--Docentes--");
        for (Docente d: docenteCo.mostrar()) {

            System.out.println("Nombres y Apellidos: "+d.getNombres()+" "+d.getApellidos());
            System.out.println("Dni: "+d.getDni());
            System.out.println("Fecha de Nacimiento: "+d.getFechaNacimiento());
            d.calcularEdad();
            System.out.println("Grado: "+d.getGrado());
            System.out.println("Titulo: "+d.getTitulo());

            System.out.println();
        }
    }
}
