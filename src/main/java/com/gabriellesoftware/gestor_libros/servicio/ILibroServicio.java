/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gabriellesoftware.gestor_libros.servicio;

import com.gabriellesoftware.gestor_libros.modelo.Libro;
import java.util.List;

/**
 *
 * @author Gabriel Orellana Vásquez.
 * 
 * Esta interface se utilizará como puente entre la capa de modelo y repositorio.
 * Se incluyen los métodos empleados para realizar consultas a la BBDD.
 * 
 *
 */
public interface ILibroServicio {
    
    public List <Libro> ListarLibros();
    
    public Libro buscarLibroPorId(Integer idLibro);
    
    public void guardarLibro(Libro libro);
    
    public void eliminarLibro(Libro libro);
    
}
