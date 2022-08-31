/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Usuario
 */
public class Clase_Padre {a
     / /Buenashacer la clase principal abstracta
    private String cedula;
    private String nombre;
    private String Apellido;
    private int edad;
    
    public Persona() {
    }
    public Persona(String cedula, String nombre, String Apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  

    public String mostrarDatos() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + '}';
    }
}
