package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Employe;


public interface EmployeRepository extends CrudRepository<Employe, Integer>  {
	
	

}
