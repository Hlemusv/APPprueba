package edu.co.upb.appprueba.util;

import android.app.Application;

public class Datos  extends Application {
    private String nombre;
    private String apellido;
    private String Correo;
    private String contraseña;

    // esto no se copia sino que se genera dando click der al nombre del string- refactor-Encapsulate field
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

