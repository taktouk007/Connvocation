package com.fr.adaming.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fr.adaming.entities.Epreuve;


@RepositoryRestResource
public interface IEpreuveRepo extends JpaRepository<Epreuve, Long>{

}
