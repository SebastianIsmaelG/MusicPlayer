package com.musicPlayer.principal;

import com.musicPlayer.models.Cancion;
import com.musicPlayer.models.Favoritos;
import com.musicPlayer.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Forever");
        cancion1.setCantante("Kiss");

        Podcast podcast1 = new Podcast();
        podcast1.setPresentador("Jordi Wild");
        podcast1.setTitulo("Wild Proyect");

        Favoritos favoritos = new Favoritos();
        favoritos.adicion(podcast1);
        favoritos.adicion(cancion1);

        for (int i = 0; i <100 ; i++) {
            podcast1.megGusta();
        }
        for (int i = 0; i < 8000; i++) {
            podcast1.reproducir();
        }


        /**Datos*/
        for (int i = 0; i < 100 ; i++) {
            cancion1.megGusta();
        }

        for (int i = 0; i < 200 ; i++) {
            cancion1.reproducir();
        }

        /***Outputs****/
        System.out.println("Total de reproduciones: " +cancion1.getTotalDeReproducciones());
        System.out.println("Total de me Gusta: "+cancion1.getTotalDeMeGusta());


    }
}
