package edu.es.eoi.springdatademo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdatademoApplicationTests {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	BancoRepository bancoRepository;
	
	@Autowired
	CuentaRepository cuentaRepository;
	
	@Autowired
	Entidad1Repository entidad1Repository;
	
	@Test
	void contextLoads() {
		
//		System.out.println(clienteRepository.findAll());		
//		System.out.println(bancoRepository.findAll());
//		System.out.println(cuentaRepository.findAll());
//				
//		Banco banco=new Banco();
//		banco.setCiudad("Madrid");
//		banco.setNombre("BBVA");
//		
//		bancoRepository.save(banco);
//			
//		System.out.println(banco);
//
//		Cuenta cuenta= new Cuenta();
//		Banco bank=bancoRepository.findById(1).get();
//		Cliente client=clienteRepository.findById("12334467").get();
//		
//		cuenta.setBanco(bank);
//		cuenta.setCliente(client);
//		cuenta.setSaldo(2000);
//		
////		cuentaRepository.save(cuenta);
//		
//		System.out.println(cuenta);
//		
//		//consultar los clientes que tiene un banco
//	
//		for (Cuenta tmp : bank.getCuentas()) {
//			if(tmp.getCliente().getNombre().equals("Jose")) {
//				System.out.println("tiene " + tmp.getSaldo());
//			}
//		}		
		
		Optional<Entidad1> resultado = entidad1Repository.findById(2);
					
		System.out.println(resultado.isPresent());
	}

}
