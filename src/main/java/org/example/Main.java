package org.example;


public class Main {
    public static void main(String[] args) {
        // 1. Instancias de objetos
        // Deben de cambiar estos objetos, creen los propios suyos, estos estan de referencia.

        Categoria animeCat = new Categoria("Manga y Anime", 50, 9.5);
        Categoria arteCat = new Categoria("Ilustración Digital", 30, 8.0);

        Cosplayer cosplayer1 = new Cosplayer("Luis", "Chile", 20, 5, EstiloCosplay.ANIME);
        Artista artista1 = new Artista("Camila", "México", 22, "Wacom Intuos", 3);

        Agrupacion comunidadAnime = new Agrupacion("Team Otaku UFRO", animeCat);
        Panel panelPrincipal = new Panel(animeCat, "15:30 hrs");

        // --- SECCIÓN DE PRUEBAS ---
        // Ej: agregar personas a categorías, meter miembros a la agrupación, montar el panel y llamar a mostrarInformacion().

        cosplayer1.agregarCategoria(animeCat);
        artista1.agregarCategoria(arteCat);

        comunidadAnime.agregarMiembro(cosplayer1);

        panelPrincipal.agregarPanelista(cosplayer1);
        panelPrincipal.agregarPanelista(comunidadAnime);

        System.out.println("----INFORMACION PANEL----");
        panelPrincipal.mostrarInformacion();
        System.out.println("\n----INFORMACION COSPLAYER----");
        cosplayer1.mostrarInformacion();
        System.out.println("\n----INFORAMCION ARTISTA----");
        artista1.mostrarInformacion();
        System.out.println("\n----INFORMACION AGRUPACION----");
        comunidadAnime.mostrarInformacion();

        System.out.println("\n----PRESENTACION COSPLAY----");
        cosplayer1.realizarPresentacion();
        System.out.println("\n----PRESENTACION ARTISTA----");
        artista1.realizarPresentacion();
    }
}