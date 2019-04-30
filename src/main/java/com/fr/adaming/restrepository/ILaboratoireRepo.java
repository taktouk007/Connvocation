package com.fr.adaming.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fr.adaming.entities.Laboratoire;

@RepositoryRestResource
public interface ILaboratoireRepo extends JpaRepository<Laboratoire, Long > {

}
