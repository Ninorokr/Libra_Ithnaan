package com.silverlink.entidades;

import java.time.LocalDate;

public class CartaBalance extends Carta{
    private int nroCarta;
    private short nroGrupoCorrelativoCNR;
    private int nroCliente;
    private int nroNotif;
    private LocalDate fecNotif;
    private short plazoVecCarta;
    private byte idTipoCNR;
    private double monto;
    private String obsGestor;

    public int getNroCarta() {
        return nroCarta;
    }

    public void setNroCarta(int nroCarta) {
        this.nroCarta = nroCarta;
    }

    public short getNroGrupoCorrelativoCNR() {
        return nroGrupoCorrelativoCNR;
    }

    public void setNroGrupoCorrelativoCNR(short nroGrupoCorrelativoCNR) {
        this.nroGrupoCorrelativoCNR = nroGrupoCorrelativoCNR;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public int getNroNotif() {
        return nroNotif;
    }

    public void setNroNotif(int nroNotif) {
        this.nroNotif = nroNotif;
    }

    public LocalDate getFecNotif() {
        return fecNotif;
    }

    public void setFecNotif(LocalDate fecNotif) {
        this.fecNotif = fecNotif;
    }

    public short getPlazoVecCarta() {
        return plazoVecCarta;
    }

    public void setPlazoVecCarta(short plazoVecCarta) {
        this.plazoVecCarta = plazoVecCarta;
    }

    public byte getIdTipoCNR() {
        return idTipoCNR;
    }

    public void setIdTipoCNR(byte idTipoCNR) {
        this.idTipoCNR = idTipoCNR;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getObsGestor() {
        return obsGestor;
    }

    public void setObsGestor(String obsGestor) {
        this.obsGestor = obsGestor;
    }
}
