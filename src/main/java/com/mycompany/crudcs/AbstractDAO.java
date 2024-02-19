/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pipe2
 */
public abstract class AbstractDAO<T> implements CRUD<T> {
    protected Connection connection;

    public AbstractDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_cs", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(T entity) {
        // Implementa la lógica para crear un nuevo registro en la base de datos
        // Puedes utilizar la conexión a la base de datos para ejecutar consultas SQL
    }

    @Override
    public T read(int id) {
        // Implementa la lógica para leer un registro de la base de datos
        // Puedes utilizar la conexión a la base de datos para ejecutar consultas SQL
        return null;
    }

    @Override
    public void update(T entity) {
        // Implementa la lógica para actualizar un registro en la base de datos
        // Puedes utilizar la conexión a la base de datos para ejecutar consultas SQL
    }

    @Override
    public void delete(int id) {
        // Implementa la lógica para eliminar un registro de la base de datos
        // Puedes utilizar la conexión a la base de datos para ejecutar consultas SQL
    }
    
    public void createTarjetaCredito(TarjetaCredito tarjeta) {
        // Implementa la lógica para crear una tarjeta de crédito en la base de datos
    }

    public void createPagoTarjeta(PagoTarjeta pago) {
        // Implementa la lógica para crear un pago de tarjeta en la base de datos
    }
    
    public void createProgresoMeta(ProgresoMeta progreso) {
        // Implementa la lógica para crear un pago de tarjeta en la base de datos
    }
    
}


