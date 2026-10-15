package com.example.volcanes;

public class Volcan {
    private final String nombre;
    private final String ubicacion;
    private final String altura;
    private final String descripcion;
    private final int imagen;

    public Volcan(String nombre, String ubicacion, String altura, String descripcion, int imagen) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.altura = altura;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public String getAltura() { return altura; }
    public String getDescripcion() { return descripcion; }
    public int getImagen() { return imagen; }
}
