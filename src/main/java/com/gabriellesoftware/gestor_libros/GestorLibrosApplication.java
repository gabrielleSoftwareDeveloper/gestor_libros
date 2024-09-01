package com.gabriellesoftware.gestor_libros;

import com.gabriellesoftware.gestor_libros.vista.LibroForm;
import java.awt.EventQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GestorLibrosApplication {

	public static void main(String[] args) { //Creación del contexto.
            ConfigurableApplicationContext contextoSpring =  
                        new SpringApplicationBuilder(GestorLibrosApplication.class) //Creación de un nuevo objeto
                            .headless(false) //No será una app web.
                            .web(WebApplicationType.NONE)
                            .run(args);
            //Solicita una instancia del formulario
            EventQueue.invokeLater(()->{ //Se invoca el formulario mediante Swing.
                //Obtención del objeto form a través de Spring.
                LibroForm libroForm = contextoSpring.getBean(LibroForm.class); //Posible gracias a la adición de @Component en LibroForm.java 
                libroForm.setVisible(true);
                
            });
	}
        
}
