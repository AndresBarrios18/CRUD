/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;

/**
 *
 * @author pipe2
 */
import java.math.BigDecimal;
import java.sql.Date;

public class PagoTarjeta {
    private int paymentID;
    private int cardID;
    private BigDecimal montoPagado;
    private Date fechaPago;

    // Constructor
    public PagoTarjeta(int paymentID, int cardID, BigDecimal montoPagado, Date fechaPago) {
        this.paymentID = paymentID;
        this.cardID = cardID;
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

   
}

