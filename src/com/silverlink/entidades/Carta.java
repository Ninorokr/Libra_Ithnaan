package com.silverlink.entidades;

import java.time.LocalDate;

public class Carta {
    private String idCarta;
    private LocalDate fecEmision;
    private String nomCliente;
    private String dirCliente;
    private byte idDistrito;
    private LocalDate fecIngresoLSFOtros;
    private byte idNotificador;
    private LocalDate fecEntregaCliente;
    private byte idModEntregaCliente;
    private String observacion;

    public String getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(String idCarta) {
        this.idCarta = idCarta;
    }

    public LocalDate getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(LocalDate fecEmision) {
        this.fecEmision = fecEmision;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public byte getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(byte idDistrito) {
        this.idDistrito = idDistrito;
    }

    public LocalDate getFecIngresoLSFOtros() {
        return fecIngresoLSFOtros;
    }

    public void setFecIngresoLSFOtros(LocalDate fecIngresoLSFOtros) {
        this.fecIngresoLSFOtros = fecIngresoLSFOtros;
    }

    public byte getIdNotificador() {
        return idNotificador;
    }

    public void setIdNotificador(byte idNotificador) {
        this.idNotificador = idNotificador;
    }

    public LocalDate getFecEntregaCliente() {
        return fecEntregaCliente;
    }

    public void setFecEntregaCliente(LocalDate fecEntregaCliente) {
        this.fecEntregaCliente = fecEntregaCliente;
    }

    public byte getIdModEntregaCliente() {
        return idModEntregaCliente;
    }

    public void setIdModEntregaCliente(byte idModEntregaCliente) {
        this.idModEntregaCliente = idModEntregaCliente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}


