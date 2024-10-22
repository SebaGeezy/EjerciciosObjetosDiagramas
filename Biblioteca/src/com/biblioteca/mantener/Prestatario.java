package com.biblioteca.mantener;

public class Prestatario extends General {
    private String telefono;
    private String direccion;
    private String ruc;
    private Ciudad ciudad;

    public Prestatario() {

    }

    public Prestatario(String telefono, String direccion, String ruc, Ciudad ciudad) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.ruc = ruc;
        this.ciudad = ciudad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String toString() {
        return "Prestatario {" + super.toString() + " Telefono = "  + telefono +
         " Direccion = " + direccion + " Ruc = " + ruc + "}";
    }
}