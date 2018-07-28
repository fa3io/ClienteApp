package br.com.algar.clienteapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.algar.clienteapp.dao.ClienteDao;
import br.com.algar.clienteapp.exception.CPFValidationException;
import br.com.algar.clienteapp.model.domain.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDao dao;
	
	public void salvar(Cliente cliente) {
		if (cliente.getCpf().length() < 11) {
			throw new CPFValidationException("Erro na validação do cpf!");
		} else {
			dao.salvar(cliente);
		}
	}
	
	
	public List<Cliente> getAll(){
		return dao.getAll();
	}

}
