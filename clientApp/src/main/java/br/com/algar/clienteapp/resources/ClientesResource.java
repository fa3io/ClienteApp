package br.com.algar.clienteapp.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.algar.clienteapp.model.domain.Cliente;
import br.com.algar.clienteapp.model.service.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClientesResource {
	
	@Autowired
	ClienteService service;
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void salvar(@RequestBody Cliente cliente) {
		service.salvar(cliente);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)	
	public List<Cliente> getAll(){
		return service.getAll();
	}

}
