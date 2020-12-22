package iit.web.g1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import iit.web.g1.dao.editionRepository;
import iit.web.g1.entities.editions;
import iit.web.g1.entities.registers;
import iit.web.g1.service.editionRestService;

@SpringBootApplication
public class IndustrieApplication {
//@Autowired
//private static editionRepository service;
	public static void main(String[] args) {
		SpringApplication.run(IndustrieApplication.class, args);
		
	}
	
	

}

