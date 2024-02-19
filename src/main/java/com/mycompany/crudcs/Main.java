/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crudcs;

/**
 *
 * @author pipe2
 */

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué operación deseas realizar? (crear/leer/actualizar/eliminar)");
        String operacion = scanner.nextLine();

        System.out.println("¿Qué entidad deseas manipular? (progreso/tarjeta/pago)");
        String entidad = scanner.nextLine();

        AbstractDAO dao;
        if (entidad.equals("progreso")) {
            dao = new DatabaseDAO<ProgresoMeta>();
        } else if (entidad.equals("tarjeta")) {
            dao = new DatabaseDAO<TarjetaCredito>();
        } else if (entidad.equals("pago")) {
            dao = new DatabaseDAO<PagoTarjeta>();
        } else {
            System.out.println("Entidad no válida");
            return;
        }

        if (operacion.equals("crear")) {
            if (entidad.equals("progreso")) {
                System.out.println("Ingrese el GoalID:");
                int goalID = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese el Monto Acumulado:");
                BigDecimal montoAcumulado = new BigDecimal(scanner.nextLine());
                System.out.println("Ingrese la Fecha de Actualización (en formato YYYY-MM-DD):");
                Date fechaActualizacion = Date.valueOf(scanner.nextLine());

                ProgresoMeta progreso = new ProgresoMeta(goalID, montoAcumulado, fechaActualizacion);
                dao.create(progreso);
            } else if (entidad.equals("tarjeta")) {
                // Código para crear una nueva tarjeta de crédito
            } else if (entidad.equals("pago")) {
                // Código para crear un nuevo pago de tarjeta
            }
        } else if (operacion.equals("leer")) {
            // Código para leer una entidad
        } else if (operacion.equals("actualizar")) {
            // Código para actualizar una entidad
        } else if (operacion.equals("eliminar")) {
            // Código para eliminar una entidad
        } else {
            System.out.println("Operación no válida");
        }

        scanner.close();
    }
}
      
