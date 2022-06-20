package com.formacionspring.apirest.service;

import java.util.List;

import com.formacionspring.apirest.entity.Cliente;

public interface ClienteService {

	//metodo para mostrar todos los clientes
	public List<Cliente> mostrarTodos();
	//metodo para mostrar un clinete por id
	public Cliente mostrarPorId(Long id);
	//Metodo para guardar un cliente
	public Cliente guardar(Cliente cliente);
	//metodo para borrar un cliente
	public void borrar(Long id);
}
