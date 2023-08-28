/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupergiro;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class Giro {

    private Double Monto;
    private Date Fecha;
    private String Estado;
    private Double Comision;
    private Date FechaEntrega = null;
    private String Destinatario;

    public Giro(double Monto, String Destinatario, Date Fecha, String Estado, Date FechaEntrega) {
        this.Fecha = Fecha;
        this.Destinatario = Destinatario;
        this.Monto = Monto;
        this.Estado = Estado;
        FechaEntrega = null;
    }

    public Giro() {
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Double getComision() {
        return Comision;
    }

    public void setComision(Double Comision) {
        this.Comision = Comision;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
