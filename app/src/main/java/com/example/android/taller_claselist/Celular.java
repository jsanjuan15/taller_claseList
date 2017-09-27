package com.example.android.taller_claselist;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {
    private String precio;
    private String capacidad;
    private String color;
    private String marca;
    private String sistema;

    public Celular(String precio, String capacidad, String color, String marca, String sistema) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.color = color;
        this.marca = marca;
        this.sistema = sistema;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
}
