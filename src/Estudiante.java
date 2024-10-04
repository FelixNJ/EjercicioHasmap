public class Estudiante extends Persona{
    private String carrera;
    private int semestre;

    public Estudiante() {
    }

    public Estudiante(String direccion, String nombre, String carrera, int semestre) {
        super(direccion, nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                ", nombre='" + getNombre() + '\'' +
                "direccion='" + getDireccion()+ '\'' +
                "carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}
