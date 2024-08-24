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

	public static void main(String[] args) {
            ConfigurableApplicationContext contextoSpring =  
                        new SpringApplicationBuilder(GestorLibrosApplication.class)
                            .headless(false)
                            .web(WebApplicationType.NONE)
                            .run(args);
//Solicita una instancia del formulario
            EventQueue.invokeLater(()->{
                //Obtención del objeto form a través de Spring.
                LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
                libroForm.setVisible(true);
                
            });
	}
        
}
