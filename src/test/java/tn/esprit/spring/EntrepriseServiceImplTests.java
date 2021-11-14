package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTests{
	
	
	@Autowired
	IEntrepriseService entrepriseService;
	
	@Test
	public void testContextLoads() throws ParseException {
		Entreprise e = new Entreprise("dali","dali");
		Entreprise entrepriseAdded = entrepriseService.addEntreprise(e);
		Assertions.assertEquals(e.getName(),entrepriseAdded.getName());
	}

	
}