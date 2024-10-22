package com.biblioteca.mantener;

public class General {
    private int codigo;
    private String nombre;

    public General() {

    }

    public General(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean validarDatos() {
        return true;
    }

    public String toString() {
        return "General {" + " Codigo = "  + codigo + " Nombre = " + nombre + "}";
    }
}
