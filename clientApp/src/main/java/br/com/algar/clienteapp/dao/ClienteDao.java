package br.com.algar.clienteapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.algar.clienteapp.model.domain.Cliente;

@Component
public class ClienteDao {
	
	List<Cliente> clientes = new ArrayList<>();
	
	public void salvar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> getAll(){
		return clientes;
	}

}
