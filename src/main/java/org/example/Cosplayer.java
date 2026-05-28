package org.example;

public class Cosplayer extends Persona implements Interactivable {
    private int cantidadTrajes;
    private EstiloCosplay estiloPreferido;

    public Cosplayer(String nombre, String paisOrigen, int edad, int cantidadTrajes, EstiloCosplay estiloPreferido) {
        super(nombre, paisOrigen, edad);
        this.cantidadTrajes = cantidadTrajes;
        this.estiloPreferido = estiloPreferido;
    }

    @Override
    public void mostrarInformacion() {
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Cosplayer)
        System.out.println("Nombre: "+nombre);
        System.out.println("Pais de Origen: "+paisOrigen);
        System.out.println("Edad: "+edad);
        System.out.println("Cantidad de Trajes: "+cantidadTrajes);
        System.out.println("Estilo Preferido: "+estiloPreferido);
    }

    @Override
    public void realizarPresentacion() {
        // TODO: Completar lógica método (simular presentación e imprimir tiempo estimado de preparación)
        System.out.println("El cosplayer esta preparando su traje de estilo: "+estiloPreferido);
        if (cantidadTrajes >= 5) {
            System.out.println("Tiempo estimado de preparacion: 2 horas (Complejidad Alta)");
        } else if (cantidadTrajes >= 3 && cantidadTrajes < 5) {
            System.out.println("Tiempo estimado de preparacion: 45 minutos (Complejidad Media)");
        } else {
            System.out.println("Tiempo estimado de preparacion: 25 minutos (Complejidada Baja)");
        }
    }

    // Getters y Setters
    public int getCantidadTrajes() { return cantidadTrajes; }
    public void setCantidadTrajes(int cantidadTrajes) { this.cantidadTrajes = cantidadTrajes; }
    public EstiloCosplay getEstiloPreferido() { return estiloPreferido; }
    public void setEstiloPreferido(EstiloCosplay estiloPreferido) { this.estiloPreferido = estiloPreferido; }
}
