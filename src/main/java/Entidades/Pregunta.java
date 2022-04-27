package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta extends Jugador{
    private String pregunta;
    private String categoria;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    private String respuestaCorrecta;
    private String respuestaJugador;
    private int saldo;
    private String continuar;

    public Pregunta() {
    }

    public Pregunta( String pregunta, String categoria, String opcionA, String opcionB, String opcionC, String opcionD, String respuestaCorrecta) {

        this.pregunta = pregunta;
        this.categoria = categoria;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        this.respuestaCorrecta = respuestaCorrecta;
    }


    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(String opcionC) {
        this.opcionC = opcionC;
    }

    public String getOpcionD() {
        return opcionD;
    }

    public void setOpcionD(String opcionD) {
        this.opcionD = opcionD;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRespuestaJugador() {
        return respuestaJugador;
    }

    public void setRespuestaJugador(String respuestaJugador) {
        this.respuestaJugador = respuestaJugador;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getContinuar() {
        return continuar;
    }

    public void setContinuar(String continuar) {
        this.continuar = continuar;
    }

    public void sumarPuntos(){
        int acumulado = getSaldo();
        acumulado += 1000;
        setSaldo(acumulado);
    }


    public void realizarPregunta(Pregunta pregunta){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por un total de $1000 dolares seleccione la respuesta correcta");
        System.out.println("");
        System.out.println(pregunta.getPregunta()+" Esta pregunta pertenece a la categoría de: "+pregunta.getCategoria());

        System.out.println(pregunta.getOpcionA());
        System.out.println(pregunta.getOpcionB());
        System.out.println(pregunta.getOpcionC());
        System.out.println(pregunta.getOpcionD());

        pregunta.setRespuestaJugador(scanner.nextLine());

        if(pregunta.getRespuestaJugador().equals(pregunta.getRespuestaCorrecta())){
            System.out.println("** --Respuesta Correcta-- **");
           sumarPuntos();
        }else{
            System.out.println("** Respuesta es incorrecta, fin del juego **");
            System.exit(0);
        }
    }

    public int generarNumeroAleatorio(){
        int numeroAleatorio = (int)(Math.random()*4+0);
        return numeroAleatorio;
    }

    public void seguirJugando(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tienes un total de: "+ getSaldo() +" dólares");
        System.out.println("Si respondes de incorrecta alguna respuesta pierdes todo lo acumulado.");
        System.out.println("Si deseas continuar escribe: sí, si deseas retirarte escribe: no");
        setContinuar(scanner.next());
        if(getContinuar().equalsIgnoreCase("si")){
            System.out.println("Continuemos...");
        }else{
            System.out.println("El total acumulado es  de:" + getSaldo() + " dólares");
            System.exit(0);
        }
}


    public void primeraRonda(ArrayList<Pregunta> nivel1){
     realizarPregunta(nivel1.get(generarNumeroAleatorio()));
        if (getRespuestaJugador() == getRespuestaCorrecta()){
            seguirJugando();
            if(getRespuestaJugador() == getRespuestaCorrecta () & getContinuar().equalsIgnoreCase("no")){
                System.out.println("Opppsss, te has retirado del juego, tu acumulado es de "+ getAcumuladoPremio()+ " dolares");
            }
        }else {
            if(getRespuestaJugador() != getRespuestaCorrecta()){
                setSaldo(0);
                System.out.println("Juego finalizado");
            }
        }
    }

    public void segundaRonda(ArrayList<Pregunta> nivel2){
        realizarPregunta(nivel2.get(generarNumeroAleatorio()));
        if (getRespuestaJugador() == getRespuestaCorrecta()){
            seguirJugando();
            if(getRespuestaJugador() == getRespuestaCorrecta () & getContinuar().equalsIgnoreCase("no")){
                System.out.println("Ops, te has retirado del juego, tu acumulado es de "+ getAcumuladoPremio()+ " dolares");
            }
        }else {
            if(getRespuestaJugador() != getRespuestaCorrecta()){
                setSaldo(0);
                System.out.println("Juego finalizado");
            }
        }
    }

    public void terceraRonda(ArrayList<Pregunta> nivel3){
        realizarPregunta(nivel3.get(generarNumeroAleatorio()));
        if (getRespuestaJugador() == getRespuestaCorrecta()){
            seguirJugando();
            if(getRespuestaJugador() == getRespuestaCorrecta () & getContinuar().equalsIgnoreCase("no")){
                System.out.println("Opppsss, te has retirado del juego, tu acumulado es de "+ getAcumuladoPremio()+ " dolares");
            }
        }else {
            if(getRespuestaJugador() != getRespuestaCorrecta()){
                setSaldo(0);
                System.out.println("Juego finalizado");
            }
        }
    }

    public void cuartaRonda(ArrayList<Pregunta> nivel4){
        realizarPregunta(nivel4.get(generarNumeroAleatorio()));
        if (getRespuestaJugador() == getRespuestaCorrecta()){
            seguirJugando();
            if(getRespuestaJugador() == getRespuestaCorrecta () & getContinuar().equalsIgnoreCase("no")){
                System.out.println("Opppsss, te has retirado del juego, tu acumulado es de "+ getAcumuladoPremio()+ " dolares");
            }
        }else {
            if(getRespuestaJugador() != getRespuestaCorrecta()){
                setSaldo(0);
                System.out.println("Juego finalizado");
            }
        }
    }


    public void quintaRonda (ArrayList<Pregunta> nivel5){
        realizarPregunta(nivel5.get(generarNumeroAleatorio()));
        if(getRespuestaJugador() == getRespuestaCorrecta()){
                System.out.println("Felicidades, has ganado el juego");
            }
        else {
            if (getRespuestaJugador() != getRespuestaCorrecta()) {
                setSaldo(0);
                System.out.println("Juego finalizado");
            }
        }
    }

    public void mapPuntosToPremio(Jugador jugador){
        int acumuladoPremio;
        acumuladoPremio = getSaldo();
        jugador.setAcumuladoPremio(acumuladoPremio);
    }


}


