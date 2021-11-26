package com.silverlink.entidades;

public class Notificador {
    private byte idNotificador;
    private String nomNotificador;

//    public Notificador(byte idNotificador){
//        this.idNotificador = idNotificador;
//        this.nomNotificador = new Datasource().getNotificador(idNotificador);
//    }

    public Notificador(byte idNotificador, String nomNotificador) {
        this.idNotificador = idNotificador;
        this.nomNotificador = nomNotificador;
    }

    public byte getIdNotificador() {
        return idNotificador;
    }

    public void setIdNotificador(byte idNotificador) {
        this.idNotificador = idNotificador;
    }

    public String getNomNotificador() {
        return nomNotificador;
    }

    public void setNomNotificador(String nomNotificador) {
        this.nomNotificador = nomNotificador;
    }
}
