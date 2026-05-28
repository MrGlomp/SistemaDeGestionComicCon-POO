package org.example;

import java.util.ArrayList;
import java.util.List;

public class Panel {
    private Categoria categoria;
    private List<Object> panelistas; // Almacena tanto instancias individuales (Persona) como grupales (Agrupacion)
    private String horaPresentacion;

    public Panel(Categoria categoria, String horaPresentacion) {
        this.categoria = categoria;
        this.horaPresentacion = horaPresentacion;
        this.panelistas = new ArrayList<>();
    }

    public void agregarPanelista(Object panelista) {
        // TODO: Completar lógica método (debe validar si es instancia de Persona o Agrupacion antes de añadir)
        if (panelista instanceof Persona || panelista instanceof Agrupacion) {
            panelistas.add(panelista);
        } else {
            System.out.println("Error, ingrese un dato valido");
        }
    }

    public void eliminarPanelista(Object panelista) {
        // TODO: Completar lógica método
        panelistas.remove(panelista);
    }

    public void mostrarInformacion() {
        // TODO: Completar lógica método (mostrar hora, tema/categoría y quiénes exponen)
        System.out.println("Hora Presentacion: "+horaPresentacion);
        System.out.println("Categoria: "+categoria.getNombre());
        System.out.println("Quienes Presentan: ");
        for (Object panelista:panelistas) {
            if (panelista instanceof Persona) {
                Persona p = (Persona) panelista;
                System.out.println("Participante: "+p.getNombre());
            } else if (panelista instanceof Agrupacion) {
                Agrupacion a = (Agrupacion) panelista;
                System.out.println("Agrupacion: "+a.getNombreGrupo());
            }
        }
    }

    // Getters y Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public List<Object> getPanelistas() { return panelistas; }
    public String getHoraPresentacion() { return horaPresentacion; }
    public void setHoraPresentacion(String horaPresentacion) { this.horaPresentacion = horaPresentacion; }
}
