package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTests{
	
	
	@Autowired
	IEntrepriseService entrepriseService;
	
	public void testRetrieveAllEntreprise() {
		List<Entreprise> ListeEntreprise = entrepriseService.retrieveAllEntreprise();
		Assertions.assertEquals(4, ListeEntreprise.size());
		
	} 
	@Test
	public void testAddEntreprise() throws ParseException {
		Entreprise e = new Entreprise("dali","dali");
		Entreprise entrepriseAdded = entrepriseService.addEntreprise(e);
		Assertions.assertEquals(e.getName(),entrepriseAdded.getName());
	}
	
	@Test
	public void testUpdateEntreprise() throws ParseException{
		Entreprise e = new Entreprise(2,"Dali","Dali");
		Entreprise entrUpdated = entrepriseService.updateEntreprise(e);
		Assertions.assertEquals(e.getName(),entrUpdated.getName());

	}
	
	@Test
	public void testDeleteEntreprise(){
		entrepriseService.deleteEntreprise(3);
		Optional<Entreprise> e = entrepriseService.getEntreprise(4);
		Assertions.assertTrue(!e.isPresent());
	}
		//Assertions.assertNull(entrepriseService.retrieveEntreprise(9));
		
	
	
	@Test
	public void testRetrieveEntreprise(){
		Entreprise entrepriseRetrieved = entrepriseService.retrieveEntreprise(2);
		Assertions.assertEquals(2, entrepriseRetrieved.getId());
		
	}

	
}