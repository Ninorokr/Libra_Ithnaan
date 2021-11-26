package com.silverlink.entidades;

public class Distrito implements Comparable<Distrito>{
    private byte idDistrito;
    private String nomDistrito;
    private byte idProvincia;

    public Distrito(byte idDistrito, String nomDistrito, byte idProvincia){
        this.idDistrito = idDistrito;
        this.nomDistrito = nomDistrito;
        this.idProvincia = idProvincia;
    }

//    public Distrito(byte idDistrito){
//        this.idDistrito = idDistrito;
//        this.idProvincia = new Datasource().getProvincia(idDistrito);
//    }

    public String getNomDistrito() {
        return nomDistrito;
    }

    public byte getIdDistrito() {
        return idDistrito;
    }

    public byte getIdDistritoByNombre(String supuestoNombre) {
        if(supuestoNombre.equals(nomDistrito))
            return idDistrito;
        return 0;
    }

    public byte getIdProvincia() {
        return idProvincia;
    }

    @Override
    public String toString() {
        return nomDistrito + " | " + idDistrito;
    }

    @Override
    public int compareTo(Distrito distrito) {
//        if(this.nombreDistrito.equals(distrito.getNombreDistrito()))
//            return 0;
        return this.nomDistrito.compareTo(distrito.getNomDistrito());
    }
}
