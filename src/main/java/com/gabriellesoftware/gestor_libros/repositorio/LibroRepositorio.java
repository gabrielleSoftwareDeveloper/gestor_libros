/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gabriellesoftware.gestor_libros.repositorio;
import com.gabriellesoftware.gestor_libros.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gabriel Orellana Vásquez.
 * 
 * Se utiliza extends JpaRepository<> para para poder agregar, seleccionar, eliminar o acceder a otras formas de consulta. 
 * 
 * <Clase de entidad y el tipo de la clase primaria (Integer)>
 */
public interface LibroRepositorio extends JpaRepository<Libro, Integer> {
    
}
