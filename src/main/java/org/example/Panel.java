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

    }

    public void eliminarPanelista(Object panelista) {
        // TODO: Completar lógica método
        panelistas.remove(panelista);
    }

    public void mostrarInformacion() {
        // TODO: Completar lógica método (mostrar hora, tema/categoría y quiénes exponen)
    }

    // Getters y Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public List<Object> getPanelistas() { return panelistas; }
    public String getHoraPresentacion() { return horaPresentacion; }
    public void setHoraPresentacion(String horaPresentacion) { this.horaPresentacion = horaPresentacion; }
}
