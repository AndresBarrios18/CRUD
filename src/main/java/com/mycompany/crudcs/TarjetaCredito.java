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

public class TarjetaCredito {
    private int cardID;
    private int userID;
    private BigDecimal limiteCredito;
    private BigDecimal saldoActual;

    // Constructor
    public TarjetaCredito(int cardID, int userID, BigDecimal limiteCredito, BigDecimal saldoActual) {
        this.cardID = cardID;
        this.userID = userID;
        this.limiteCredito = limiteCredito;
        this.saldoActual = saldoActual;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    
}
