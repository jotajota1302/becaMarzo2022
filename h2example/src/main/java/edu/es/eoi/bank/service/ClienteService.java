package edu.es.eoi.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.bank.entity.Cliente;
import edu.es.eoi.bank.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente findByDni(String dni) {
		return clienteRepository.findById(dni).get();
	}

	public void remove(String nif) {
		clienteRepository.deleteById(nif);
	}
}
