package com.musicPlayer.models;

public class Favoritos {
    public void adicion(Audio audioMain){
        if (audioMain.getClasificacion() >= 8) {
            System.out.println(audioMain.getTitulo() + " :Es el hit del momento");
        }else {
            System.out.println(audioMain.getTitulo() + " :Favorita de la comunidad ");
        }
    }
}
