package com.sofka.cargame.domain;

public class Aplicacion {

    public static void main(String[] args) {
        int numCarriles =3;
        int kilometros=5;
        Juego juego = new Juego(numCarriles,kilometros,"Pista#Los Andes");

        Carro rojo=new Carro(Carro.Color.ROJO, "16");
        rojo.agregarConductor(new Conductor("C1","Charles", "charles@gmail.com", "LECLERC"));
        Carro azul=new Carro(Carro.Color.AZUL, "1");
        azul.agregarConductor(new Conductor("C2","Max", "max@gmail.com", "VERSTAPPEN"));
        Carro verde=new Carro(Carro.Color.VERDE, "5");
        verde.agregarConductor(new Conductor("C3","Sebastian", "sebastian@gmail.com", "VETTEL"));
        Carro blanco=new Carro(Carro.Color.BLANCO, "47");
        blanco.agregarConductor(new Conductor("C4","Mick", "mick@gmail.com", "SCHUMACHER"));

        juego.agregarCarroACarril(1,rojo);
        juego.agregarCarroACarril(2,azul);
        juego.agregarCarroACarril(3,verde);
        juego.agregarCarroACarril(1,blanco);

        Podium podium = juego.iniciarJuego();
        System.out.println(podium);




    }
}
