package co.edu.uniquindio.biblioteca.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private int edad;
    private String telefono;


    public Cliente(){

}
    public Cliente(String nombre, String apellido, String id, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return this.apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getId() {

        return this.id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public int getEdad() {

        return this.edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }

    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

