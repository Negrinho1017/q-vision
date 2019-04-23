package com.prueba.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioRepositorio {

	@Autowired
	UsuarioDAO usuarioDAO;
	
	public List<Usuario> findAll() {
		return usuarioDAO.findAll();
	}
}
