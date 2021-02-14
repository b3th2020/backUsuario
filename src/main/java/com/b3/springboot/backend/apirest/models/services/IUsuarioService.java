package com.b3.springboot.backend.apirest.models.services;

import java.util.List;

import com.b3.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	
	public Usuario findById (Long id);
	
	public Usuario save (Usuario usuario);
	
	public void delete (Long id);
	
}
