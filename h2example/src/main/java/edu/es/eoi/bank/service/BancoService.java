package edu.es.eoi.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.bank.dto.BancoDto;
import edu.es.eoi.bank.entity.Banco;
import edu.es.eoi.bank.repository.BancoRepository;

@Service
public class BancoService {

	@Autowired
	private BancoRepository bancoRepository;

	public void save(BancoDto banco) {
		
		Banco entity = new Banco();  
		BeanUtils.copyProperties(banco,entity);
		
		bancoRepository.save(entity);
	}
	
	public void update(BancoDto banco) {
		
		Banco entity = new Banco();  
		BeanUtils.copyProperties(banco,entity);
		
		bancoRepository.save(entity);
	}

	public List<BancoDto> findAll() {
		
		List<BancoDto> bancos= new ArrayList<BancoDto>();
		
		for (Banco banco : bancoRepository.findAll()) {
			
			BancoDto dto= new BancoDto();
			BeanUtils.copyProperties(banco, dto);			
			bancos.add(dto);
		}
		
		return bancos;
	}	
	
	public BancoDto findById(int id) {		
		
		Banco banco=bancoRepository.findById(id).get();	
		
		BancoDto dto= new BancoDto();
		dto.setCiudad(banco.getCiudad());
		dto.setNombre(banco.getNombre());
		dto.setId(banco.getId());
				
		return dto;
	}

	public void remove(int id) {
		
		bancoRepository.deleteById(id);		
		
	}
}
