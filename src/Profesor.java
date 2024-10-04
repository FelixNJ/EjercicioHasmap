public class Profesor extends Persona{
    private String departamento;
    private String categoria;

    public Profesor() {
    }

    public Profesor(String direccion, String nombre, String categoria, String departamento) {
        super(direccion, nombre);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +//esto sirve cuando el atributo esta protected
                "direccion='" + direccion+ '\'' +
                "categoria='" + categoria + '\'' +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
