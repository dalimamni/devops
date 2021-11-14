package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;


public interface IEntrepriseService {
	List<Entreprise> retrieveAllEntreprise(); 
	Entreprise addEntreprise(Entreprise a);
	void deleteEntreprise(long id);
	Entreprise updateEntreprise(Entreprise a);
	Entreprise retrieveEntreprise(long id);

}