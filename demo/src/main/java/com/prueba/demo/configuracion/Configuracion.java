package com.prueba.demo.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prueba.demo.UsuarioRepositorio;

@Configuration
public class Configuracion {

	@Bean
	public UsuarioRepositorio crearPersonaDAO() {
		return new UsuarioRepositorio();
	}
}
