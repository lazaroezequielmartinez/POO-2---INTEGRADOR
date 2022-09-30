package com.poo2integrador.minerva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/* Se debe arreglar las rutas para las pantallas*/
/* El metodo main no ejecuta las pantallas de cada rol, arreglar */
/* Para especificar donde se encuentra nuestros componentes (carpetas o directorios)
 * y para ello puedo utilizar @ComponentScan y para especificar a la app que nos debe
 * devolver las vistas correspondientes se puede utilizar el metodo ViewResolver
 */

@Configuration
@EnableWebMvc
@SpringBootApplication
@ComponentScan(basePackages = "com.poo2integrador.minerva.Servicios")
public class MinervaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinervaApplication.class, args);
	}

	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("src/main/webapp/WEB-INF/vistas/");

		viewResolver.setSuffix(".jsp");

		return viewResolver;

	}

}

/*
 * @SpringBootApplication
 * public class MinervaApplication {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(MinervaApplication.class, args);
 * }
 * 
 * }
 */