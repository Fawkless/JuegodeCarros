package com.sofka.cargame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jugador {
    private final String idJugador;
    private String email;
    private List<Integer> puntos;
    private  final String username;

    public Jugador(String idJugador, String email, String username) {
        this.idJugador = idJugador;
        this.email = email;
        this.username = username;
        this.puntos= new ArrayList<>();
    }

    public void setEmail (String email) {
        this.email =email;
    }

    public void agregarPuntos (Integer punto) {
        this.puntos.add(punto);
    }

    public int puntos() {
        return puntos.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador='" + idJugador + '\'' +
                ", email='" + email + '\'' +
                ", puntos=" + puntos +
                ", username='" + username + '\'' +
                '}';
    }
}


