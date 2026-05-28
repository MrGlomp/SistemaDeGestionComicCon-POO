package org.example;

import java.sql.SQLOutput;

public class Artista extends Persona implements Interactivable {
    private String marcaTableta;
    private int cantidadArtbooksPublicados;

    public Artista(String nombre, String paisOrigen, int edad, String marcaTableta, int cantidadArtbooksPublicados) {
        super(nombre, paisOrigen, edad);
        this.marcaTableta = marcaTableta;
        this.cantidadArtbooksPublicados = cantidadArtbooksPublicados;
    }

    @Override
    public void mostrarInformacion() {
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Artista)
        System.out.println("----INFORMACION ARTISTA----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Pais de Origen: "+paisOrigen);
        System.out.println("Edad: "+edad);
        System.out.println("Marca Tableta: "+marcaTableta);
        System.out.println("Cantidad Artbooks Publicados: "+cantidadArtbooksPublicados);
    }

    @Override
    public void realizarPresentacion() {
        // TODO: Completar lógica método (simular presentación, mostrar portafolio y artbooks)
    }

    // Getters y Setters
    public String getMarcaTableta() { return marcaTableta; }
    public void setMarcaTableta(String marcaTableta) { this.marcaTableta = marcaTableta; }
    public int getCantidadArtbooksPublicados() { return cantidadArtbooksPublicados; }
    public void setCantidadArtbooksPublicados(int cantidadArtbooksPublicados) { this.cantidadArtbooksPublicados = cantidadArtbooksPublicados; }
}
