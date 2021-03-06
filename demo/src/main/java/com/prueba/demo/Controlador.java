package com.prueba.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controlador {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	@ResponseBody
	public List<Usuario> obtenerUsuarios() {
		return usuarioRepositorio.findAll();
	}

}
