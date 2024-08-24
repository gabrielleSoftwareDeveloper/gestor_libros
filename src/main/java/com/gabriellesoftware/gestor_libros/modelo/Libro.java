/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriellesoftware.gestor_libros.modelo;

//Creación de la tabla perteneciente a Libro.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

/**
 *
 * @author Gabriel Orellana Vásquez.
 * Las tablas creadas aparecerán en orden alfabético, para ordenarlas se deberá utilizar el gestor de BBBDD.
 */
public class Libro { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idLibro;
    String nombreLibro;
    String autor;
    Double precio;
    Integer existencias;
}
