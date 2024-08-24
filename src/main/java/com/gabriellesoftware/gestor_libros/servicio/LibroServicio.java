/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriellesoftware.gestor_libros.servicio;

import com.gabriellesoftware.gestor_libros.modelo.Libro;
import com.gabriellesoftware.gestor_libros.repositorio.LibroRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
    * @author Gabriel Orellana Vásquez.
    * 
    * Con implements agregamos todos los métodos asociados a ILibroServicio.
 */
@Service //Necesaria para delplegar la app.
public class LibroServicio implements ILibroServicio{

    //El atributo libroRepositorio será inyectado con autowired.
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    @Override
    public List<Libro> ListarLibros() {
        return libroRepositorio.findAll(); // Nos mostrará todos los libros gracias a Spring.
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null); // Nos mostrará un solo libro si lo encuentra, en caso de que no (.orElse()) devolverá null.
        return libro;
    }

    @Override
    public void guardarLibro(Libro libro) {
        libroRepositorio.save(libro); // Se guardará el libro, de manera automática identifica si debe hacerse un INSERT o un UPDATE.
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepositorio.delete(libro); // Se elimina el objeto completo (también podría usarse deleteById()¿?.
    }
    
}
