package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Empleado;
import co.edu.uniquindio.biblioteca.model.Libro;
import co.edu.uniquindio.biblioteca.model.Cliente;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = inicializarDatos();


        int opcion = 0;
        do {
            mostrarMenu();
            opcion = leerEntero("Ingrese la opción del menú");
            switch (opcion) {
                case 1:
                    String resultadoCliente = crearCliente(biblioteca);
                    System.out.println("Información del cliente: "+resultadoCliente);
                    break;
                case 2:
                    Cliente cliente = obtenerCliente(biblioteca);
                    int edad = leerEntero("Ingrese la edad del cliente a validar");
                    String resultadoValidacion = validarEdadCliente(cliente, edad);
                    System.out.println("Resultado de la operación: "+resultadoValidacion);
                    break;
                case 3:
                    String resultadoLibro = elegirLibro(biblioteca);
                    System.out.println("Información del Libro: "+resultadoLibro);
                    break;
                case 4:
                    Libro libro = obtenerLibro(biblioteca);
                    String nombre= leerStringConsola("Ingrese el nombre del libro a validar: ");
                    String resultadoValidacionNombre = validarNombreLibro(libro, nombre);
                    System.out.println("Resultado de la operación: "+resultadoValidacionNombre);
                    break;

                default:
                    break;
            }
        } while (opcion != 5);
    }

    private static String validarNombreLibro(Libro libro, String nombre) {
        if(libro != null){

            if(libro.getNombre().equals(nombre)) {
                return "El nombre del libro es valido";
            }else{
                return "El nombre del libro no es valido";
            }
        }else{
            return "No se puede validar, el libro no existe";
        }
    }

    private static Libro obtenerLibro(Biblioteca biblioteca) {
        String codigoLibro = leerStringConsola("Ingrese el codigo del libro a validar");
        Libro libroEncontrado = null;
        for (int i = 0; i < biblioteca.getListaLibros().size(); i++) {
            if (biblioteca.getListaLibros().get(i).getCodigo().equals(codigoLibro)) {
                libroEncontrado = biblioteca.getListaLibros().get(i);
                break;
            }
        }
        return libroEncontrado;
    }

    private static String validarEdadCliente(Cliente cliente, int edad) {
        if(cliente != null){

            if(cliente.getEdad() == edad) {
                return "La edad del cliente es valida";
            }else{
                return "La edad del cliente no es valida";
            }
        }else{
            return "No se puede validar, el cliente no existe";
        }
    }

    private static Cliente obtenerCliente(Biblioteca biblioteca) {
        String idCliente = leerStringConsola("Ingrese el id del cliente a buscar");
        Cliente clienteEncontrado = null;
        for(int i=0; i<biblioteca.getListaClientes().size();i++){
            if(biblioteca.getListaClientes().get(i).getId().equals(idCliente)){
                clienteEncontrado = biblioteca.getListaClientes().get(i);
                break;
            }
        }

        return clienteEncontrado;
    }

    private static Biblioteca inicializarDatos() {

        Biblioteca biblioteca = new Biblioteca("UQ");

        Cliente cliente = new Cliente();

        cliente.setNombre("Juan");
        cliente.setApellido("lopez");
        cliente.setId("1098");
        cliente.setTelefono("12222");
        cliente.setEdad(30);
        biblioteca.getListaClientes().add(cliente);

        return biblioteca;
    }







    public static String crearCliente(Biblioteca biblioteca) {
        String nombreCliente = leerStringConsola("Ingrese nombre del cliente");
        String apellidoCliente = leerStringConsola("Ingrese apellido del cliente");
        String idCliente = leerStringConsola("Ingrese el id del cliente");
        int edadCliente = leerEntero("ingrese edad del cliente");
        String telefonoCliente = leerStringConsola("Ingrese el telefono del cliente");

        Cliente cliente= new Cliente();
        cliente.setNombre(nombreCliente);
        cliente.setApellido(apellidoCliente);
        cliente.setId(idCliente);
        cliente.setEdad(edadCliente);
        cliente.setTelefono(telefonoCliente);
        biblioteca.getListaClientes().add(cliente);
        return cliente.toString();
    }

    public static String crearEmpleado(){
        String nombreEmpleado = leerStringConsola("Ingrese el nombre del empleado");
        String apellidoEmpleado = leerStringConsola("Ingrese el apellido del empleado");
        String idEmpleado = leerStringConsola("Ingrese el id del empleado");
        int edadEmpleado = leerEntero("Ingrese edad del empleado");
        String telefonoEmpleado = leerStringConsola("Ingrese el telefono del empleado");

        Empleado empleado= new Empleado(nombreEmpleado, apellidoEmpleado, idEmpleado, edadEmpleado, telefonoEmpleado);
        empleado.setNombre(nombreEmpleado);
        empleado.setApellido(apellidoEmpleado);
        empleado.setId(idEmpleado);
        empleado.setEdad(edadEmpleado);
        empleado.setTelefono(telefonoEmpleado);
        return empleado.toString();
    }

    public static String elegirLibro(Biblioteca biblioteca) {
        String nombreLibro = leerStringConsola("Ingrese el nombre del libro");
        String codigoLibro = leerStringConsola("Ingrese el codigo del libro");
        String autorLibro = leerStringConsola("Ingrese el autor del libro");
        String generoLibro = leerStringConsola("Ingrese el genero del libro");
        String idiomaLibro = leerStringConsola("Ingrese el idioma del libro");

        Libro libro= new Libro();
        libro.setNombre(nombreLibro);
        libro.setCodigo(codigoLibro);
        libro.setAutor(autorLibro);
        libro.setGenero(generoLibro);
        libro.setIdioma(idiomaLibro);
        biblioteca.getListaLibros().add(libro);
        return libro.toString();

    }









    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }
    public static void mostrarMenu() {
        System.out.println("1 - Crear cliente");
        System.out.println("2 - Validar edad del cliente");
        System.out.println("3 - Elegir Libro");
        System.out.println("4 - Validar nombre del libro");
        System.out.println("5 - Crear empleado");
        System.out.println("6- Salir");
    }

}




