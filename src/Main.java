import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> lstPersona = new ArrayList<>();

    Estudiante estudiante1 = new Estudiante("pepe","calle 11","ingenieria",5);
    Estudiante estudiante2 = new Estudiante("luis","calle 12","derecho",4);
    Estudiante estudiante3 = new Estudiante("lina","calle 13","medicina",3);

    Profesor profesor1 = new Profesor("juan","carrera 5","docente","T,I");
    Profesor profesor2 = new Profesor("maria","carrera 4","docente","T,I");
    Profesor profesor3 = new Profesor("andres","carrera 6","docente","T,I");

    lstPersona.add(estudiante1);
        lstPersona.add(estudiante2);
        lstPersona.add(estudiante3);
        lstPersona.add(profesor1);
        lstPersona.add(profesor2);
        lstPersona.add(profesor3);
        System.out.println(lstPersona);

        for(Persona p: lstPersona){
            System.out.println(p);
        }
    }
}