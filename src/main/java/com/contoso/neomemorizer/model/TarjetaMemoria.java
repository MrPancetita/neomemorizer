package com.contoso.neomemorizer.model;

public class TarjetaMemoria {
    private int id; 
    private int numero; 
    private String palabra; 
    private String imagen; 

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId () {
        return id;
    }
}
