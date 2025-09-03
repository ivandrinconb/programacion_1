package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String nombre;
    private String codigo;
    private String autor;
    private String genero;
    private String idioma;

    public Libro(){

    }

    public Libro(String nombre, String codigo, String autor, String genero, String idioma){
        this.nombre=nombre;
        this.codigo=codigo;
        this.autor=autor;
        this.genero=genero;
        this.idioma=idioma;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getIdioma(){
        return this.idioma;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", Codigo='" + codigo + '\'' +
                ", Autor=" + autor+
                ", genero='" + genero + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
