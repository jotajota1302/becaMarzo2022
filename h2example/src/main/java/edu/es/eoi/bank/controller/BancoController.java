package edu.es.eoi.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.bank.dto.BancoDto;
import edu.es.eoi.bank.service.BancoService;

@SuppressWarnings("rawtypes")
@RestController
public class BancoController {
	
	@Autowired
	BancoService service;	
	
	@GetMapping("/banco/{id}")
	public ResponseEntity<BancoDto> findBanco(@PathVariable Integer id) {
		
		return new ResponseEntity<BancoDto>(service.findById(id),HttpStatus.OK);
	}

	
	@PostMapping("/banco")
	public ResponseEntity createBanco(@RequestBody BancoDto banco) {
		
		service.save(banco);
		
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/banco/{id}")
	public ResponseEntity createBanco(@RequestBody BancoDto banco,@PathVariable Integer id) {
		
		if(id!=banco.getId()) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}else {
			service.update(banco);
			
			return new ResponseEntity(HttpStatus.ACCEPTED);
		}			
		
	}

	@DeleteMapping("/banco/{id}")
	public ResponseEntity deleteBanco(@PathVariable Integer id) {
		
		service.remove(id);
		
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@GetMapping("/banco")	
	public List<BancoDto> findAll() {			
		return service.findAll();
	}

}