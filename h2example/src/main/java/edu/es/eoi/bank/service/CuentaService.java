package edu.es.eoi.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.bank.dto.CuentaAltaDto;
import edu.es.eoi.bank.entity.Banco;
import edu.es.eoi.bank.entity.Cliente;
import edu.es.eoi.bank.entity.Cuenta;
import edu.es.eoi.bank.repository.BancoRepository;
import edu.es.eoi.bank.repository.ClienteRepository;
import edu.es.eoi.bank.repository.CuentaRepository;

@Service
public class CuentaService {

	@Autowired
	private CuentaRepository cuentaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private BancoRepository bancoRepository;
	
	public void save(CuentaAltaDto cuenta) {
		
		//logica negocio
		
		Banco banco=bancoRepository.findById(cuenta.getBanco()).get();		
		
		Cliente cliente= clienteRepository.findById(cuenta.getCliente()).get();
		
		Cuenta tmp= new Cuenta();
		tmp.setBanco(banco);
		tmp.setCliente(cliente);
		
		cuentaRepository.save(tmp);
	}

	public List<Cuenta> findAll() {
		return cuentaRepository.findAll();
	}

	public Cuenta findById(int id) {
		return cuentaRepository.findById(id).get();
	}

	public void remove(int id) {
		cuentaRepository.deleteById(id);		
	}
}
